import java.io.IOException;

public class CustomException extends Exception {
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }
}
