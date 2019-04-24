import java.io.Serializable;
public class Comprador extends Person implements Serializable {
	private String numeroCliente;
	public Comprador(){
		
	}
	public Comprador(String numeroCliente){
		this.numeroCliente=numeroCliente;
	}
	public Comprador(String name,int age,int height, int weight,String eyeColor,String gender,String numeroCliente){
		//super(name,age,height,weight,eyeColor,gender);
		this.numeroCliente=numeroCliente;
	}
	public String getNumeroCliente(){
		return this.numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente){
		this.numeroCliente=numeroCliente;
	}

}