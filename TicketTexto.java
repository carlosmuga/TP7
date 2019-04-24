import java.io.*;
public class TicketTexto implements TicketInterface{
	public TicketTexto(){
		
	}
	public void grabar(String s){
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
                  bw.write(s);
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