import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromicTextReader extends TextReader{

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	
	public void read(String path) {
		this.path = path;
	
		FileInputStream on = null;
		File f2 = new File(this.path);
		
		try {
			on = new FileInputStream(f2);
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
		Scanner content2 = new Scanner(on);
		while(content2.hasNext()) {
			System.out.println(content2.nextLine());
			
		}
		content2.close();
		
		System.out.println("\n\r");
		
		System.out.println("Voici le texte affiché de maniere palindromique");
		
		System.out.println("\n\r");
		
		FileInputStream in = null;
		File f = new File(this.path);
		
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
		Scanner content = new Scanner(in);
		while(content.hasNext()) {
			StringBuilder sb = new StringBuilder(content.nextLine());
			System.out.println(sb.reverse());
			
		}
		content.close();
		
		
		
	}
	

}
