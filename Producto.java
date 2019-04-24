import java.io.Serializable;
import java.util.Random;
public class Producto implements Serializable {
    private String color;
    private String tipo;
    private int precio;
    private String nombre;
    private int peso;
    public Producto() {
        this.precio=(int )(Math.random() * 10 + 1);
    }
    public Producto(String color, int peso, String tipo,int precio,String nombre) {
        this.color = color;
        this.peso = peso;
        this.tipo = tipo;
        this.precio=precio;
        this.nombre=nombre;
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
    public void setPeso(int p) {
      peso = p;
    }
    public int getPeso() {
      return peso;
    }
    public void setTipo(String t) {
      tipo = t;
    }
    public String getTipo() {
      return tipo;
    }
    public void setColor(String c) {
      color = c;
    }
    public String getColor() {
      return color;
    }
}
