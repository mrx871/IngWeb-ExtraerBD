package co.edu.udea.iw.dao.cnf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.udea.iw.exception.MyException;

public class DataSource {

	// Throws para poder manejar las excepciones propias
	public Connection getConnection () throws MyException{
		Connection con = null;
		try{
			// Busca que si este el driver en las librerias
			Class.forName("com.mysql.jdbc.Driver");
			// Crea la conexion
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/clase","root","root");
		}
		catch (ClassNotFoundException e) {
			throw new MyException("No se ha cargado el driver de la bd", e);
		}
		catch (SQLException e){
			throw new MyException(e);
		}
		
		return con;
	}
}
