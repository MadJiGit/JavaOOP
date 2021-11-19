package interfaceAndAbstraction.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<String> ids = new ArrayList<>();

        while(!input[0].equals("End")){
            int temp = input.length - 1;
            String tempStr = input[temp];
            ids.add(tempStr);

            input = scanner.nextLine().split("\\s+");
        }

        String toCompareString = scanner.nextLine();
        int len = toCompareString.length();
        int toCompare = Integer.parseInt(toCompareString);

        for (String id : ids){
            int temp = Integer.parseInt(id.substring(id.length()-len));
            if(temp == toCompare) {
                System.out.println(id);
            }
        }


        scanner.close();

    }
}
