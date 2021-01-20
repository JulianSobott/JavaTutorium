import java.lang.reflect.Executable;

public class Test extends Exception{

    public Test(String message) {
        super(message);

        String.valueOf(10);
    }

    @Override
    public String getMessage() {
        super.printStackTrace();
        return super.getMessage();
    }
}
