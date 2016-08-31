package src.com.tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.com.tienda.productos.Producto;
import src.com.tienda.utils.UtilidadesTest;

public class VinoTest extends UtilidadesTest{

	private List<Producto> listaProductos;
	
	@Before
	public void setUp()  {
		listaProductos = new ArrayList<>();
	}

	@Test
	public void testVinoValorCeroAumenta(){
		listaProductos.add(new Producto(VINO, DOS, CERO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),UNO);
	}
	
	@Test
	public void testVinoValorMayorCincuenta(){
		listaProductos.add(new Producto(VINO, DOS, CIEN));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CINCUENTA);
	}
	
	@Test
	public void testVinoValorNoNegativo(){
		listaProductos.add(new Producto(VINO, DOS, MENOSDOS));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),UNO);
	}
}
