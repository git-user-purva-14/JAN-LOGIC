import java.util.Scanner;

public class D2Demo{

    public static void main(String[] args) {
        
        System.out.println("3 < 9:" + (3<9));
        System.out.println("3 > 9:" +  (3>9));
        System.out.println("3 >= 9:" + (3>=9));
        System.out.println("3 <= 9:" + (3<=9));
        System.out.println("3 == 9:" + (3==9));
        System.out.println("3 != 9" + (3!=9));

      // logical 
        System.out.println("3 <9 && 5>9:"+ (3<9 && 5<9));
        System.out.println("3== 9 || 5>9:" +(3==9 || 5>9));

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(! (6>8));
// usr enter the input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println("n:"+ n );
        System.out.println("n²:"+ n*n);
        System.out.println("n³:"+ n*n*n);
        System.out.println("n⁴:"+ n*n*n*n);
        System.out.println("n⁵:"+ n*n*n*n*n);
        
s
    }
}