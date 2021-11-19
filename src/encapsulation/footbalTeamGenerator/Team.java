package encapsulation.footbalTeamGenerator;

import java.util.HashMap;

public class Team {
    private String name;
    private double rating;
    private HashMap<String, Player> players;

    public Team(String name){
        this.setName(name);
        this.rating = 0.0;
        this.players = new HashMap<>();
    }

    public double getRating(){
        return  this.rating;
    }

    private void addToTeamRating(double rating){
        this.rating = this.rating + rating;
    }

    private void removeFromTeamRating(double rating){
        this.rating = this.rating - rating;
    }

    public void addPlayer(Player player){
        this.players.put(player.getName(), player);
        addToTeamRating(player.getOverallSkillLevel());
    }

    public void removePlayer(String name){
        if(this.players.containsKey(name)){
            Player temp = players.get(name);
            removeFromTeamRating(temp.getOverallSkillLevel());
            this.players.remove(name);
        } else {
            throw new IllegalArgumentException("Player " + name + " is not in " + this.getName() + " team.");
        }
    }

    public boolean hasPlayer(String name){
        return players.containsKey(name);
    }

    public String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }
}
