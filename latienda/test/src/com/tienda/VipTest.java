package src.com.tienda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.com.tienda.productos.Producto;
import src.com.tienda.utils.UtilidadesTest;

public class VipTest extends UtilidadesTest{

	private List<Producto> listaProductos;
	
	@Before
	public void setUp() {
		listaProductos = new ArrayList<>();
	}

	@Test
	public void testVIpMenosCincoDiasCalidadAumentaTresCaducidadDecreceUno(){
		listaProductos.add(new Producto(VIP, DOS, CERO));
		LaTienda tienda = new LaTienda(listaProductos,CUATRO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),TRES);
	}
	
	@Test
	public void testVIpCincoDiasCalidadAumentaTresCaducidadDecreceUno(){
		listaProductos.add(new Producto(VIP, DOS, CERO));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),TRES);
	}
	
	@Test
	public void testVIpMenosDiezDiasCalidadAumentaDosCaducidadDecreceUno(){
		listaProductos.add(new Producto(VIP, DOS, CERO));
		LaTienda tienda = new LaTienda(listaProductos,NUEVE);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),DOS);
	}

	@Test
	public void testVIpDiezDiasCalidadAumentaDosCaducidadDecreceUno(){
		listaProductos.add(new Producto(VIP, DOS, CERO));
		LaTienda tienda = new LaTienda(listaProductos,DIEZ);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),DOS);
	}
	
	@Test
	public void testVipValorMayorCincuenta(){
		listaProductos.add(new Producto(VIP, DOS, CIEN));
		LaTienda tienda = new LaTienda(listaProductos,CINCO);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),CINCUENTA);
	}
	
	@Test
	public void testVipValorNoNegativo(){
		listaProductos.add(new Producto(VINO, DOS, MENOSDOS));
		LaTienda tienda = new LaTienda(listaProductos,CINCUENTA);
		tienda.actualizarProductos();
		Assert.assertEquals(listaProductos.get(CERO).getCaducidad(),UNO);
		Assert.assertEquals(listaProductos.get(CERO).getValor(),UNO);
	}
	
	@Test
	public void testVipDiasNull(){
		listaProductos.add(new Producto(VINO, DOS, MENOSDOS));
		LaTienda tienda = new LaTienda(listaProductos,null);
		tienda.actualizarProductos();
	}
}
