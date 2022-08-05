package RecordPrograms;
import java.util.Scanner;
class q1
{
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 14 digits");
        String str = sc.nextLine();
        if (str.length() != 14) {
            System.out.println("Length is not 14");
            System.exit(0);
        }
        for (int i = 0; i < 14; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.println("Not a number");
                System.exit(0);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < 14; i++) {
            if (i % 2 == 0) sum += (int)(str.charAt(i) - 48);
            else sum += (2 * ((int)(str.charAt(i) - 48))) % 9;
        }
        System.out.println("Check digit: " + ((9 * sum) % 10));
    }
}
