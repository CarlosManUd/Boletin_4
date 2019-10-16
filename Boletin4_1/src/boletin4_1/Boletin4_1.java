package boletin4_1;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin4_1 {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Coche ferrari = new Coche();
        System.out.println("Velocidade = " + ferrari.getVelocidade() + " km/h");

        System.out.print("\nCanto quere incrementar a velocidade = ");
        ferrari.acelerar(ler.nextInt());

        System.out.println("Velocidade = " + ferrari.getVelocidade() + " km/h");

        System.out.print("\nCanto quere frenar a velocidade = ");
        ferrari.frenar(ler.nextInt());

        System.out.println("Velocidade = " + ferrari.getVelocidade() + " km/h");
        
    }
    
}
