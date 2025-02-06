package ejgestionempresa;

public class Departamento {
    //Ventas,RRHH,Produccion
    //ATRIBUTOS
    private String nombreDpto;
    private Empleado [] empleados = new Empleado[3];
    
    //GETTER AND SETTER
    public String getNombreDpto() {
        return nombreDpto;
    }

    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    
    //COSTRUCTOR

    public Departamento() {
    }

    public Departamento(String nombreDpto) {
        this.nombreDpto = nombreDpto;
       
        for (int i = 0; i < 5; i++) {
            //Empleado.crearEmpleado(codigo, dni, nombre, ape1, ape2, reduccion);
        }
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombreDpto=" + nombreDpto + ", empleados=" 
                + empleados + '}';
    }
}
