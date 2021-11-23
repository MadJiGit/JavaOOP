package defineAnInterfacePerson_new;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Problem 4.	Food Shortage

        Scanner scanner = new Scanner(System.in);
        int coun = Integer.parseInt(scanner.nextLine());

        HashMap<String, Person> citizenArr = new HashMap<>();

        while (coun-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name;
            int age;
            String id;
            String birthDate;
            int food = 0;
            String group;
            Person person;

            if (input.length == 4) {
                name = input[0];
                age = Integer.parseInt(input[1]);
                id = input[2];
                birthDate = input[3];
                person = createCitizen(name, age, id, birthDate, food);
                addCitizen(citizenArr, person);

            } else if (input.length == 3) {
                name = input[0];
                age = -1;
                group = input[2];
                person = createCitizen(name, age, group, "", food);
                addCitizen(citizenArr, person);
            }
        }

        String end = "End";
        String input = scanner.nextLine();
        int finalFood = 0;
        while (!input.equals(end)) {
            for (Map.Entry<String, Person> set : citizenArr.entrySet()) {
                if (set.getKey().equals(input)) {
                    Buyer buy = (Buyer) set.getValue();
                    buy.buyFood();
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Person> set : citizenArr.entrySet()) {
            Buyer buy = (Buyer) set.getValue();
            finalFood += buy.getFood();
        }

        System.out.println(finalFood);

    }


    private static Person createCitizen(String name, int age, String id, String birthDate, int food) {

        if (age < 0) {
            return new Rebel(name, id, food);
        } else {
            return  new Citizen(name, age, id, birthDate, 0);
        }

    }

    private static void addCitizen(HashMap<String, Person> citizenArr, Person birthable) {

        citizenArr.put(birthable.getName(), birthable);
    }

/*
        // Problem 3.	Birthday Celebrations
        Scanner scanner = new Scanner(System.in);
        //HashMap<Integer, Birthable> citizenArr = new HashMap<>();
        List<Birthable> citizenArr = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        String type = input[0];
        Birthable birthable;

        while (!type.equals("End")) {
            String name;
            int age;
            String id;
            String birthDate;
            int birthYear;

            switch (type) {
                case "Citizen":
                    name = input[1];
                    age = Integer.parseInt(input[2]);
                    id = input[3];
                    birthDate = input[4];
                    birthable = createCitizen(name, age, id, birthDate);
                    addCitizen(citizenArr, birthable);
                    break;
                case "Pet":
                    name = input[1];
                    birthDate = input[2];
                    age = -1;
                    id = "";
                    birthable = createCitizen(name, age, id, birthDate);
                    addCitizen(citizenArr, birthable);
            }

            input = scanner.nextLine().split("\\s+");
            type = input[0];
        }

        String find = scanner.nextLine();

        for (Birthable birt : citizenArr) {
            String[] bd = birt.getBirthDate().split("/");
            if (find.equals(bd[2])){
                System.out.println(birt.getBirthDate());
            }
        }
            private static Person createCitizen(String name, int age, String id, String birthDate, int food) {

        Birthable birthable;

        if (age < 0){
            birthable = new Rebel(name, age, id, food);
        } else {
            birthable = new Citizen(name, age, id, birthDate, 0);
        }

        return birthable;
    }

        private static void addCitizen(HashMap <String, Birthable> citizenArr, Person birthable) {

                citizenArr.put(birthable.getName(), birthable);
        }
    }
*/



/*
        // Problem 2.	Multiple Implementation

        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            methods = Identifiable.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();
            Identifiable identifiable = new Citizen(name,age,id,birthDate);
            Birthable birthable = new Citizen(name,age,id,birthDate);
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
        }
*/

        /*

        // Problem 1.	Define an Interface Person
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if(Arrays.asList(citizenInterfaces).contains(Person.class)){
            Method[] fields = Person.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            Person person = new Citizen(name,age);
            System.out.println(fields.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
*/

}
