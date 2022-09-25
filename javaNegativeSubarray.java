

import java.util.*;

public class javaNegativeSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array= new int[n];
        int counter=0;
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=array[j];
                if(sum<0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
