package RecordPrograms;
import java.util.Scanner;
class q12 {
    static String saddle (int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < n; k++) {
                    //checking minimum of row
                    if (arr[i][j] > arr[i][k]) {
                        flag = false;
                    }
                }
                for (int k = 0; k < n; k++) {
                    //checking maximum of column
                    if (arr[i][j] < arr[k][j]) {
                        flag = false;
                    }
                }
                if (flag) {
                    return "Saddle point: " + arr[i][j];
                }
            }
        }
        return "No saddle point";
    }
    static int[] insertion (int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    static int[][] insertion (int arr[][]) {
        int[] diag = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            diag[i] = arr[i][i];
        }
        diag = insertion(diag);
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = diag[i];
        }
        return arr;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension: ");
        int n = sc.nextInt();
        if (n>20) {
            System.out.println("N cannot be greater than 20");
            System.exit(0);
        }
        int[][] arr = new int[n][n];
        System.out.println("Enter " + (n*n) + " elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        System.out.println(saddle(arr, n));
        
        System.out.println("Matrix after sorting principal diagonal");
        int[][] sorted = insertion(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sorted[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
