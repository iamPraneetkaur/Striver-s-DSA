/* Make Pattern :-
   A
   A B
   A B C
   A B C D
   A B C D E
 */
import java.util.*;
public class pattern14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(char j = 'A'; j< (char)('A' + i); j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}