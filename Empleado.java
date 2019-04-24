import java.io.Serializable;
public class  Empleado extends Person implements Serializable {
	private String nombreEmpresa;
	private String numeroEmpleado;
	public Empleado(){
		this.nombreEmpresa="ayesa";
		this.numeroEmpleado="25";
	}
	public Empleado(String nombreEmpresa,String numeroEmpleado){
		this.nombreEmpresa = nombreEmpresa;
	}
	public Empleado(String name,int age,int height, int weight,String eyeColor,String gender,String nombreEmpresa,String numeroEMpleado){
		//super(name,age,height,weight,eyeColor,gender);
		this.nombreEmpresa = nombreEmpresa;
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getNombreEmpresa(){
		return this.nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa){
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getNumeroEmpleado(){
		return this.numeroEmpleado;
	}
	public void setNumeroEmpledo(String numeroEmpleado){
		this.numeroEmpleado = numeroEmpleado;
	}
	

}