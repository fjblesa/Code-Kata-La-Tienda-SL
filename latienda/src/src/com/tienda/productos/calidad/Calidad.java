package src.com.tienda.productos.calidad;

import src.com.tienda.productos.Producto;
import src.com.tienda.validaciones.IValidar;

/**
 * 
 * Clase para aplicar el calculo de calidad
 *
 */
public abstract class Calidad implements ICalidad, IValidar {

	private final Integer CERO = 0;
	private final Integer CINCUENTA = 50;
	protected Integer UNIDAD_A_APLICAR = 1;
	protected Producto producto;

	public Calidad() {

	}

	public Calidad(Producto producto) {
		try {
			if (producto.getValor() < CERO)
				producto.setValor(CERO);

			if (producto.getValor() > CINCUENTA)
				producto.setValor(CINCUENTA);

			this.producto = producto;
		} catch (Exception e) {
			System.out.println("Se ha producido un error: Parámetro informado no valido");
		}
	}

	@Override
	public void aplicar() {

		Integer valor = producto.getValor();
		Integer caducidad = producto.getCaducidad();

		producto.setCaducidad(caducidad - UNIDAD_A_APLICAR);
		caducidad = producto.getCaducidad();

		if (caducidad.equals(CERO))
			UNIDAD_A_APLICAR = 2 * UNIDAD_A_APLICAR;
		if (validar(valor))
			producto.setValor(valor - UNIDAD_A_APLICAR);
	}
}
