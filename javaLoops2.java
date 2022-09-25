import java.util.*;


public class javaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int somme = a;
            for(int j=0;j<n;j++){
                somme = somme + (int)(Math.pow(2,j)*b);
                System.out.print(somme + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
