package src.com.tienda.validaciones;

public interface IValidar {

	/**
	 * Funcion default  para la validación del máximo y mínimo de la calidad
	 * @param valor
	 * @return
	 */
	final static Integer MAXIMO=50;
	final static Integer MINIMO=0;
	
	public default Boolean validar(Integer valor){
		Boolean isValid = true;
		try {
			/*Un item no puede superar la calidad de 50*/
			if(valor>=MAXIMO)
				isValid= false;
			/*un item no puede tener calidad negativa*/
			if(valor<=MINIMO)				
				isValid= false;
		} catch (Exception e) {
			System.out.println("Se ha producido un error: Valor informado inválido");
		}
		return isValid;		
	}
}
