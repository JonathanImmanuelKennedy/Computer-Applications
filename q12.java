package RecordPrograms;
import java.util.*;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the rows and columns : ");
        int N = sc.nextInt();
        
        int arr[][] = new int[N][N];
        
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                arr[i][j] =  sc.nextInt();
                
        
    }
}