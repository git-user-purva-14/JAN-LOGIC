import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x :");
        int x =sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();

        if(x >0 && y >0){
            System.out.println("The points lie in the first quadrant.");
        }
        else if (x <0 && y > 0){
            System.out.println("the points lie in the second quadrant. ");
        }
        else if (x <0 && y<0){
            System.out.println("the points lie in the thired quadrant.");
        }
        else if (x>0 && y<0){
            System.out.println("the points lie in the fourth quadrant");
        }
        else if (x == 0 && y == 0){
            System.out.println("the points lie on the y-axis.");
        }
    }
    
}
