package io.ylab.user_microservice.service.exception;

/**
 * Exception слоя Service
 */
public class ServiceException extends Exception {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
