package inheritance.animals;

import java.util.ArrayList;
import java.util.Scanner;

/*
Cat
Tom Male
Cat
Tom 12 Male

 */

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        String animalType = scanner.nextLine();

        while (!animalType.equals("Beast!")) {

            String[] animalData = scanner.nextLine().split("\\s+");

            String animalName = animalData[0];
            int animalAge = Integer.parseInt(animalData[1]);
            String animalGender = animalData[2];
            try {
                switch (animalType) {
                    case "Dog":
                        Dog dog = new Dog(animalName, animalGender, animalAge);
                        animals.add(dog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(animalName, animalGender, animalAge);
                        animals.add(cat);
                        break;
                    case "Frog":
                        Frog frog = new Frog(animalName, animalGender, animalAge);
                        animals.add(frog);
                        break;
                    case "Kittens":
                        Kitten kitten = new Kitten(animalName, animalAge);
                        animals.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(animalName, animalAge);
                        animals.add(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            animalType = scanner.nextLine();
        }

        scanner.close();
/*
        if(animalType.equals("Beast!")) {
            for (Animal animal : inheritance.animals) {
                System.out.println(animal);
            }
        }
 */
    }
}
