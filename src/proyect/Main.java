package proyect;

public class Main {
    public static void main (String[]args){

        Persona persona1 = new Persona();
        persona1.setName("Dylan");
        persona1.setEdad(27);

        System.out.println(persona1.showInfo());
    }
}
