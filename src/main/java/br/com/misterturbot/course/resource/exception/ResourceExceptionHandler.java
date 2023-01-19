package br.com.misterturbot.course.resource.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.misterturbot.course.service.exception.DatabaseException;
import br.com.misterturbot.course.service.exception.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException rnfe, HttpServletRequest request) {
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError stdError = new StandardError(Instant.now(), status.value(), error, rnfe.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(stdError);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> resourceNotFound(DatabaseException dbexc, HttpServletRequest request) {
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError stdError = new StandardError(Instant.now(), status.value(), error, dbexc.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(stdError);
	}	
}
