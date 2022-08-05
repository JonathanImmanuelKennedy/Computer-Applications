package RecordPrograms;
import java.util.Scanner;
public class q6
{
    static boolean palindrome (String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev += str.charAt(str.length()-1-i);
        }
        return (str.equals(rev));
    }
    static void partitions (String prefix, String str) {
        if (str.equals("")) {
            System.out.println(prefix);
        }
        for (int i = 1; i <= str.length(); i++) {
            if (palindrome(str.substring(0,i))) {
                if (prefix.equals("")) {
                    partitions(str.substring(0,i), str.substring(i, str.length()));
                } else {
                    partitions(prefix + " " + str.substring(0,i), str.substring(i, str.length()));
                }
            }
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Palindromic partitions of " + str);
        partitions("", str);
    }
}

