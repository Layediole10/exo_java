import java.util.Scanner;

public class Multiply {

    public static void main(String[] args){
        Scanner numb = new Scanner(System.in);
        System.out.println("Entrer deux nombre A et B:");

        // reading 
        int A = numb.nextInt();
        int B = numb.nextInt();

        System.out.println("Multiplication= "+ (A * B));


        
    }

}