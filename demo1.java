import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.Serializable;
import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class demo1 {
      private Label respuesta = new Label("");
   public static void main(String args[]) {

          List<String> lista = new ArrayList<>();
          List<String> lista1 = new ArrayList<>();
          List<String> lista2 = new ArrayList<>();
          
          boolean sal = false;
          Scanner in = new Scanner(System.in);
          String opcion="si";
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
                    while(opcion.equals("Si")||opcion.equals("si")){
                      System.out.println("Introduzca el articulo a comprar");
                      vari=in.next();
                      System.out.println(una_compra.getProducto().getPeso()+" kg ");
                      una_compra.getProducto().setPrecio((int )(Math.random() * 10 + 1));
                      lista2.add(Integer.toString(una_compra.getProducto().getPrecio())+"$");

                      una_compra.getProducto().setNombre(vari);
                      lista.add(vari);
                      System.out.println("Introduzca la cantidad");
                      var1=in.next();
                      una_compra.setCant(Integer.parseInt(var1));
                      lista1.add(var1);
                      System.out.println("Precio de "+una_compra.getProducto().getNombre()+" "+una_compra.getProducto().getPrecio()+" $ ");
                      
                      preciototal=preciototal+Integer.parseInt(var1)*una_compra.getProducto().getPrecio();
                      System.out.println("Desea Continuar?");
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
          +lista1+"\n Precio "+lista2+" \nPrecio total de la compra "+preciototal+" $ \nMuchas gracias por su compra, fue atendido por\n"+
          una_compra.getEmpleado().getName()+"\nNumero de empleado "+una_compra.getEmpleado().getNumeroEmpleado()
          +"\n\n "+una_compra.getFecha().toString();

          System.out.println(save);
          //TicketBD tbd = new TicketBD();
          //tbd.grabar(save);

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
              TicketTexto tt= new TicketTexto();
              tt.grabar(save);
          }
  }
}