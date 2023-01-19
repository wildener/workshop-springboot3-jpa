package br.com.misterturbot.course.service.exception;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 4412257154068285443L;
	
	public DatabaseException(String msg) {
		super(msg);
	}
}
