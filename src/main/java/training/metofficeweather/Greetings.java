package training.metofficeweather;

import java.util.Scanner;

public class Greetings {
    static void greeter() {
        System.out.println("Welcome to the Weather app");
        System.out.println("To see all available areas type in 'areas'");
        System.out.println("To see the weather data for specific area type it's name");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a place name: ");
        String userPlaceName = userInput.nextLine();
        System.out.println(userPlaceName);
    }
}