package co.edu.udea.iw.dao;

// Tener cuidado con java awt
import java.util.List;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;


// Las interfaces por defecto tienen visibilidad publica
public interface CiudadDAO {
	
	
	List <Ciudad> obtener () throws MyException;
	Ciudad obtener (String codigoArea) throws MyException;
}
