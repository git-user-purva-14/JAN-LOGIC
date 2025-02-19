import java.util.Scanner;

public class Demo7 {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter Operation:");
        String op = sc.next();

        switch(op.charAt(0)){
            case '+':
            System.out.println("Addition"+(a+b));
            break;
            case '-':
            System.out.println("subtraction"+(a-b));
            break;
            case '*':
            System.out.println("multiplication"+(a*b));
            break;
            case '/':
            if(b==0){
            System.out.println("can't divide by zero");
        }else{
            System.out.println("Division"+(a/b));
        }
        break;    
    
        }
       }
    
}
