import java.util.*;

public class Thanos {

    public static void main(String[] args) {


        ArrayList <Hero> heroes = new ArrayList<>(); 

        Hero captainAmerica = new Hero("Captain America", 100);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(captainAmerica);
        heroes.add(blackWidow);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        thor.setAge(1501);

        Collections.shuffle(heroes);

        System.out.println("\n");
        System.out.println("The heroes fighting Thanos are :");
        System.out.println("--------------------------------" + "\n");

        int i = 1;
        for (Hero hero : heroes) {
            System.out.println(" " + i + ". " + hero.getName());
            i++;
        }

        System.out.println("\n");
        System.out.println("Thanos snaps his fingers...");
        System.out.println("\n");

        List <Hero> halfHeroes = heroes.subList(0, (heroes.size() / 2));

        System.out.println("The surviving heroes are :");
        System.out.println("--------------------------" + "\n");

        int j = 1;
        for (Hero hasSurvived : halfHeroes) {
            System.out.println(" " + j + ". " + hasSurvived.getName());
            j++;
        }
        System.out.println("\n");
    }
}
