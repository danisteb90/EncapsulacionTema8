public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(32);
        persona.setNombre("Esteban");
        persona.setTelefono("095436276");

        System.out.println("Me llamo " + persona.getNombre() + " mi edad es: " + persona.getEdad() + " y mi telf es: " + persona.getTelefono());
    }
}

class Persona {

    private int edad;
    private String nombre;
    private String telefono;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
public int getEdad(){
        return this.edad;
}
public String getNombre(){
        return this.nombre;
}
public String getTelefono(){
        return this.telefono;
}

}