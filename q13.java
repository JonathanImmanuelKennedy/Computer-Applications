package RecordPrograms;
import java.util.*;

public class q13 {
    
    int adNo[];
    int v;
    
    public q13() {
        adNo = new int[100];
        
        for (int i = 0; i < 100; i++)
            adNo[i] = 0;
            
        v = 0;
    }
    
    public void accept() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the admission numbers in ascending order : ");
        for (int i = 0; i < 100; i++)
            adNo[i] = sc.nextInt();
            
        System.out.println("Enter the element to be searched : ");
        v = sc.nextInt();

    }
    
    public int binSearch(int l, int u, int v) {
        
        int m = (l + u) / 2;
        
        if (l <= u)
            if (adNo[m] > v) {
                l = m + 1;
                binSearch(l, u, v);
            }
            else if (adNo[m] == v)
                return 1;
            else {
                u = m - 1; 
                binSearch(l, u, v);
            }
            
        return -1;
        
    }
    
    public void display() {
        
        if(binSearch(adNo[0], adNo[99], v) == 1)
            System.out.println("Exists");
        else {
            System.out.println("Does not exist!");
        }
        
    }
    
    public static void main(String[] args) {
        
        q13 q13 = new q13();
        
        q13.accept();
        q13.display();
        
    }
    
}