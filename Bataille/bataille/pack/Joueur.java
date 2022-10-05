package bataille.pack;


public class Joueur {
	
//Propriétés
  private Carte[] tabCard = new Carte[26];
  private int points = 0;
  
 //Méthodes
  public Carte tireCarte(Carte aCard) {
	  
	  tabCard[tabCard.length - 2 + 1] = aCard;
	  return tabCard[tabCard.length - 1];	  
  }
  
  public int ajouteCarte() {
	  
	  points++; 
	  return points;  
	  
  }
  
}