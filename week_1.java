import java.util.Scanner;

public class week_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String password;
        boolean hasLetter = false;
        boolean hasDigit = false;

      
        System.out.print("Enter your password: ");
        password = input.nextLine();

        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        
        if (password.length() >= 8 && hasLetter && hasDigit) {
            System.out.println("Strong Password ");
        } else {
            System.out.println("Weak Password ");
        }

        input.close();
    }
}
