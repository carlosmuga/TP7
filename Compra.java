import java.io.Serializable;
public class Compra implements Serializable {
  private Empleado emple;
  private Comprador comp;
  private Producto product;
  private int cant;
  public Compra() {
    // constructor por defecto
    emple= new Empleado();
    comp=new Comprador();
    product=new Producto();
    cant = 0;
  }
  public Empleado getEmpleado(){
    return emple;
  }
  public void setEmpleado(String nombreEmpresa,String numeroEmpleado){
    emple.setNombreEmpresa(nombreEmpresa);
    emple.setNumeroEmpledo(numeroEmpleado);
  }
  public Comprador getComprador(){
    return comp;
  }
  public void setComprador(String numeroCliente){
    comp.setNumeroCliente(numeroCliente);
  }
  public void setProducto(String color, int peso, String tipo,int precio,String nombre){
    product.setNombre(nombre);
    product.setPeso(peso);
    product.setTipo(tipo);
    product.setPrecio(precio);
    product.setColor(color);
  }
  public Producto getProducto(){
    return product;
  }
  public int getCant() {
    return cant;
  }
  public void setCant(int cant) {
    this.cant = cant;
  }
}
