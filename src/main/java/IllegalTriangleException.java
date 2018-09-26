public class IllegalTriangleException extends Exception {
    private String errorMessage;

    public IllegalTriangleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }

}
