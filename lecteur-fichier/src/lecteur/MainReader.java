package lecteur;
import java.util.Scanner;

public class MainReader {

	public static void main(String[] args) {
				
		String saisie;
		
		Scanner console = new Scanner(System.in);
		System.out.print("Entrez le chemin du fichier : \n");
		
		saisie = console.nextLine();
	
		NormalTextReader reader1 =  new NormalTextReader();
		reader1.read(saisie);
		
		ReverseTextReader reader2 = new ReverseTextReader();
		reader2.read(saisie);
		
		PalindromicTextReader reader3 = new PalindromicTextReader();
		reader3.read(saisie);
		
	}

}
