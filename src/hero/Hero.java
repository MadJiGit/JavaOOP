package hero;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }


    public String getUsername() {
        return this.username;
    }

    public int getLevel() {
        return this.level;
    }
    @Override
    public String toString() {

        String[] sss = this.getClass().getName().split("\\.");
        return String.format("Type: %s Username: %s Level: %s",
                sss[sss.length - 1],
                this.getUsername(),
                this.getLevel());
    }
}
