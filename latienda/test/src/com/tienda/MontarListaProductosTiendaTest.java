package src.com.tienda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.com.tienda.productos.Producto;

public class MontarListaProductosTiendaTest {

	private MontarListaProductosTienda montarListaProductos;
	
	@Before
	public void setUp()  {
		montarListaProductos = new MontarListaProductosTienda();
	}	
	
	@Test
	public void montarListaOK()
	{			
		Assert.assertEquals(montarListaProductos.anyadirProductos(new Producto("Producto Test",1,12), 
				new Producto("Producto Test", 90, 11)).size(),2);
	}
	
	@Test
	public void montarListaNull()
	{
		Assert.assertEquals(montarListaProductos.anyadirProductos(null).size(),0);
	}
}
