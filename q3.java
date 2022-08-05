package RecordPrograms;
import java.util.*;

public class q3 {
    
    int empNo;
    
    String empName;
    String empDesig;
    
    float basic;
    
    double netSalary;
    
    public q3() {
        empNo = 0;
        empName = "";
        empDesig = "";
        basic = 0;
        netSalary = 0;
    }
    
    public q3(int empNo, String empName, String empDesig, int basic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empDesig = empDesig;
        this.basic = basic;
    }
    
    public void calculate() {
        float DA = basic - (basic * 10/100);
        float HRA = basic - (basic * 15/100);
        float Salary = basic + DA + HRA;
        float PF = Salary - (Salary * 8/100);
        netSalary = Salary - PF;
    }
    
    public void display() {
        
        System.out.println("ID : " + empNo);
        System.out.println("NAME : " + empName);
        System.out.println("DESIGNATION : " + empDesig);
        System.out.println("BASIC PAY : " + basic);
        System.out.println("NET SALARY : " + netSalary);
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your id : ");
        int id = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        
        System.out.print("Enter your designation : ");
        String designation = sc.nextLine();
        
        System.out.print("Enter your basic pay : ");
        int basic = sc.nextInt();
        
        q3 q3 = new q3(id, name, designation, basic);
        
        q3.calculate();
        q3.display();
        
    }
    
}