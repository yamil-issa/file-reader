package bataille.pack;


public class Joueur {
	
//Propriétés
  private Carte[] tabCard = new Carte[26];
  private int points = 0;
  
 //Méthodes
  public Carte tireCarte(Carte aCard) {

	  Carte carteTire = aCard;
	  tabCard[tabCard.length - 1] = carteTire;
	  return tabCard[tabCard.length - 1];	  
  }
  
  public int ajouteCarte() {
	  
	  points++; 
	  return points;  
	  
  }
  
}