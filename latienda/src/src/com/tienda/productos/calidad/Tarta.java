package src.com.tienda.productos.calidad;

import src.com.tienda.productos.Producto;
/**
 * 
 * Producto tarta posee calidades especiales
 *
 */
public class Tarta extends Calidad{
	
	private Integer CERO = 0;
	public Tarta(Producto producto) {
		super(producto);
	}

	@Override
	public void aplicar() {
		Integer valor = producto.getValor();
		Integer caducidad = producto.getCaducidad();
		
		producto.setCaducidad(caducidad -UNIDAD_A_APLICAR);
		caducidad = producto.getCaducidad();
		
		if(caducidad.equals(CERO))
			UNIDAD_A_APLICAR = 2*UNIDAD_A_APLICAR;
		
		if(validar(valor))
			producto.setValor(valor - 2*UNIDAD_A_APLICAR);
		
		if(producto.getValor() < CERO)
			producto.setValor(CERO);
	}
}
