package RecordPrograms;
import java.io.*;

public class q19 {
    static String fileName = "stu.dat";
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader stdin = new BufferedReader(isr);
    public static void main(String args[]) {
        try {
            int rno; float marks;
            FileOutputStream fw = new FileOutputStream(fileName);
            DataOutputStream dw = new DataOutputStream(fw);
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter Rollno : ");
                rno = Integer.parseInt(stdin.readLine());
                System.out.print("Enter Marks : ");
                marks = Float.parseFloat(stdin.readLine());
                dw.writeInt(rno);
                dw.writeFloat(marks);
            }
            dw.close();
            fw.close();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    } 
}