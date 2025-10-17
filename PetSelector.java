
//Nirupam Sai Vadigi
//10/16/2025
//This program calculates the perfect pet for the user
import java.util.*;

public class PetSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter color: ");
        String color = scanner.nextLine().toLowerCase();

        System.out.println("Enter season: ");
        String season = scanner.nextLine().toLowerCase();

        System.out.println("Enter name: ");
        String name = scanner.nextLine().toLowerCase();

        String blue = "blue";
        String green = "green";
        String red = "red";
        String fallSeason = "fall";
        String springSeason = "spring";
        String winterSeason = "winter";
        String summerSeason = "summer";
        char firstLetter = name.charAt(0);

        if (color.equals(blue) && season.equals(fallSeason)) {
            System.out.println("Your pet is an alligator");
            return;
        }
        if (color.equals(blue) && season.equals(springSeason)) {
            System.out.println("Your pet is an ostrich");
            return;
        }
        if (color.equals(green)) {
            if (!((firstLetter == 'a') || (firstLetter == 'e') || (firstLetter == 'i') || (firstLetter == 'o')
                    || (firstLetter == 'u'))) {
                if (season.equals(winterSeason)) {
                    System.out.println("Your pet is a giraffe");
                    return;
                }
            }
            if (!season.equals(fallSeason)) {
                System.out.println("Your pet is a dog");
                return;
            }

        }

        if (color.equals(red)) {
            if ((firstLetter == 'a') || (firstLetter == 'e') || (firstLetter == 'i') || (firstLetter == 'o')
                    || (firstLetter == 'u')) {
                System.out.println("Your pet is a porcupine");
            } else {
                System.out.println("Your pet is a panda");
            }
            return;
        }
        if (season.equals(summerSeason)) {
            System.out.println("Your pet is a pony");
            return;
        }
        if (!((firstLetter == 'a') || (firstLetter == 'e') || (firstLetter == 'i') || (firstLetter == 'o')
                || (firstLetter == 'u')) && color.equals(blue)
                && !(season.equals(fallSeason) || season.equals(summerSeason))) {
            System.out.println("Your pet is an axolotl");
            return;
        }

        System.out.println("Your pet is a rock");

    }
}