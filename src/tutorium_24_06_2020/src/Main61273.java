
public class Main61273 {

    public static void main(String[] args) {
        try {
            String x = readFile("");
        } catch (CustomException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

        System.out.println("end");
    }


    static String readFile(String path) throws CustomException {
        if (path.length() < 2) {
            // file not exists
            throw new CustomException("Something went wrong");
        } else {

            // read ok
            return "File content";
        }
    }
}

