package br.ulbra.classe;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Ex18 {

    public static void main(String[] args) {
        
        double[] nota = new double[2];
        double biggerScore, score;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira uma nota:");
        biggerScore = input.nextDouble();
        
        for (int i = 0; i<(nota.length)-1; i++) {
            System.out.println("Insira uma nota:");
            score = input.nextDouble();
            if(score>biggerScore){
                biggerScore = score;
            }
        }
        
        System.out.println("Maior nota: " + biggerScore);
    }
}
