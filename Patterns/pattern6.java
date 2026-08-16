/* Make Pattern :-
   1 2 3 4 5
   1 2 3 4
   1 2 3 
   1 2 
   1
 */
import java.util.*;
public class pattern6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 5; j>=i; j--){
                System.out.print( (n-j+1) + " ");
            }
            System.out.println();
        }
    }
}