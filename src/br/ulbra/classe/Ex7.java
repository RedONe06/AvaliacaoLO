package br.ulbra.classe;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author s.lucas
 */
public class Ex7 {
    public static void main(String[] args) {
        String name;
        double salaryB,salaryL, bonus, taxes;
        
        Scanner input = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        System.out.println("Insira o nome:");
        name = input.nextLine();
        System.out.println("Insira o salário bruto:");
        salaryB = input.nextDouble();
        
        bonus = (0.055*salaryB);
        salaryL = salaryB + bonus;
        
        if(salaryL < 3500.00){
            taxes = (0.035*salaryL);
            salaryL -= taxes;
        } else {
            taxes = (0.075*salaryL);
            salaryL -= taxes;
        }
        
        System.out.println("Nome: " + name
        + "\nSalário Bruto: " + f.format(salaryB)
        + "\nBônus: R$ " + f.format(bonus)
        + "\nI.R: R$ " + f.format(taxes)
        + "\nSalário Líquido: R$ " + f.format(salaryL));
    }
}
