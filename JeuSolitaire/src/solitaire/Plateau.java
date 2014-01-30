package solitaire;

		
		public class Plateau {
			
			private int[][] my2dArray;
		    
		    public Plateau(int largeur, int longueur) {
		    	my2dArray = new int [largeur][longueur];
		    	
		    	//mise en place du plateau
		    	// tout est interdit 
		        for(int i = 0; i < getMy2dArray().length; i++) {
		            for(int j = 0; j <getMy2dArray().length ; j++) {
		            my2dArray[i][j] = -1; 
		            }
		        }
		        // les case "ouvertes"
		        for (int i = 0; i < 2; i++) {
		            for( int j = 2; j < 5; j++)  {
		                getMy2dArray()[i][j] = 1;
		            }
		        }
		        // case jouable
		        for (int i = 2 ;i < 5; i++) {
		            for( int j = 0; j < 7; j++)  {
		                getMy2dArray()[i][j] = 1;
		            }
		        }
		        for (int i = 5; i < getMy2dArray().length; i++) {
		            for( int j = 2; j < 5; j++)  {
		                getMy2dArray()[i][j] = 1;
		            }
		        }
		        my2dArray[3][3] = 2;
		        //case centrale vide
		    }
		    
		    public void Afficher()
		    {
		    	for(int i = 0; i < getMy2dArray().length; i++){
		    		for(int j = 0; j < getMy2dArray().length; j++){
		    			System.out.print(transform(getMy2dArray()[i][j]));;
		    		}
		    	System.out.println();
		    	}
		    }
		    
		    private String transform(int carreau)
		    {
		    		switch (carreau) {
					case 1 : return "+";	
					case 2 : return ".";
					default: return " ";
					}
		    }

			public int[][] getMy2dArray() {
				return my2dArray;
			}

			public void setMy2dArray(int[][] my2dArray) {
				this.my2dArray = my2dArray;
			}
			
}
