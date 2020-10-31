public class CustomException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public CustomException()
    {
        super("Something went wrong");
    }
    public CustomException(String message)
    {
        super(message);
        System.out.println(message);
    }
}
