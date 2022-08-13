
package Ex17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Person> population = new ArrayList();
        Scanner input = new Scanner(System.in);
                
        while(population.size()<5){
            
            Person person = new Person();
            
            input.nextLine();
            System.out.println("Altura: ");
            person.setHeight(input.nextDouble());
            System.out.println("Sexo (0 = Masculino e 1 = Feminino): " );
            person.setHeight(input.nextInt());
        }
        
        double biggerH = population.get(0).getHeight();
        double lowerH = population.get(0).getHeight();
        double averageHFemale;
        
        for(int i = 0; i<population.size();i++){
            if(population.get(i).getHeight()>biggerH){
                biggerH = population.get(i).getHeight();
            }
            if(population.get(i).getHeight()<lowerH){
                lowerH = population.get(i).getHeight();
            }
            
        }
        
    }
}
