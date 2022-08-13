package br.ulbra.classe;

/**
 *
 * @author s.lucas
 */
public class Ex16 {
    public static void main(String[] args) {
        int sum = 0, odd = 0;
        
        for(int i = 0; i < 100; i++){
            System.out.println(100-i);
            sum += (i + 1);
            if((100-i)%2 == 0){
                odd++;
            }
        }
        
        System.out.println("Soma: " + sum
        + "\nPares: " + odd);
    }
}
