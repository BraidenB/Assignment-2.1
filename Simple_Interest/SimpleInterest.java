import java.util.Scanner;

class SimpleInterest {
 public static void main (String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter your Variable amounts (A = P(1+r)^n)");
     System.out.println("---------------------------");
     System.out.println("");
     System.out.println("P: ");
     int P = sc.nextInt();
     System.out.println("r: ");
     Double r = sc.nextDouble();
     System.out.println("n: ");
     int n = sc.nextInt();
     
     Double Amount = P*Math.pow(1+r, n);
     
     System.out.println("The Amount (A) is: " +Amount);
    }
}