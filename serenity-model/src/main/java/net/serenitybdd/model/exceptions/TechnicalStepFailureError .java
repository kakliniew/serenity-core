package net.serenitybdd.model.exceptions;

public class TechnicalStepFailureError extends AssertionError {

    public TechnicalStepFailureError(String message, Throwable cause) {
        super(message, cause);
    }
}