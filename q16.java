package RecordPrograms;
import java.util.Scanner;
class q16 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        if (m < 2 || m > 20) System.out.print("Number should be between 2 and 20");
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        if (n < 2 || n > 20) System.out.print("Number should be between 2 and 20");
        
        int[][] arr = new int[m][n];
        System.out.println("Enter " + (m*n) + " elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int swap;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < m; i++) {
                for (int j = m-1; j > i; j--) {
                    if (arr[j][k] > arr[j-1][k]) {
                        swap = arr[j][k];
                        arr[j][k] = arr[j-1][k];
                        arr[j-1][k] = swap;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
