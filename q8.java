package RecordPrograms;
import java.util.Scanner;
class q8 {
    static void bits (int n, String prefix, int bitsl, int bitsr, String suffix, String midbit) {
        if (n == 0) {
            System.out.println(prefix + midbit + suffix);
            return;
        }
        
        if (bitsl < n && bitsr < n && bitsl >= 0 && bitsr >= 0) {
            bits (n-1, prefix + "0", bitsl, bitsr, "0" + suffix, midbit) ;
        }
        if (bitsl <= n && bitsr <= n && bitsl > 0 && bitsr > 0) {
            bits (n-1, prefix + "1", bitsl - 1, bitsr - 1, "1" + suffix, midbit) ;
        }
        if (bitsl < n && bitsr <= n && bitsl >= 0 && bitsr > 0) {
            bits (n-1, prefix + "0", bitsl, bitsr - 1, "1" + suffix, midbit) ;
        }
        if (bitsl <= n && bitsr < n && bitsl > 0 && bitsr >= 0) {
            bits (n-1, prefix + "1", bitsl - 1, bitsr, "0" + suffix, midbit) ;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter N value = ");
        int N = sc.nextInt();
        if (N % 2 == 0) {
            for (int i = 0; i < N/2; i++) {
                bits(N/2, "", i, i, "", "");
            }
        } else {
            for (int i = 0; i < (N-1)/2; i++) {
                bits((N-1)/2, "", i, i, "", "0");
            }
            for (int i = 0; i < (N-1)/2; i++) {
                bits((N-1)/2, "", i, i, "", "1");
            }
        }
    }
}
