package bataille.pack;
public class Carte {
	//Propriétés
	private String[] couleurTab = new String[]{"coeur", "carreau", "pique", "trefle"};
	private int[] valeurTab = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	
	private String couleur;
	private int valeur;
	
	//constructeurs
	public Carte(int coul, int val) {
		couleur = couleurTab[coul];
		valeur = valeurTab[val];
	}
	
	public Carte() {
		couleur = couleurTab[0];
		valeur = valeurTab[0];
	}
	
	//Méthodes
	
	public String getCouleur() {
		return this.couleur;	
	}
	
	public int getValeur() {
		return this.valeur;
	}
	
	public int compare(int otherValue) {	
		if (this.valeur < otherValue) {
			return 1;
			
		}
		
		else if (this.valeur > otherValue) {
			return 2;
			
		}
			
		else {
			
		}return 3;
		
	}
	
}