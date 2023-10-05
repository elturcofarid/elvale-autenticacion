package co.com.onlysystems.autenticacion.models;

public class Tendero extends Empleado{


    public String atenderCliente(String cliente){
        return "cliente atendido ::: " + cliente;
    }
}
