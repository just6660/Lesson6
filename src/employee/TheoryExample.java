
package employee;

import java.util.Scanner;

public class TheoryExample {

    public static void main(String[] args) {
        //recall -> you can use && and || and ! in boolean expressions
        //                      and     or    not
        
        int x = 12, y = 17;
        System.out.println(x!=y); //true
        System.out.println(x>=y || x<10); //true
        System.out.println(x>=y && x<15); //false
        
        int score1,score2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter test score 1: ");
        score1 = s.nextInt();
        System.out.print("Enter test score 2: ");
        score2 = s.nextInt();
    
    
    
    
        boolean bothover90 = score1>=90 && score2>=90;
        boolean atleastone90 = score1>=90 || score2>=50;
        boolean fails = score1<50&& score2<50;
        boolean atleastone70 = score1>=70 || score2<=70;
        
        
        if(bothover90)
            System.out.println("Manager");
        else if(atleastone90 && !fails)
            System.out.println("Supervisor");
        else if(atleastone70 && !fails)
            System.out.println("Clerk");
        else
            System.out.println("Disqualified");
    }
    
    
    
   
    
    
}
