public class ParametrosInvalidosException extends RuntimeException {
    // unchecked exception (não precisa de throws e try-catch)
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
