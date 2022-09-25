
import java.util.*;

public class javaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len = A.length()+B.length();
        System.out.println(len);
        int great = A.compareTo(B);
        if(great>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String upA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String upB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(upA + " " + upB);
    }
}



