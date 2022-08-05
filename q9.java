package RecordPrograms;
import java.util.Scanner;
class q9
{
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter month number: ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        
        int febday;
        if (y % 400 == 0) febday = 29;
        else if (y % 100 == 0) febday = 28;
        else if (y % 4 == 0) febday = 29;
        else febday = 28;
        
        int yd = d;
        switch (m) {
            case 12: yd += 30;
            case 11: yd += 31;
            case 10: yd += 30;
            case 9: yd += 31;
            case 8: yd += 31;
            case 7: yd += 30;
            case 6: yd += 31;
            case 5: yd += 30;
            case 4: yd += 31;
            case 3: yd += febday;
            case 2: yd += 31;
            case 1: break;
            default: 
                System.out.println("Illegal month number");
                System.exit(0);
        }
        
        System.out.println("Day of the year is " + yd);
    }
}
