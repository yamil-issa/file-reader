public class MainReader {

	public static void main(String[] args) {
		//C:\Users\issay\eclipse-workspace\lecteur-fichier\text.txt
	
		NormalTextReader reader1 =  new NormalTextReader();
		reader1.read("C:\\Users\\issay\\eclipse-workspace\\lecteur-fichier\\text.txt");
		
		PalindromicTextReader reader2 = new PalindromicTextReader();
		reader2.read("C:\\Users\\issay\\eclipse-workspace\\lecteur-fichier\\text.txt");
		
		
		
		
		
	}

}
