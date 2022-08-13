package br.ulbra.classe;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Ex6 {

    public static void main(String[] args) {

        double radius, perimeter, area, diameter;

        Scanner input = new Scanner(System.in);

        radius = input.nextDouble();
        
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        diameter = 2 * radius;
        
        System.out.println("R: " + radius
                + "\nP: " + perimeter
                + "\nA: " + area
                + "\nD: " + diameter);
    }
}
