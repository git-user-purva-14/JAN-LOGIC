import java.util.Scanner;

public class Demo8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character:");
        String ch = sc.next();

        switch(ch){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
             System.out.println("vowel");
              break;
            case "@":
            case "#":
            case "$":
            case "%":
            case "&":
             System.out.println("special Chracters");
             break;
            default:
            System.out.println("Consonant");
            break;
        }
    }
    
}
