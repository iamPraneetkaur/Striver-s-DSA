/* Make Pattern :-
   * * * * *
   * * * * *
   * * * * *
   * * * * *
   * * * * *
 */
import java.util.*;
public class pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}