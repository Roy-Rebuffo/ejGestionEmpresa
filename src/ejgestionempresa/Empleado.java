
package ejgestionempresa;

import java.util.Scanner;

public class Empleado {
    //ATRIBUTOS
    private int codigo;
    private String dni;
    private String nombre;
    private String ape1;
    private String ape2;
    private int nacim;
    private boolean reduccion;
    
    //GETTER AND SETTER
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public int getNacim() {
        return nacim;
    }

    public void setNacim(int nacim) {
        this.nacim = nacim;
    }

    public boolean isReduccion() {
        return reduccion;
    }

    public void setReduccion(boolean reduccion) {
        this.reduccion = reduccion;
    }
    //CONSTRUCTORES
    public Empleado() {
    }

    public Empleado(int codigo, String dni, String nombre, String ape1, String ape2, int nacim, boolean reduccion) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.nacim = nacim;
        this.reduccion = reduccion;
    }

    public Empleado(int codigo, String dni, String nombre, String ape1, String ape2, boolean reduccion) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.reduccion = reduccion;
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", dni=" + dni + ", nombre=" 
                + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", nacim=" 
                + nacim + ", reduccion=" + reduccion + '}';
    }
    //OTROS METODOS
    public static void crearEmpleado(int codigo, String dni, String nombre, 
            String ape1, String ape2, boolean reduccion){
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Introduzca el CODIGO del nuevo Empleado: ");
        codigo = dato.nextInt();
        
        System.out.println("Introduzca el DNI del nuevo Empleado: ");
        dni = dato.nextLine();
        
        System.out.println("Introduzca el NOMBRE del nuevo Empleado: ");
        nombre = dato.nextLine();
        
        System.out.println("Introduzca el PRIMER APELLIDO del nuevo Empleado: ");
        ape1 = dato.nextLine();
        
        System.out.println("Introduzca el SEGUNDO APELLIDO del nuevo Empleado: ");
        ape2 = dato.nextLine();
        
        System.out.println("Escriba T en caso de que tenga reduccion de jornada"
                + " en caso contrario teclee F: ");
        reduccion = dato.nextBoolean();
        
    }
}
