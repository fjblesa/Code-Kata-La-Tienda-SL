package src.com.tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.com.tienda.productos.Producto;
import src.com.tienda.utils.UtilidadesTest;

public class TartaTest extends UtilidadesTest{

	private List<Producto> listaProductos;
	@Before
	public void setUp()  {
		listaProductos = new ArrayList<>();
	}
	
	@Test
	public void testTartaValorDecreceDobleNormalCaducidadDecreceIgual(){
		listaProductos.add(new Producto(TARTA, DOS, TRES));
		listaProductos.add(new Producto(NORMAL, DOS, DOS));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),listaProductos.get(UNO).getCaducidad());
		Assert.assertEquals(listaProductos.get(CERO).getValor(),listaProductos.get(UNO).getValor());
	}
	
	@Test
	public void testTartaValorNoNegativo(){
		listaProductos.add(new Producto(TARTA, DOS, MENOSDOS));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CERO);
	}
	@Test
	public void testTartaValorDecreceDobleNoQuedaNegativo(){
		listaProductos.add(new Producto(TARTA, DOS, UNO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CERO);
	}
	
	@Test
	public void testTartaValorMayorCincuenta(){
		listaProductos.add(new Producto(TARTA, DOS, CIEN));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CINCUENTA);
	}

	@Test
	public void testTartaValorNegativoUnoNoQuedaNegativo(){
		listaProductos.add(new Producto(TARTA, DOS, MENOSUNO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CERO);
	}
	
	@Test
	public void testTartaCaducidadCeroValorDecreceDoble(){
		listaProductos.add(new Producto(TARTA, UNO, CINCO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),CERO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),UNO);
	}
}
