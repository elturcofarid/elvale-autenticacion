package co.com.onlysystems.autenticacion.models;

public class Administrador extends  Empleado{




    public String abrirNegocio(){
       return "el negocio está abierto :::: ";
    }


    public String cerrarNegocio(){
        return "el negocio está cerrado :::: ";
    }
}
