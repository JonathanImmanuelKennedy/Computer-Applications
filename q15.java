package RecordPrograms;
import java.util.Scanner;
class q15
{
    int a;
    int b;
    int hcf;
    int lcm;
    q15() {
        a = 0;
        b = 0;
        hcf = 0;
        lcm = 0;
    }
    void getdata() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first value: ");
        a = sc.nextInt();
        System.out.print("Enter second value: ");
        b = sc.nextInt();
    }
    void change() {
        if (a > b) {
            int swap = b;
            b = a;
            a = swap;
        }
    }
    int hcf (int n1, int n2) {
        if (n1 == n2) return n1;
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) n1 %= n2;
            else n2 %= n1;
        }
        return (n1 + n2);
    }
    int lcm (int n1, int n2, int hcf) {
        return (n1 * n2 / hcf(n1,n2));
    }
    void result() {
        System.out.println("HCF: " + hcf(a,b));
        System.out.println("LCM: " + lcm(a,b,hcf(a,b)));
    }
    public static void main (String args[]) {
        q15 obj = new q15();
        obj.getdata();
        obj.change();
        obj.result();
    }
}