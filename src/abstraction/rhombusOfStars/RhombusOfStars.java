package abstraction.rhombusOfStars;

public class RhombusOfStars {

    private int number;
    private String rhombus;

    public RhombusOfStars(int number) {
        setNumber(number);
        this.rhombus = "";
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public void calculateRhombus() {

        rhombus = (upperPartOfRhombus(number) +
                bottomPartOfRhombus(number - 1));
   }

    private String bottomPartOfRhombus(int num) {
        StringBuilder result = new StringBuilder();
        for (int row =num; row > 0; row--) {
            result.append(repeatedString(num - row, " "));
            result.append(repeatedString(row, "* "));
            result.append("\n");
        }

        return result.toString();
    }

    private String upperPartOfRhombus(int num) {
        StringBuilder result = new StringBuilder();
        for (int row = 1; row <= num; row++) {
            result.append(repeatedString(num - row, " "));
            result.append(repeatedString(row, "* "));
            result.append("\n");
        }

        return result.toString();
    }

    private String repeatedString(int row, String s) {
        return s.repeat(row);
    }


    @Override
    public String toString() {
        return rhombus;
    }
}
