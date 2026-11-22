class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class userdefined {
    public static void main(String[] args) {
        try {
            int age = 17;

            if (age < 18) {
                throw new CustomException("you are not eligible");
            } else {
                System.out.println("congra! you are eligible");
            }

        } catch (CustomException e) {
            System.out.println("CustomException occured: " + e.getMessage());
        }
    }
}