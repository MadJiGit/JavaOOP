package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {

        StringBuilder result = new StringBuilder();

        for (String st : this.numbers) {
            char[] temp = st.toCharArray();
            if(false == isContainingLetter(temp)) {
                result.append("Calling... ").append(st);
            } else {
                result.append("Invalid number").append("!");
            }

            result.append(System.lineSeparator());
        }

        return result.toString();
    }

    @Override
    public String browse() {

        StringBuilder result = new StringBuilder();

        for (String st : this.urls) {
            char[] temp = st.toCharArray();
            if(isContainingDigit(temp)) {
                result.append("Invalid URL").append("!");
            } else {
                result.append("Browsing: ").append(st).append("!");
            }

            result.append(System.lineSeparator());
        }

        return result.toString();
    }

    private boolean isContainingLetter(char[] ch){
        boolean containLetters = false;

        for( char c : ch){
            if(Character.isLetter(c)){
                containLetters = true;
                break;
            }
        }

        return containLetters;
    }

    private boolean isContainingDigit(char[] ch){
        boolean containNumbers = false;

        for( char c : ch){
            if(Character.isDigit(c)){
                containNumbers = true;
                break;
            }
        }

        return containNumbers;
    }
}
