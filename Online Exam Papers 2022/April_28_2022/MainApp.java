package April_28_2022;

public class MainApp {
    public static void main(String[] args) {

        char[] array = {'R','a','v','i','s','h','k','a'};

        CharArray charArray = new CharArray(array);

        charArray.displayArray();
        charArray.swapFirstAndLast();
        charArray.displayString();

    }
}
