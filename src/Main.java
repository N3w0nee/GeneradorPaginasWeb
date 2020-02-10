import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "pagina.html";
		File fichero = new File(ruta);
		
		try {
			fichero.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			bw.write("<html>");
			bw.newLine();
			bw.write("<body>");
			bw.newLine();
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Dame el titulo");
			String titulo = scan1.nextLine();
			System.out.println("Dame el h1");
			String h1 = scan1.nextLine();
			System.out.println("Dame un parrafo");
			String p = scan1.nextLine();
			System.out.println("Que imagen quieres? 1. Perro 2.Gato 3. Gallina 4. Tiburon 5. Cangrejo");
			int img = scan2.nextInt();
			bw.write("<title>" +  titulo + "</title>");
			bw.newLine();
			bw.write("<style> body {"
					+ "background-color:red;}</style>");
			bw.newLine();
			bw.write("<h1>" +  h1 + "</h1>");
			bw.newLine();
			bw.write("<p>" +  p + "</p>");
			bw.newLine();
			if (img==1) {
				bw.write("<img " + "src=\"https://dam.ngenespanol.com/wp-content/uploads/2019/10/perros-personalidad-2.jpg\""+  ">" + "</img>");
				bw.newLine();
			}
			if (img==2) {
				bw.write("<img " + "src=\"https://www.purina.es/gato/purina-one/sites/g/files/mcldtz1856/files/2018-06/Mi_gato_no_come%20%282%29.jpg\""+  ">" + "</img>");
				bw.newLine();
			}
			if (img==3) {
				bw.write("<img " + "src=\"https://www.gallinaponedora.com/wp-content/uploads/2018/04/gallina-delaware.jpg\""+  ">" + "</img>");
				bw.newLine();
			}
			if (img==4) {
				bw.write("<img " + "src=\"https://www.nationalgeographic.com.es/medio/2018/02/27/tiburon__1280x720.jpg\""+  ">" + "</img>");
				bw.newLine();
			}
			if (img==5) {
				bw.write("<img " + "src=\"https://static.iris.net.co/semana/upload/images/2019/3/1/603344_1.jpg\""+  ">" + "</img>");
				bw.newLine();
			}
			bw.write("</body>");
			bw.newLine();
			bw.write("</html>");
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
