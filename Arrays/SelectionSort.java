import java.util.*;
public class SelectionSort{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:- ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        
        for(int i=0; i<n-1; i++){
            int minInd = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}