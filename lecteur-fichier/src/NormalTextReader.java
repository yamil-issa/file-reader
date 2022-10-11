import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NormalTextReader extends TextReader{
	
	public NormalTextReader() {
	 
	}

	public void read(String path) {
		this.path = path;
		FileInputStream in = null;
		File f = new File(this.path);
		
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
		Scanner content = new Scanner(in);
		while(content.hasNext()) {
			System.out.println(content.nextLine());
			
		}
		content.close();

	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	
	
	


	

}
