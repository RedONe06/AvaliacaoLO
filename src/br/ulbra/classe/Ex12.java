package br.ulbra.classe;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Ex12 {

    public static void main(String[] args) {

        double qP, qM, qG, value, total, descount;
        descount = 0.055;
        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de camisetas P:");
        qP = input.nextDouble();
        System.out.println("Quantidade de camisetas M:");
        qM = input.nextDouble();
        System.out.println("Quantidade de camisetas G:");
        qG = input.nextDouble();

        if (qP > 5) {
            qP = qP * 10;
            qP -= (qP * descount);
        } else {
            qP = qP * 10;
        }

        if (qM > 5) {
            qM = qM * 12;
            qM -= (qM * descount);
        } else {
            qM = qM * 12;
        }

        if (qG > 5) {
            qG = qG * 15;
            qG -= (qG * descount);
        } else {
            qG = qG * 15;
        }
        System.out.println("P: R$ " + qP
                + "\nM: R$ " + qM
                + "\nG: R$ " + qG);
    }
}
