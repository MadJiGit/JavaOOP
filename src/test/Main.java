package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        List<String> fish = new ArrayList<>();
        fish.add("First");
        fish.add("Second");
        fish.add("Third");

        System.out.println(fish.stream().map(Object::toString)
                .collect(Collectors.joining(", ")));

    }
}


