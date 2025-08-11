import java.util.Scanner;


class PasswordChecker {
    String password;
    boolean hasLetter;
    boolean hasDigit;

    PasswordChecker(String password) {
        this.password = password;
        this.hasLetter = false;
        this.hasDigit = false;
    }

    
    void checkStrength() {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (password.length() >= 8 && hasLetter && hasDigit) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}

public class week_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String pwd = input.nextLine();

        // Create object and call method
        PasswordChecker checker = new PasswordChecker(pwd);
        checker.checkStrength();

        input.close();
    }
}
