package org.example.clasesHalloween;

public class Invitado {
    //ATRIBUTOS

    public String nombre;
    public String apellido;
    public int edad;
    public String id;
    public boolean aplicaCover;
    public float valorCover;
    public char disfraz;


    //CONSTRUCTOR

    public Invitado() {
    }

    public Invitado(String nombre, String apellido, int edad, String id, boolean aplicaCover, float valorCover, char disfraz) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.aplicaCover = aplicaCover;
        this.valorCover = valorCover;
        this.disfraz = disfraz;
    }

    //METODOS
    public void mostrarInvitado(){
        System.out.println("Nombre: "+this.nombre +"\n"+"Apellido: "+this.apellido+"\n"+"Edad: "+this.edad+"\n"+"Identificación: "+this.id+"\n"+
                "Paga Cover: "+this.aplicaCover+"\n"+"Valor del Cover: $"+this.valorCover+"\n"+"Tipo Disfraz: "+this.disfraz+"\n");
    }

}
