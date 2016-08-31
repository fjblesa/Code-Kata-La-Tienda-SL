package src.com.tienda.productos.calidad;

import src.com.tienda.productos.Producto;
/**
 * Producto no cambia valor ni calidad
 *
 *
 */
public class NoCambia extends Calidad {

	public NoCambia(Producto producto) {
		super();
	}

	@Override
	public void aplicar() {
		/*se trata de un producto que no cambia por lo que no se llama al super*/
	}
}
