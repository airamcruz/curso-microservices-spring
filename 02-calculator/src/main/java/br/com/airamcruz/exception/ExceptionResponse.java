package br.com.airamcruz.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 4486051862651877299L;
	
	private String message;
    private String details;
    private LocalDateTime timestamp;
    
    public ExceptionResponse(String message, String details, LocalDateTime timestamp) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
}
