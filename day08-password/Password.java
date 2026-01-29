public class Password {
    private String password;

    public Password(String password) {

        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password must be a minimum of 8 characters long.");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be a minimum of 8 characters long.");
        }

        char[] chars = password.toCharArray();

        boolean hasUpper = false;
        boolean hasDigit = false;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != Character.toLowerCase(chars[i])) {
                hasUpper = true;
            }
            if (Character.isDigit(chars[i])) {
                hasDigit = true;
            }
            
        }

        if (!hasUpper) {
            throw new IllegalArgumentException("Password must contain at least 1 uppercase letter.");
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password must contain at least 1 digit.");
        }

        this.password = password;
    }

    public boolean equalsPassword(String s) {
        return s != null && s.equals(password);
    }
}
