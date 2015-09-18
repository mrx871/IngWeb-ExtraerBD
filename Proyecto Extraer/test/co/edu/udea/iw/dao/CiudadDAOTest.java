package co.edu.udea.iw.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.impl.CiudadDAOImpl;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;

public class CiudadDAOTest {

	@Test
	public void testObtener() {
		int total = 1;
		CiudadDAO dao = null;
		List<Ciudad> lista = null;
		
		try {
			dao = new CiudadDAOImpl();
			lista = dao.obtener();
			
			// Cuando no se cumple fue que no retorno y entra al Fail
			assertTrue (total<= lista.size());
		}
		catch (MyException e) {
			fail (e.getMessage());
		}
	}

	@Test
	public void testObtenerString() {
		CiudadDAO dao = null;
		Ciudad ciudad = null;
		
		try{
			dao = new CiudadDAOImpl();
			ciudad = dao.obtener("4");
			
			// Para saber si es nulo o no
			assertTrue (ciudad != null);
		}
		catch (MyException e) {
			fail (e.getMessage());
		}
	}

}
