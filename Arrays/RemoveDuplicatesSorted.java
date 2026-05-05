import java.util.*;
public class RemoveDuplicatesSorted{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for(int j = 1; j<n; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("Number of unique elements: "+ (i+1));
        for(int k=0; k<(i+1); k++){
            System.out.print(arr[k]+" ");
        }
    }
}