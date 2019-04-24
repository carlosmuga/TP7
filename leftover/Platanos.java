public class Platanos extends Producto{
	private String nombre;
	private int precio;
	public Platanos(){

	}
	public Platanos(String nombre,int precio){
		this.nombre=nombre;
		this.precio=precio;
	}
	public Platanos(String color, int peso, String tipo,String nombre,int precio){
		this.nombre=nombre;
		this.precio=precio;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setPrecio(int precio){
		this.precio=precio;
	}
	public int getPrecio(){
		return this.precio;
	}
}