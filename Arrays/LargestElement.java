import java.util.*;
public class LargestElement{
    public static void main(String args[]){
        int n, arr[];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);        
    }
}