package midtermreview;

public class Tdd {
    
    public static boolean isEven(int num) {
        if (num < 0 || num > 100) {
            throw new IllegalArgumentException("invalid");
        }
        return num % 2 == 0;
    }
}
