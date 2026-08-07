package Machine;
import java.util.Scanner;
public class CashMachine {  // Class creation
    
    Scanner keyboard = new Scanner(System.in);
    int option;


    CashMachine(){
        while (option != 4){
        System.out.println("Welcome to the CashMachine");
        System.out.println(" ");
        
            System.out.println("Option 1: Check account");
            System.out.println("Option 2: Transfer");
            System.out.println("Option 3: File a complaint");
            System.out.println("Option 4: Exit");
            System.out.println("--------------------------");

        System.out.println("Please press an option");
        option = keyboard.nextInt();

        if  (option == 1){
            System.out.println("Ingresa tu numero de cuenta");
            
        }if (option == 2){
            System.out.println("Testing... option 2 ok");
        }if (option == 3){
            System.out.println("Testing... option 3 ok");
        }if (option == 4){
            System.out.println("Testing... option 4 ok");

        
        
        
    }

}
}
}