package boletin4_2;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin4_2 {

    
    public static void main(String[] args) {
        Satelite unSatelite = new Satelite(10, 25, 4);
        unSatelite.verPosicion();

        Satelite outroSatelite = new Satelite();
        outroSatelite.verPosicion();

       Scanner sc = new Scanner(System.in);
       System.out.println("Valor meridiano = ");
       double meridiano=sc.nextDouble();
       System.out.println("Valor paralelo= ");
       double paralelo= sc.nextDouble();
       System.out.println("Valor distancia Terra= ");
       double distanciaTerra= sc.nextDouble();
       Satelite sat3= new Satelite(meridiano,paralelo,distanciaTerra);
       sat3.verPosicion();

        
    }
    
}
