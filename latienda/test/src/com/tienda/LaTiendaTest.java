package src.com.tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import src.com.tienda.productos.Producto;
import src.com.tienda.utils.UtilidadesTest;

public class LaTiendaTest extends UtilidadesTest{

	private List<Producto> listaProductos;
	
	@Before
	public void setUp() {
		listaProductos = new ArrayList<>();
	}

	@Test
	public void testTiendaNull(){
		LaTienda tienda = new LaTienda(null,CINCO);
		tienda.actualizarProductos();
	}
	@Test
	public void testNormalNull(){
		listaProductos.add(null);
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
	}
}
