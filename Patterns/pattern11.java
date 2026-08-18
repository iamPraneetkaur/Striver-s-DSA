/* Make Pattern :-
   1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1
 */
import java.util.*;
public class pattern11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%2 == 0 ){
                for(int j = 0; j<i; j++){
                    if(j%2==0){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            else{
                for(int j = 0; j<i; j++){
                    if(j%2==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
