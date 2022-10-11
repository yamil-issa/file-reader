import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseTextReader extends TextReader {

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(String path) {
		this.path = path;
		
        System.out.println("\n\r");
		
		System.out.println("Voici le texte affiché avec les lignes inversées");
		
		System.out.println("\r\n");
		FileInputStream in = null;
		File f = new File(this.path);
		
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
		ArrayList<String> lines = new ArrayList<String>();
		
		Scanner content = new Scanner(in);
		while(content.hasNext()) {
			lines.add(content.nextLine());
			
		}
		content.close();
		
		 for (int i = lines.size() - 1; i >= 0; i--) {
		        System.out.println(lines.get(i));
		    }
		
	}
	
	

}
