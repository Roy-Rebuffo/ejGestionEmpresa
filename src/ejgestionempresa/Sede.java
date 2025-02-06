package ejgestionempresa;


public class Sede {
    //MAD,BCN,VAL,OVIEDO
    //ATRIBUTOS
    private String ubicacion;
    private Departamento[] departamentos = new Departamento[3];
    
    //GETTER AND SETTER
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }
    
    //Contructor
    public Sede(String ubicacion) {
        this.ubicacion = ubicacion;
        departamentos[0] = new Departamento("Ventas");
        departamentos[1] = new Departamento("RRHH");
        departamentos[2] = new Departamento("Produccion");
    }

    @Override
    public String toString() {
        return "Sede{" + "ubicacion=" + ubicacion + ", departamentos=" 
                + departamentos + '}';
    }
}
