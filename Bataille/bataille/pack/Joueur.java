package bataille.pack;


public class Joueur {
	
//Propriétés
  private Carte[] tabCard;
  private int points = 0;
  
 //Méthodes
  public Carte tireCarte(Carte aCard) {

	  Carte carteTire = aCard;
	  return carteTire;	  
  }
  
  public int ajouteCarte() {
	  
	  points++; 
	  return points;  
	  
  }
  
}