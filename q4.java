package RecordPrograms;
import java.util.Scanner;
class q4 {
    String st;
    int len;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string");
        st = sc.nextLine();
        len = st.length();
    }
    void putin(int pos, char ch) {
        String newst = "";
        for (int i = 0; i < len; i++) {
            if (i == pos) newst += ch;
            else newst += st.charAt(i);
        }
        System.out.println("Changed string: " + newst);
        st = newst;
    }
    void takeout (int pos) {
        String newst = "";
        for (int i = 0; i < len; i++) {
            if (i != pos) newst += st.charAt(i);
        }
        System.out.println("Changed string: " + newst);
        st = newst;
        len -= 1;
    }
    void change () {
        String newst = "";
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < st.length(); i++) {
                if (!(Character.isLetter(st.charAt(i)))) {
                    newst += st.charAt(i);
                } else if (st.charAt(i) == 'Z') {
                    newst += 'A';
                } else if (st.charAt(i) == 'z') {
                    newst += 'a';
                } else {
                    newst += (char)(st.charAt(i) + 1);
                }
            }
            st = newst;
            newst = "";
        }
        System.out.println("Changed string: " + st);
    }
}
