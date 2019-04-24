import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.Serializable;
public class demo1 {
   public static void main(String args[]) {
          List<String> lista = new ArrayList<>();
          List<String> lista1 = new ArrayList<>();
          
          boolean sal = false;
          Scanner in = new Scanner(System.in);
          String opcion="Continuar";
          String vari="";
          String var1="";
          String nombres="";
          String numeros="";
          int i=0;
          int preciototal=0;
          Compra una_compra = new Compra();
          do{
            System.out.println("Introduce 1 para comprar, 0 para recibir el TicketCompra ");
            switch(in.next()){
                case "1":
                    i=i+1;
                    
                    System.out.println("Introduzca su nombre");
                    nombres=in.next();
                    una_compra.getComprador().setName(nombres);
                    numeros=Integer.toString(i);
                    una_compra.getComprador().setNumeroCliente(numeros);               
                    while(opcion.equals("Continuar")||opcion.equals("continuar")){
                      System.out.println("Introduzca el articulo a comprar");
                      vari=in.next();
                      una_compra.getProducto().setPrecio((int )(Math.random() * 10 + 1));

                      una_compra.getProducto().setNombre(vari);
                      lista.add(vari);
                      System.out.println("Introduzca la cantidad");
                      var1=in.next();
                      una_compra.setCant(Integer.parseInt(var1));
                      lista1.add(var1);
                      System.out.println("Precio de "+una_compra.getProducto().getNombre()+" "+una_compra.getProducto().getPrecio()+" $ ");
                      
                      preciototal=preciototal+Integer.parseInt(var1)*una_compra.getProducto().getPrecio();
                      System.out.println("Escribe Continuar para seguir con la compra");
                      opcion=in.next();
                    }
                    break;
                case "0":
                    sal=true;
                    break;
            }          
          }while(!sal);
          String save=una_compra.getComprador().getName()+"\nNumero de cliente "
          +una_compra.getComprador().getNumeroCliente()+"\nLista de productos "+lista+"\nCantidad de estos"
          +lista1+"\nPrecio total de la compra "+preciototal+"\nMuchas gracias por su compra, fue atendido por\n"+
          una_compra.getEmpleado().getName()+"\nNumero de empleado "+una_compra.getEmpleado().getNumeroEmpleado();

          System.out.println(save);

          System.out.println("Desea guardar la compra en modo texto? Si");
          String opcion1=in.next();
          try {
              FileOutputStream serializar = new FileOutputStream("Ticket.dat",true);
              ObjectOutputStream serializado = new ObjectOutputStream(serializar);
              serializado.writeObject(una_compra);
              serializado.close();
          } catch (IOException e) {
                  e.printStackTrace();
          }
          if(opcion1.equals("Si")||opcion1.equals("si")){
              BufferedWriter bw = null;
              FileWriter fw = null;
              try {
                  File file = new File("TicketCompra.txt");
                
                  if (!file.exists()) {
                      file.createNewFile();
                  }
              
                  fw = new FileWriter(file.getAbsoluteFile(), true);
                  bw = new BufferedWriter(fw);
                  bw.write("\n");
                  bw.write("-----------------------------------------------------------------------------\n");
                  bw.write(save);
                  System.out.println("informacion agregada!");
              } catch (IOException e) {
                  e.printStackTrace();
              } finally {
                  try {
                      if (bw != null)
                          bw.close();
                      if (fw != null)
                          fw.close();
                  } catch (IOException ex) {
                      ex.printStackTrace();
                  }
              }
          }
          
  }
}