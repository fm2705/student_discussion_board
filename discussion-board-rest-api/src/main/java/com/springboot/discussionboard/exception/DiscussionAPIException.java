package com.springboot.discussionboard.exception;

import org.springframework.http.HttpStatus;

public class DiscussionAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public DiscussionAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public DiscussionAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
