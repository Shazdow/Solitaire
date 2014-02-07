package solitaire;

import java.util.Scanner;

public class deplacement  {

		Scanner sc = new Scanner(System.in);
		private int ligneA;
		private int colA;
		private int ligneB;
		private int colB;
		private Plateau pl;
		int Bille = 32;
		
		public deplacement(Plateau pl) {
			this.pl = pl;
		}

		public void Affichage()
		{
			
			System.out.println("Saisissez la ligne de la bille a déplacer ");
			setLigneA(sc.nextInt()); 
	    	System.out.println("Saisissez la colonne de la bille a déplacer ");
	    	setColA(sc.nextInt());
	    	System.out.println("Saisissez la ligne d'arrivé ");
			setLigneB(sc.nextInt()); 
	    	System.out.println("Saisissez la colonne d'arrivé ");
	    	setColB(sc.nextInt());
			jouerUnCoup(getLigneA(), getColA(), getLigneB(), getColB());
		}
		
		public boolean jouerUnCoup(int lignA,int colA,int lignB, int colB) {
	      // calcul bille milieu 	
		  int lignMilieu = (lignA+lignB)/2;
	      int colMilieu = (colA + colB)/2;
	      
	      if ((lignA == lignB && Math.abs(colA - colB) == 2)||(colA == colB && Math.abs(lignA - lignB) == 2)) {
	            boolean b = pl.getMy2dArray()[lignMilieu][colMilieu] == 1 &&  pl.getMy2dArray()[lignA][colA]== 0;
	            if (b) {
	            	 pl.getMy2dArray()[lignA][colA] = 1;
	            	 pl.getMy2dArray()[lignMilieu][colMilieu] = 1;
	            	 pl.getMy2dArray()[lignB][colB] = 2;
	 	        }
	            return b;
	            }
		return false;
		}

		//Getter Setter
		public int getLigneA() {
			return ligneA;
		}

		public void setLigneA(int ligneA) {
			this.ligneA = ligneA;
		}

		public int getColA() {
			return colA;
		}

		public void setColA(int colA) {
			this.colA = colA;
		}

		public int getLigneB() {
			return ligneB;
		}

		public void setLigneB(int ligneB) {
			this.ligneB = ligneB;
		}

		public int getColB() {
			return colB;
		}

		public void setColB(int colB) {
			this.colB = colB;
		}
}
	