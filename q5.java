package RecordPrograms;
import java.util.*;

public class q5 {
    
    String str;
    int freq;
    
    public q5() {
        
        str = "";
        freq = 0;
        
    }
    
    public void readStr() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        str = sc.nextLine();
        
    }
    
    public void freqVowel() {
        
        StringTokenizer st = new StringTokenizer(str);
        String arr[] = new String[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens())
            arr[i++] = st.nextToken();
            
        for(i = 0; i < arr.length; i++) {
            if("AEIOUaeiou".indexOf(arr[i].charAt(0)) != -1)
                freq++;
        }
        
    }
    
    public void display() {
        
        System.out.println("The sentence is : " + str);
        System.out.println("The frequency is : " + freq);
        
    }
    
    public static void main(String[] args) {
        
        q5 q5 = new q5();
        
        q5.readStr();
        q5.freqVowel();
        q5.display();
        
    }

}
