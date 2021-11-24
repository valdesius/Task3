package valdes.inc.com.company;

public class MainTestNotPassedException extends Exception{
    public MainTestNotPassedException() {
        System.out.println("All tests not passed");
    }

    public MainTestNotPassedException(String message) {
        super(message);
    }

    public MainTestNotPassedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainTestNotPassedException(Throwable cause) {
        super(cause);
    }

    public MainTestNotPassedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
