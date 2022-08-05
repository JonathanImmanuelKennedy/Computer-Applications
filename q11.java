package RecordPrograms;
import java.util.Scanner;
class q11
{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        
        int[][] arr = new int[r][c];
        System.out.println("Enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][c-1-i] + "\t");
            }
            System.out.print("\n");
        }
    }
}