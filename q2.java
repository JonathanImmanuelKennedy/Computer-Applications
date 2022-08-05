package RecordPrograms;
import java.util.Scanner;
class q2
{
    static boolean keith (int n) {
        if (n == 0) {
            return true;
        }
        
        int num = n; //num is temporary n
        int[] seq = new int[("" + num).length()];
        for (int i = 0; i < seq.length; i++) {
            seq[seq.length-i-1] = num % 10;
            num /= 10;
        }
        
        while (true) {
            int sum = 0;
            for (int i = 0; i < seq.length; i++) sum += seq[i];
            if (sum > n) return false;
            else if (sum == n) return true;
            else {
                for (int i = 0; i < seq.length - 1; i++) {
                    seq[i] = seq[i+1];
                }
                seq[seq.length-1] = sum;
            }
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (keith(n)) System.out.println("Keith");
        else System.out.println("Not keith");
    }
}
