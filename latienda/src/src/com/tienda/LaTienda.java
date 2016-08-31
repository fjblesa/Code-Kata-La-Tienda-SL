package src.com.tienda;

import java.util.List;

import src.com.tienda.productos.Producto;
import src.com.tienda.productos.calidad.GenerarTipoCalidad;

class LaTienda {

	private List<Producto> productos;
	private Integer dias;

	public LaTienda(List<Producto> productos, Integer dias) {
		this.productos = productos;
		this.dias = dias;
	}

	/**
	 * Metodo para actualizar la lista de productos que tiene la tienda
	 */
	public void actualizarProductos() {
		if (productos == null || productos.isEmpty())
			System.out.println("No se han informado productos para su actualización");

		try {
			productos.forEach(producto -> {
				GenerarTipoCalidad.generar(producto, dias);
			});
		} catch (Exception e) {
			System.out.println("Se ha producido un error: Parámetros de entrada mal informados");
		}
	}
}
