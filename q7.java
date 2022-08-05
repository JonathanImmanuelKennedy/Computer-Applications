package RecordPrograms;
import java.util.Scanner;
class q7 {
    static void bits (int n, String prefix, int bitsl, int bitsr, String suffix) {
        if (n == 0) {
            System.out.println(prefix + suffix);
            return;
        }
        
        if (bitsl < n && bitsr < n && bitsl >= 0 && bitsr >= 0) {
            bits (n-1, prefix + "0", bitsl, bitsr, "0" + suffix) ;
        }
        if (bitsl <= n && bitsr <= n && bitsl > 0 && bitsr > 0) {
            bits (n-1, prefix + "1", bitsl - 1, bitsr - 1, "1" + suffix) ;
        }
        if (bitsl < n && bitsr <= n && bitsl >= 0 && bitsr > 0) {
            bits (n-1, prefix + "0", bitsl, bitsr - 1, "1" + suffix) ;
        }
        if (bitsl <= n && bitsr < n && bitsl > 0 && bitsr >= 0) {
            bits (n-1, prefix + "1", bitsl - 1, bitsr, "0" + suffix) ;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter N value = ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            bits(N, "", i, i, "");
        }
    }
}
