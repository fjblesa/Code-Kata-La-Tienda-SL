package src.com.tienda.datos;
/**
 * Nombres de todos los productos para tratar su calidad, si no está registroado es otros
 *
 */
public enum NombresProductos {

	VINO("Botella Vino Tinto"), QUESOAZUL("Queso Azul"), VIP("Acceso VIP Eric Mauller"), TARTA(
			"Tarta de manzana"), OTROS("Otros");

	private final String productoEnum;

	NombresProductos(String productoEnum) {
		this.productoEnum = productoEnum;
	}

	public String getProductoEnum() {
		return productoEnum;
	}
/**
 * Leemos el enum a partir del nombre del producto que recibimos
 * @param nombre
 * @return
 */
	public static NombresProductos getEnum(String nombre) {
		
		NombresProductos[] valuesEnum = NombresProductos.values();
		
		for (NombresProductos oneEnum : valuesEnum) {
			if (oneEnum.getProductoEnum().equals(nombre))
				return oneEnum;
		}
		// si no lo encuentra añadimos a la lista como otros
		return NombresProductos.OTROS;
	}
}
