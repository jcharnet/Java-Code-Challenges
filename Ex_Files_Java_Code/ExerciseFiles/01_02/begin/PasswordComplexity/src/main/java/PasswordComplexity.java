import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {
        String regExp = new StringBuffer()
            .append(getNumberRegExp())
            .append(getLowerCaseRegExp())
            .append(getUpperCaseRegExp())
            .append(getMinimumLengthRegExp()).toString();
        
        return password.matches(regExp);

        /*return hasMinimumLength(password) && 
        hasOneUpperCaseLetter(password) &&
        hasOneLowerCaseLetter(password) &&
        hasOneNumber(password);
        */
    }

    private static String getMinimumLengthRegExp() {
        return ".{6,}";
    }
    
    private static String getUpperCaseRegExp() {
        return "(?=.*[A-Z])";
    }

    private static String getLowerCaseRegExp() {
        return "(?=.*[a-z])";
    }

    private static String getNumberRegExp() {
        return "(?=.*[\\d])";
    }

    private static boolean hasMinimumLength(String password) {
        return password.length() >= 6;
    }

    private static boolean hasOneUpperCaseLetter(String password) {
        return password.matches(".*[A-Z].*");
    }

    private static boolean hasOneLowerCaseLetter(String password) {
        return password.matches(".*[a-z].*");
    }

    private static boolean hasOneNumber(String password) {
        return password.matches(".*[0-9].*");
    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplex(userInput));
    }
}
