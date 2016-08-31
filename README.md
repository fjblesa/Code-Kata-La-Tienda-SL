# Code-Kata-La-Tienda-SL

CODE KATA LA TIENDA SL

Queremos hacer una aplicación que gestione los productos de “La tienda SL”. Estos productos van degradando su calidad cada día, pero contamos con un sistema que diariamente actualiza dicha calidad. 
Como funciona nuestro sistema:
•	Todos los ítems tienen un atributo caducidad que nos indica el número óptimo para venderlo.
•	Todos los ítems tienen un atributo valor que define la calidad del producto.
•	Al finalizar el día ambos atributos se actualizan automáticamente.

Detalles:
•	Cuando el contador de caducidad llega a 0, la calidad de degrada el doble de rápido.
•	La calidad de un producto nunca puede ser negativa.
•	“Botella de vino tinto” en lugar de perder calidad, la incrementa cada día que pasa.
•	La calidad de un ítem nunca puede ser 50.
•	“Queso azul” es un producto que nunca pierde calidad ni cambia su valor de caducidad.
•	“Acceso VIP Eric Mauller”:
o	Incrementa la calidad en lugar de perderla cada día que pasa.
o	La calidad se incrementa en 2 cuando quedan 10 días o menos.
o	La calidad se incrementa en 3 cuando quedan 5 días o menos.
•	“Tarta de Manzana” pierde la calidad el doble de rápido que un producto normal

Notas:
1.	Crea una clase denominada “actualizar productos” y añádele el código que consideres necesario para que el sistema funcione correctamente.
2.	Crea una clase “Producto” que posea el siguiente código (Esta clase no se puede modificar nada): 

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
	
3.	El valor máximo que puede tener un producto es 50, no obstante “queso azul” es un producto no perecedero, si tuviese 80 no ocurriría nada
4.	A ser posible realiza el ejercicio usando TDD.
5.	Crea una clase app  para mostrar por consola los resultados para varios días de la actualización de los productos, ejemplo:
listaProductos.add(new Producto("Macarrones", 10, 20))
listaProductos.add(new Producto("Botella Vino Tinto", 2, 0))
listaProductos.add(new Producto("Colonia", 5, 7))
listaProductos.add(new Producto("Queso Azul", -1, 80))
listaProductos.add(new Producto("Acceso VIP Eric Mauller", 15, 20))
listaProductos.add(new Producto("Tarta de manzana", 3, 6))
for (int i = 0; i < dias; i++) {
System.out.println("-------- dia " + i + " --------");
	System.out.println("nombre, caducidad, valor");
	// imprimimos la lista de productos por consola
	listaProductos.forEach(System.out::println);
	System.out.println();	
	app.actualizarProductos();	
}
