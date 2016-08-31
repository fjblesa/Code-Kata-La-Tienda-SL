package src.com.tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.com.tienda.productos.Producto;
import src.com.tienda.utils.UtilidadesTest;

public class NoCambiaTest extends UtilidadesTest{

	private List<Producto> listaProductos;

	@Before
	public void setUp()  {
		listaProductos = new ArrayList<>();
	}
	
	@Test
	public void testQuesoAzulNoCambiaValorNiCaducidad(){
		listaProductos.add(new Producto(NOCAMBIA, DOS, CERO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),DOS);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CERO);
	}
}
