package com.zosh.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobelExceptions {
	
	@ExceptionHandler(ChatException.class)
	public ResponseEntity<ErrorDetails>ChatExceptionHandler(ChatException ue,WebRequest req)
	{
		ErrorDetails error=new ErrorDetails(ue.getMessage(),req.getDescription(false),LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails>UserExceptionHandler(UserException ue,WebRequest req)
	{
		ErrorDetails error=new ErrorDetails(ue.getMessage(),req.getDescription(false),LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(PostException.class)
	public ResponseEntity<ErrorDetails>PostExceptionHandler(PostException ue,WebRequest req)
	{
		ErrorDetails error=new ErrorDetails(ue.getMessage(),req.getDescription(false),LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(CommentException.class)
	public ResponseEntity<ErrorDetails>CommentrExceptionHandler(CommentException ue,WebRequest req)
	{
		ErrorDetails error=new ErrorDetails(ue.getMessage(),req.getDescription(false),LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails>otherExceptionHandler(Exception ue,WebRequest req)
	{
		ErrorDetails error=new ErrorDetails(ue.getMessage(),req.getDescription(false),LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
}
