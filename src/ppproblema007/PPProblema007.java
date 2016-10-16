/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema007;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int km;
       km=entradaDato();
    }
    public static int entradaDato(){
        int km;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce los Km/h a convertir");
        km=entrada.nextInt(); 
        double res;
        res= km * 0.277778;
        System.out.println("El resultado es:"+ res + "m/s");
        return km;
    }
}
