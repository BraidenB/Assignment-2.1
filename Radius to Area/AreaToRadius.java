import java.util.Scanner;

class AreaToRadius { 
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Radius of the Circle");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Radius: ");
        int radius = sc.nextInt();
        Double area = ( Math.PI*Math.pow(radius, 2) );
        
        System.out.println("Area: " +area);
    }
}
