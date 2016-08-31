package src.com.tienda.productos;

public class Producto{
	
    public Producto(String nombre, int caducidad, int valor) {
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.valor = valor;
    }
    
    private String nombre;
    private Integer caducidad;
    private Integer valor;
  
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(Integer caducidad) {
		this.caducidad = caducidad;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}


   @Override
   public String toString() {
        return this.nombre + ", " + this.caducidad + ", " + this.valor;
    }
}
