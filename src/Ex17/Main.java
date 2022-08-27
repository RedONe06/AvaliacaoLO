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
        int cont = 0;

        while (cont < 50) {

            Person person = new Person();
            System.out.println("Altura: ");
            person.setHeight(input.nextDouble());
            do {
                System.out.println("Sexo (0 = Masculino e 1 = Feminino): ");
                person.setSex(input.nextInt());
                if (person.getSex() != 0 && person.getSex() != 1) {
                    System.out.println("Número inválido;");
                }
            } while (person.getSex() != 0 && person.getSex() != 1);
            population.add(person);
            cont++;
        }

        double biggerH = population.get(0).getHeight();
        double lowerH = population.get(0).getHeight();
        double averageHFemale = 0;
        double averageHMale = 0;
        double averageHPopulation = 0;
        double averageMale = 0;
        double female = 0;
        double male = 0;

        for (int i = 0; i < population.size(); i++) {
            if (population.get(i).getHeight() > biggerH) {
                biggerH = population.get(i).getHeight();
            }
            if (population.get(i).getHeight() < lowerH) {
                lowerH = population.get(i).getHeight();
            }
            switch (population.get(i).getSex()) {
                case 1:
                    averageHFemale += population.get(i).getHeight();
                    female++;
                    break;
                case 0:
                    averageHMale += population.get(i).getHeight();
                    male++;
                    break;
            }
        }

        averageHPopulation = averageHMale + averageHFemale / population.size();
        averageHFemale = averageHFemale / female;
        averageMale = (male / population.size()) * 100;

        System.out.println(
                "Maior altura: " + biggerH);
        System.out.println(
                "Menor altura: " + lowerH);
        System.out.println(
                "Media de altura das mulheres: " + averageHFemale);
        System.out.println("Quantidade de homens: " + male);
        System.out.println("Quantidade de pessoas: " + population.size());
        System.out.println(
                "Percentual de homens: " + averageMale + "%");
    }
}
