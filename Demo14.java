import java.util.Scanner;

public class Demo14 {

    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
        System.out.print("to unlock Enter Password:");
        int pass = sc.nextInt();
        int count = 1;

        while(pass !=1234){
            count++;
            if(count==5){
                System.out.println("your device is lockes for 1 day");
                break;
            }
            System.out.println("\n Wronge passley:"+ pass);
            System.out.print("please try again:");
            pass = sc.nextInt();
        }
        if(count < 5){
        System.out.println("Device unlocked");
        }
        
    }
    
}
