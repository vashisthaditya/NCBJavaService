package com.stackroute.restaurantspringboot.exception;

@SuppressWarnings("serial")
public class DatabaseNotAvailableException extends Exception{
	
   public DatabaseNotAvailableException() {
	
    super();
	
  }
   public DatabaseNotAvailableException(String msg)
   {
	   
	super(msg);
	
   }
}
