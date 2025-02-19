import java.util.Scanner;
public class Demo13 {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a even number:");
        int n = sc.nextInt();

        while(n%2==0){
            System.out.println("number"+ n);
            System.out.println("Enter a even numbere:");
            n= sc.nextInt();
        }
        System.out.println("Opps! it's not an even number");
    }
    
}

