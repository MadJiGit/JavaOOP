package inheritance.randomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> randInt = new RandomArrayList<>();

        for(int i = 1; i < 10; i++){
            randInt.add(i);
        }

        for(int i = 1; i < 5; i++){
            System.out.println(randInt.getRandomElement());
        }
    }
}
