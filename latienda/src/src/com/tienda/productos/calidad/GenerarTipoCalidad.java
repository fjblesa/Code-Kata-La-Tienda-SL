package src.com.tienda.productos.calidad;

import src.com.tienda.datos.NombresProductos;
import src.com.tienda.productos.Producto;

public class GenerarTipoCalidad {

	/**
	 * Factoría para elegir la aplicación de calidad dependiendo del producto
	 * pasado por parametro
	 * 
	 * @param producto
	 */
	public static void generar(Producto producto, Integer dias) {
		NombresProductos nombreProductoEnum = NombresProductos.getEnum(producto.getNombre());

		switch (nombreProductoEnum) {
		case VINO:
			new Vino(producto).aplicar();
			break;

		case QUESOAZUL:
			new NoCambia(producto).aplicar();
			break;

		case TARTA:
			new Tarta(producto).aplicar();
			break;

		case VIP:
			new Vip(producto, dias).aplicar();
			break;

		default:
			// por defecto todos los productos que no coincidan con los
			// especiales aplicara el calculo normal
			new Normal(producto).aplicar();
			break;
		}
	}
}
