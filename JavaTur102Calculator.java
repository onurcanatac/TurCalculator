import java.util.Scanner;

public class JavaTur102Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double d1,f1,d2,f2,d3,f3,d4,f4,sum;

        //Take the values
        System.out.print("Please enter the grade of draft 1: ");
        d1 = scan.nextDouble();
        System.out.print("Please enter the grade of final 1: ");
        f1 = scan.nextDouble();
         System.out.print("Please enter the grade of draft 2: ");
        d2 = scan.nextDouble();
        System.out.print("Please enter the grade of final 2: ");
        f2 = scan.nextDouble();
        System.out.print("Please enter the grade of draft 3: ");
        d3 = scan.nextDouble();
        System.out.print("Please enter the grade of final 3: ");
        f3 = scan.nextDouble();
        System.out.print("Please enter the grade of draft 4: ");
        d4 = scan.nextDouble();
        System.out.print("Please enter the grade of final 4: ");
        f4 = scan.nextDouble(); 
        

        sum = 0;
        sum = sum + 17.5 * 0.04 * d1 + 17.5 * 0.06 * f1;
        sum = sum + 17.5 * 0.04 * d2 + 17.5 * 0.06 * f2;
        sum = sum + 17.5 * 0.04 * d3 + 17.5 * 0.06 * f3;
        sum = sum + 17.5 * 0.04 * d4 + 17.5 * 0.06 * f4; 

        System.out.println("You need " + (95 - sum) + " points for A.");

        scan.close();
    }   
}
