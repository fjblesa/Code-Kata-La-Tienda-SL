package src.com.tienda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.com.tienda.utils.UtilidadesTest;
import src.com.tienda.validaciones.IValidar;

public class IValidarTest extends UtilidadesTest{

	private IValidar validar;
	
	@Before
	public void setUp()  {
		validar = new IValidar() {
		};
	}

	@Test
	public void validarMasCiencuenta() {
		Assert.assertFalse(validar.validar(SESENTA));
	}
	
	@Test
	public void validarCiencuenta() {
		Assert.assertFalse(validar.validar(CINCUENTA));
	}
	
	@Test
	public void validarMenosCero() {
		Assert.assertFalse(validar.validar(MENOSDOS));
	}

	@Test
	public void validarCero() {
		Assert.assertFalse(validar.validar(CERO));
	}
	
	@Test
	public void validarMayorCeroMenorCincuenta() {
		Assert.assertTrue(validar.validar(VEINTITRES));
	}
	
	@Test
	public void validarNulo() {
		Assert.assertTrue(validar.validar(null));
	}
}
