package src.com.tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.com.tienda.productos.Producto;
import src.com.tienda.utils.UtilidadesTest;

public class NormalTest extends UtilidadesTest{

	private List<Producto> listaProductos;
	
	@Before
	public void setUp()  {
		listaProductos = new ArrayList<>();
	}

	@Test
	public void testNormalValorDecreceCalidadDecrece(){
		listaProductos.add(new Producto(NORMAL, DOS, CINCO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CUATRO);
	}
	
	@Test
	public void testNormalValorNoNegativo(){
		listaProductos.add(new Producto(NORMAL, DOS, MENOSDOS));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CERO);
	}
	
	@Test
	public void testNormalValorDecreceNoNegativo(){
		listaProductos.add(new Producto(NORMAL, DOS, CERO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CERO);
	}
	
	@Test
	public void testNormalValorMayorCincuenta(){
		listaProductos.add(new Producto(NORMAL, DOS, CIEN));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CINCUENTA);
	}
	
	@Test
	public void testNormalCaducidadCeroValorDecreceDoble(){
		listaProductos.add(new Producto(NORMAL, UNO, CINCO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),CERO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),TRES);
	}
}
