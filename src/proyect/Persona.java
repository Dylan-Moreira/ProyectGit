package proyect; // package of the proyect

public class Persona { // Create public class
    private String name; // Atribute private
    private int edad;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public String showInfo() {
        return "Nombre " + name + ", Edad " + edad + " años";
    }

}
