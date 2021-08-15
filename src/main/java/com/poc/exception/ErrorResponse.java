package com.poc.exception;

/**
 * The type Error response.
 */
public class ErrorResponse {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int errorCode;
    private String errorMessage;

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public int getErrorCode() {
        return errorCode;
    }


    /**
     * Gets error message.
     *
     * @return the error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Instantiates a new Error response.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public ErrorResponse(int errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}