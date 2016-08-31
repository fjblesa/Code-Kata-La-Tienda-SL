package src.com.tienda.productos.calidad;

import src.com.tienda.productos.Producto;
/**
 * 
 *Producto vino posee calidades especiales
 *
 */
public class Vino extends Calidad{
	
	private Integer CERO = 0;
	public Vino(Producto producto) {
		super(producto);
	}

	@Override
	public void aplicar() {
		Integer valor = producto.getValor();
		Integer caducidad = producto.getCaducidad();
		
		if(validar(valor) || valor.equals(CERO))
			producto.setValor(valor+UNIDAD_A_APLICAR);
		
		producto.setCaducidad(caducidad -UNIDAD_A_APLICAR);
	}
}
