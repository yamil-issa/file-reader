package bataille.pack;


public class Bataille{
	public static void main(String[] args) {
		
		//initialisation du paquet de carte
		
		  Carte[] deck = new Carte[52];
		 
		  String fin = "";
		  
		  for(int i = 0; i < 51;  i++) {
			  int min = 0;
			  int max1 = 4;
			  int max2 = 13;
			  
			  int a = (int) (Math.random() * (max1 - min)) + min;
			  int b = (int) (Math.random() * (max2 - min)) + min;
			  
			  deck[i] = new Carte(a, b);	  
		  }
		  int result1 = 0;
		  int result2 = 0;
		  
	  //boucle de jeu
		  
	  for(int c = 0; c < 50;  c++) {
		  
		  Joueur j1 = new Joueur();
		  Joueur j2 = new Joueur();  
		   
		  String value1 = j1.tireCarte(deck[c]).getCouleur();
		  String value2 = j2.tireCarte(deck[c + 1]).getCouleur();
		  
		  Carte value3 = j1.tireCarte(deck[c]);
		  Carte value4 = j2.tireCarte(deck[c +1]);
		  
		  System.out.println("le joueur 1 a joué la carte" + " " + value3.getValeur() + " " + "de" + " " + value1);
		  System.out.println("le joueur 2 a joué la carte" + " " + value4.getValeur() + " " + "de" + " " +  value2 );
		  
		  int finalValue =   value3.compare(value4.getValeur());
		  
		  if(finalValue == 2){
			 result1 =  result1 + j1.ajouteCarte();
			 
		  }
		  else if(finalValue == 1) {
			 result2 = result2 + j2.ajouteCarte();
			
		  }
		  else if(finalValue == 3) {
			 result1 = result1 + j1.ajouteCarte();
			 result2 = result2 + j2.ajouteCarte();
		  }
		  
		  if(result1 > result2) {
			  fin = "le joueur 1 a gagné";
			  
		  }else if(result1 < result2) {
			  fin = "le joueur 2 a gagné";
		  }
		  else if(result1 == result2) {
			  fin = "égalité";
		  }
		  
		  System.out.println("le joueur 1 a" + " "  + result1 + " " + "points");
		  System.out.println("le joueur 2 a" + " "  + result2 + " " + "points");		  
		  
		}
	 
	     System.out.println(fin);
		  
	  }
	  
	   
	}
