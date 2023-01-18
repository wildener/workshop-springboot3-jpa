package br.com.misterturbot.course.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4585169184173126832L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id = " + id);
	}
}
