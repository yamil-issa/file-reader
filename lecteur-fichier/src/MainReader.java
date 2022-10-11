public class MainReader {

	public static void main(String[] args) {
		//D:\eclipseRepo\lecteur-fichier\text.txt
	
		NormalTextReader reader1 =  new NormalTextReader();
		reader1.read("D:\\eclipseRepo\\lecteur-fichier\\text.txt");
		
		ReverseTextReader reader2 = new ReverseTextReader();
		reader2.read("D:\\eclipseRepo\\lecteur-fichier\\text.txt");
		
		PalindromicTextReader reader3 = new PalindromicTextReader();
		reader3.read("D:\\eclipseRepo\\lecteur-fichier\\text.txt");
		
		
		
		
		
		
		
	}

}
