public class StackTraceExample {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero()
    {
        int result = 10 / 0; // This will cause a division by zero exception
    }
}