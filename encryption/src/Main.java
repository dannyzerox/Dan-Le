import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        String userChoice;
        userChoice = userinput.nextLine();
        int y = 0;
        int x = 0;
        String completed = null;
        ArrayList encrypt = new ArrayList();
        ArrayList unencrypt = new ArrayList();

        while (y < encrypt.size()) {
            Object num = encrypt.get(y);
            String n = Character.toString((char) (int)num);
            unencrypt.add(n);
            y++;
            System.out.println(encrypt);

            while (x < userChoice.length()) {
                char a = userChoice.charAt(x);
                x++;
                int m = (int) a;
                encrypt.add(m);
            }
        }
        System.out.println(completed);}}
