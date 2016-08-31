package src.com.tienda.productos.calidad;

import src.com.tienda.productos.Producto;
/**
 * 
 * Producto Vip posee calidades especiales
 *
 */
public class Vip extends Calidad{

	private Integer dias;
	private Integer UNIDAD_A_APLICAR_VALOR_VIP = 1;
	
	public Vip(Producto producto,Integer dias) {
		super(producto);
		this.dias = dias;
	}

	@Override
	public void aplicar() {
		Integer valor = producto.getValor();
		Integer caducidad = producto.getCaducidad();
		
		try {
			aumentarDobleOTripleCalidad(dias);
			
			if(validar(valor)|| valor<50)
				producto.setValor(valor+UNIDAD_A_APLICAR_VALOR_VIP);
			
			producto.setCaducidad(caducidad - UNIDAD_A_APLICAR);
		} catch (Exception e) {
			System.out.println("Se ha producido un error: Parámetros de entrada mal informados");
		}
	}
	/**
	 * Aumentar el doble o triple la calidad depediendo de los días
	 * @param dias
	 * @return
	 */
	private Integer aumentarDobleOTripleCalidad(Integer dias)
	{
		/*Si los dias son menor o igual a 10 la calidad aumenta en 2*/
		if(dias<=10)
			UNIDAD_A_APLICAR_VALOR_VIP = 2;
		
		/*Si los dias son menor o igual a 5 la calidad aumenta en 3*/
		if(dias<=5)
			UNIDAD_A_APLICAR_VALOR_VIP = 3;
		
		return UNIDAD_A_APLICAR_VALOR_VIP;
	}
}
