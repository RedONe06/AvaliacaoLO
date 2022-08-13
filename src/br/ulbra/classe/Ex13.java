package br.ulbra.classe;

/**
 *
 * @author s.lucas
 */
public class Ex13 {
    public static void main(String[] args) {
        
        int years;
        double A, B;
        
        years = 0;
        A = 5000000;
        B = 7000000;
        
        while(A != B){
            A += (A*0.03);
            B += (B*0.02);
            years++;
        }
        
        System.out.println("Anos necessários: " + years);
    }
}
