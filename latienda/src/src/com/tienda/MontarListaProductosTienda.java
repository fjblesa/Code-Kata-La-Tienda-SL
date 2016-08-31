/**
 * 
 */
package src.com.tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import src.com.tienda.productos.Producto;

/**
 * Clase para anyadir productos a la lista
 *
 */
public class MontarListaProductosTienda {
	List<Producto> listaProductos ;
	
	public MontarListaProductosTienda() {
	this.listaProductos=new ArrayList<>();
	}
	
	/**
	 * Funcion para añadir n productos a una lista
	 * @param variosProductos
	 * @return 
	 */
	public  List<Producto> anyadirProductos(Producto ... variosProductos) {
		
		try {
			Stream.of(variosProductos).forEach(producto->listaProductos.add(producto));
		} catch (Exception e) {
			System.out.println("Se ha producido un error: el producto indicado no es correcto");
		}
		return listaProductos;
	}
}
