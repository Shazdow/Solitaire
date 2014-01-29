package solitaire;

import java.util.Scanner;

public class Boule {
	
	private Scanner sc = new Scanner(System.in);
	private int coorBase;
	private int coorArr;
	private int bille = 32;
	private boolean accessible;
	private boolean plein;
	
	public void SelectionBille()
	{
		System.out.println("Saisissez les coordonnés de la bille a déplacer ");
		setCoorBase(sc.nextInt());
	}
	
	public void DestinationBille()
	{
		System.out.println("Saisissez les coordonnés de d'arrivé");
		setCoorArr(sc.nextInt());
	}
	
	public void AffichageMessage(){
		while(bille>1){
			SelectionBille();
			DestinationBille();
			bille --;
		}
		
	}

	public void setPlein(boolean plein) {
		this.plein = plein;
	}

	public boolean isPlein() {
		return plein;
	}

	public boolean isAccessible() {
		return accessible;
	}


	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}

	public int getCoorBase() {
		return coorBase;
	}

	public void setCoorBase(int CoorBase) {
		this.coorBase = CoorBase;
	}

	public int getCoorArr() {
		return coorArr;
	}

	public void setCoorArr(int CoorArr) {
		this.coorArr = CoorArr;
	}

	public int getBille() {
		return bille;
	}

	public void setBille(int bille) {
		this.bille = bille;
	}
	
	public void deplacementValide()
	{
			if (isAccessible() == true){
				
			}
	}
}


