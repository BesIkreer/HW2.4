public class LoopChecker implements Checker {

    private static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    @Override
    public boolean isValid(String s) {
       char[] chars = s.toCharArray();
       for (char sumbol : chars) {
            if(!ALLOWED_CHARACTERS.contains(Character.toString(sumbol))) {
                return false;
            }
        }
        return true;
    }

}
