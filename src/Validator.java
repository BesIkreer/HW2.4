import java.util.Objects;

public class Validator {

    private Validator() {
    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (Objects.isNull(login) || login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть меньше или равна 20.");
        }
        if (Objects.isNull(password) || password.length() >= 20) {
            throw new WrongPasswordException("Пароль должен быть меньше 20.");
        }

        Checker checker = new LoopChecker();

        if (!checker.isValid(login)) {
            throw new WrongLoginException("Логин содержит некорректные символы.");
        }
        if (!checker.isValid(password)) {
            throw new WrongPasswordException("Пароль содержит некорректные символы.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать.");
        }
    }
}

