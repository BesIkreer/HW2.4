public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("Tekst_543211", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Логиин и пароль корректны.");
        }
    }
}