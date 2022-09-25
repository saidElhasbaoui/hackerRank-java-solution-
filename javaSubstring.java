import java.util.*;
public class javaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String word = S.substring(start, end);
        System.out.println(word);
    }
}
