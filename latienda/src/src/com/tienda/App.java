package src.com.tienda;

import java.util.List;

import src.com.tienda.productos.Producto;

/**
 * App para el control de una tienda de productos
 */
public class App {
	
	public static void main(String[] args) {
		
		System.out.println("*** LA TIENDA SL ***");
		// número de dias totales que vamos a aplicar la actualizacion de la lista
		// de productos
		
		Integer dias = 12;
				
		// Creamos la lista de los productos para la tienda */
		MontarListaProductosTienda montarListaProductos = new MontarListaProductosTienda();
		List<Producto> listaProductos = montarListaProductos.anyadirProductos(new Producto("Macarrones", 10, 20),
				new Producto("Botella Vino Tinto", 2, 0), new Producto("Colonia", 5, 7),
				new Producto("Queso Azul", 0, 80), new Producto("Queso Azul", -1, 80),
				new Producto("Acceso VIP Eric Mauller", 15, 20), new Producto("Acceso VIP Eric Mauller", 10, 47),
				new Producto("Acceso VIP Eric Mauller", 5, 47), new Producto("Tarta de manzana", 3, 6),
				new Producto("Producto no esperado", 4, 5));
		
		//la tienda con todos los productos
		LaTienda app = new LaTienda(listaProductos,dias);

		//actualizamos por cada día la lista de productos
		for (int i = 0; i < dias; i++) {
			
			System.out.println("-------- dia " + i + " --------");
			System.out.println("nombre, caducidad, valor");

			// imprimimos la lista de productos por consola
			listaProductos.forEach(System.out::println);

			System.out.println();
			
			app.actualizarProductos();
		}
	}
}
