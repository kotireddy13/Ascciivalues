import java.util.Scanner;

public class asci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       char character=sc.next().charAt(0);
       sc.close();
       System.out.println((int)(character));
    }
}