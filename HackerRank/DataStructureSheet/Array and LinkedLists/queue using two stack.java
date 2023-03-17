import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
                 Scanner sc= new Scanner(System.in);
        int queries= sc.nextInt();
        Stack<Integer> s1= new Stack<>();
        Stack<Integer>s2 = new Stack<>();

        while(queries>0) {
            int q= sc.nextInt();
            if (q == 1) {
                int x = sc.nextInt();
                s1.push(x);
            }
            else if (q == 2) {
                int front;
                //get all element of s1 to s2 inversely where first element became at peek of stack if only s2 is empty
                if(s2.empty()) {
                    while(!s1.empty()) {
                        front = s1.peek();
                        s1.pop();
                        s2.push(front);
                        }
                }
                //remove first element which is at peek of s2 as long as s2 is not empty
                s2.pop();
                }
            else if(q==3) {
                if(!s2.empty()){
                    System.out.println(s2.peek());
                }
               else
                   System.out.println(s1.firstElement());
            }
            else
                break;
            queries--;


        }
    }
}
