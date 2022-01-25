package cumpleempleados.config.exceptions;

public class BabRequestException extends RuntimeException {

    public BabRequestException() {
    }

    public BabRequestException(String message) {
        super(message);
    }
}
