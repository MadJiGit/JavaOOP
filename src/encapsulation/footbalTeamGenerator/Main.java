package encapsulation.footbalTeamGenerator;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(";");
        String command = input[0];
        HashMap<String, Team> allTeams = new HashMap<>();
        StringBuilder outputString = new StringBuilder();

        while(!command.equals("END")){
            try {
                switch (command) {
                    case "Team":
                        allTeams.putIfAbsent(input[1], new Team(input[1]));
                        break;
                    case "Add":
                        if (allTeams.containsKey(input[1])) {
                            Player player = new Player(input[2],
                                    Integer.parseInt(input[3]),
                                    Integer.parseInt(input[4]),
                                    Integer.parseInt(input[5]),
                                    Integer.parseInt(input[6]),
                                    Integer.parseInt(input[7]));
                            allTeams.get(input[1]).addPlayer(player);
                        } else{
                            outputString.append(String.format("Team %s does not exist.%n", input[1]));
                        }
                        break;
                    case "Remove":
                        if (allTeams.get(input[1]).hasPlayer(input[2])) {
                            allTeams.get(input[1]).removePlayer(input[2]);
                        } else {
                            outputString.append(String.format("Player %s is not in %s team.%n", input[2], input[1]));
                        }
                        break;
                    case "Rating":
                        if (allTeams.containsKey(input[1])) {
                            outputString.append(String.format("%s - %d%n", (input[1]), (int) Math.round(allTeams.get(input[1]).getRating())));
                        } else {
                            outputString.append(String.format("Team %s does not exist.%n", input[1]));
                        }
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            input = scanner.nextLine().split(";");
            command = input[0];
        }

        System.out.println(outputString.toString().trim());
    }
}
