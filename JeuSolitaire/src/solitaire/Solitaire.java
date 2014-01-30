package solitaire;

public class Solitaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Plateau pl = new Plateau(7,7);
    	pl.Afficher();
    	deplacement de = new deplacement(pl);
    	while (true){
    		de.Affichage();
    		pl.Afficher();
    	}
    	
 
	}
}
