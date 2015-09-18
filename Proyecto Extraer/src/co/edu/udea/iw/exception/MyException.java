package co.edu.udea.iw.exception;

public class MyException extends Exception{

	// CTRL SHIFT S para generar automaticamente metodos, en este caso superclase
	
	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}
