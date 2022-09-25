
import java.util.*;
import java.math.BigInteger;

public class javaBigInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1,s2;
        s1=input.nextLine();
        s2=input.nextLine();
        input.close();
        System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
        System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
    }
}
