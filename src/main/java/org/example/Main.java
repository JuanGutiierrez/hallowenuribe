package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado =new Invitado();
        /*Invitado objetoInvitado2=new Invitado("Juan","Gutierrez",18,"1020102127",true,20000,'A');*/
        Fiesta objetoFiesta=new Fiesta(/*"Hoy, no faltes",100000,80000,20000,20,15000*/);
        //objetoFiesta.mostrarFiesta();
        Lugar objetoLugar = new Lugar();

        //DEFINIENDO COSTOS DE LA FIESTA
        System.out.println("****** GRAN FIESTA GRUPO URIBE ******");
        System.out.println("*************************************");

        System.out.print("1. Digita el costo de la comida: $");
        double costoAlimentos=entradaPorTeclado.nextDouble();
        if (costoAlimentos>0){
            objetoFiesta.costosAlimentos=costoAlimentos;
        }else {
            System.out.println("Ingrese un valor valido");
        }
        System.out.println("El costo de alimentos fue: $"+objetoFiesta.costosAlimentos);

        System.out.print("2. Digita el costo de las bebidas: $");
        double costosBebidas=entradaPorTeclado.nextDouble();
        if (costosBebidas>0){
            objetoFiesta.costosBebidas=costosBebidas;
            System.out.println("El costo de bebidas fue: $"+objetoFiesta.costosBebidas);
        }else {
            System.out.println("Ingrese un valor valido");
        }

        System.out.print("3. Digita el costo del lugar: $");
        double costosLugar=entradaPorTeclado.nextDouble();
        if (costosLugar>0){
            objetoFiesta.costosLugar=costosLugar;
            System.out.println("El costo del lugar fue: $"+objetoFiesta.costosLugar);
        }else {
            System.out.println("Ingrese un valor valido");
        }

        System.out.print("4. Digita el costo de los equipos: $");
        double costosEquipos=entradaPorTeclado.nextDouble();
        if (costosEquipos>0){
            objetoFiesta.costosEquipos=costosEquipos;
            System.out.println("El costo de los equipos fue: $"+objetoFiesta.costosEquipos);
        }else {
            System.out.println("Ingrese un valor valido");
        }
        

        /*objetoFiesta.costosTotal=costoAlimentos+;
        System.out.println("Los costos totales fueron: "+costosTotal);*/

    }
}