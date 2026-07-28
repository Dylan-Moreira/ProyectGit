package reserve;
import java.util.Scanner;

public class Main { 
public static void main(String[] args){

Scanner teclado = new Scanner(System.in);
String opcion = " ";

while (!opcion.equals("salir")){  
    System.out.println("¿De que departamento eres? o escribe salir ");
    opcion = teclado.nextLine().toLowerCase().trim(); 

        switch (opcion){ //sentence switch
            case "montevideo":
                System.out.println("Montevideano");
                break;
            case "canelones":
                System.out.println("Canario");
                break;
            case "artigas":
                System.out.println("Artiguense");
                break;
            case "cerro largo":
                System.out.println("Cerrolarguense");
                break;
            case "colonia":
                System.out.println("Coloniense");
                break;
            case "durazno":
                System.out.println("Duraznense");
                break;
            case "flores":
                System.out.println("Florensino");
                break;
            case "florida":
                System.out.println("Floridense");
                break;
            case "lavalleja":
                System.out.println("Lavallejino");
                break;
            case "maldonado":
                System.out.println("Fernandino");
                break;
            case "paysandu":
                System.out.println("Sanducero");
                break;
            case "rio negro":
                System.out.println("Rionegrense");
                break;
            case "rivera":
                System.out.println("Riverense");
                break;
            case "rocha":
                System.out.println("Rochense");
                break;
            case "salto":
                System.out.println("Salteño");
                break;
            case "san jose":
                System.out.println("Maragato");
                break;
            case "soriano":
                System.out.println("Sorianense");
                break;
            case "tacuarembo":
                System.out.println("Tacuaremboense");
                break;
            case "treinta y tres":
                System.out.println("Olimareño");
                break;
            case "salir": 
                System.out.println("Hasta luego!");
                break;
            default:
                System.out.println("No ingresaste un departamento de uruguay");
        
            }

    }
    
    teclado.close();
    } 
}