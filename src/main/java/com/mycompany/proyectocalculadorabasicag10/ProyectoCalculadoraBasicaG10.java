package com.mycompany.proyectocalculadorabasicag10;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class ProyectoCalculadoraBasicaG10 {

    public static void main(String[] args) {
        int operacion;
        int menu1 = 0;
        double ej1,ej2, suma,resta,mult,div,pot,raiz;
        
        operacion = Integer.parseInt(JOptionPane.showInputDialog("""
                Seleccione una opcion: 
                1. Realizar una operacion 
                2.Salir 
                """)); 
                                                             
        if(operacion ==1){
       while(menu1 >= 0 && menu1 <7){ 
        menu1 = Integer.parseInt(JOptionPane.showInputDialog("""
                    Seleccione una operacion: 
                    1. Suma 
                    2. Resta 
                    3. Multiplicacion
                    4. Division
                    5. Potencia
                    6. Raiz cuadrada
                    7. Salir
                    """));
       
        switch(menu1){
             
            case 1 -> {
                ej1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                ej2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                suma = ej1 + ej2;
                JOptionPane.showMessageDialog(null,"La suma de los 2 numeros es: "+suma);
               }
            case 2 -> {
                ej1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                ej2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                resta = ej1 - ej2;
                JOptionPane.showMessageDialog(null,"La resta de los 2 numeros es: "+resta);
               }
            case 3 -> {
                ej1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                ej2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                mult = ej1 * ej2;
                JOptionPane.showMessageDialog(null,"La multiplicacion de los 2 numeros es: "+mult);
               }
            case 4 -> {
                ej1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                ej2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                div = ej1 / ej2;
                JOptionPane.showMessageDialog(null,"La division de los 2 numeros es: "+div);
               }
            case 5 -> {
                ej1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                ej2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                pot = Math.pow(ej1, ej2);
                JOptionPane.showMessageDialog(null,"La potencia de los 2 numeros es: "+pot);
               }
            case 6 -> {
                ej1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese 1 numero: "));
                raiz = Math.sqrt(ej1);
                JOptionPane.showMessageDialog(null,"La raiz del numero es: "+raiz);
               }
                    
                    default -> JOptionPane.showMessageDialog(null,"Saliendo...");        
        }     
         
    }
       
    }
        else{
        JOptionPane.showMessageDialog(null,"Saliendo.");
        }
    }
}
