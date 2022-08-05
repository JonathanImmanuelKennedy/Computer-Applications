package RecordPrograms;
import java.util.*;

public class q10 {
    
    public static String monthName(int mm) {
        switch (mm) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }
    
    public static int dayInMonth(int dd, int mm, int ly) {
        int tmp = dd - ly;
        switch (mm) {
            case 1: return dd;
            case 2: return (dd - 31);
            case 3: return (tmp - 59);
            case 4: return (tmp - 90);
            case 5: return (tmp - 120);
            case 6: return (tmp - 151);
            case 7: return (tmp - 181);
            case 8: return (tmp - 212);
            case 9: return (tmp - 243);
            case 10: return (tmp - 273);
            case 11: return (tmp - 304);
            case 12: return (tmp - 334);
            default: return 0;
        }
    }
    
    public static String suffix(int dd) {
        int tmp = dd % 10;
        if (tmp == 1)
            return "st";
        else if (tmp == 2)
            return "nd";
        else if (tmp == 3)
            return "rd";
        else
            return "th";
    }
    
    public static int dayToMonth(int dd, int ly) {
        if (dd <= 31 + ly)
            return 1;
        else if (dd <= 59 + ly)
            return 2;
        else if (dd <= 90 + ly)
            return 3;
        else if (dd <= 120 + ly)
            return 4;
        else if (dd <= 151 + ly)
            return 5;
        else if (dd <= 181 + ly)
            return 6;
        else if (dd <= 212 + ly)
            return 7;
        else if (dd <= 243 + ly)
            return 8;
        else if (dd <= 273 + ly)
            return 9;
        else if (dd <= 304 + ly)
            return 10;
        else if (dd <= 334 + ly)
            return 11;
        else if (dd <= 365 + ly)
            return 12;

        return 0;
    }
    
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("DAY NUMBER : ");
        int dn = sc.nextInt();
        
        if (dn < 1 || dn > 366)
            System.exit(0);
        
        System.out.print("YEAR : ");
        int yr = sc.nextInt();
        
        if (yr < 1000 || yr > 9999 || (yr % 4 != 0 && dn > 366))
            System.exit(0);
        
        System.out.print("DATE AFTER (N DAYS) : ");
        int da = sc.nextInt();
        
        if (da < 1 || da > 100 || (dn + da) > 365 || (((dn + da) > 366) && (yr % 4 != 0)))
            System.exit(0);
            
        int ly = 0;
        int mm = 0;
        int dd = 0;
        
        String suffix = "";
        String mn = "";
            
        if (yr % 4 == 0)
            ly = 1;
        else
            ly = 0;
            
        mm = dayToMonth(dn, ly);
        mn = monthName(mm);
        dd = dayInMonth(dn, mm, ly);
        suffix = suffix(dd);
        
        System.out.println("DATE : " + dd + suffix + " " + mn + ", " + yr);
        
        mm = dayToMonth(dn + da, ly);
        mn = monthName(mm);
        dd = dayInMonth(dn + da, mm, ly);
        suffix = suffix(dd);
        
        System.out.println("DATE AFTER " + da + " days : " + dd + suffix + " " + mn + ", " + yr);
        
    }
}