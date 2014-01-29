package solitaire;

		
		public class Plateau {
			//private int[][] plateau = new int[7][7];
			
			int[][] my2dArray = new int [7][7];
		    
		    public Plateau() {
		    	
		    	//mise en place du plateau
		    	// tout est interdit 
		        for(int i = 0; i < my2dArray.length; i++) {
		            for(int j = 0; j <my2dArray.length ; j++) {
		            my2dArray[i][j] = (-1); 
		            }
		        }
		        // les case "ouvertes"
		        for (int i = 0; i < 2; i++) {
		            for( int j = 2; j < 5; j++)  {
		                my2dArray[i][j] = 1;
		            }
		        }
		        for (int i = 2 ;i < 5; i++) {
		            for( int j = 0; j < 7; j++)  {
		                my2dArray[i][j] = 1;
		            }
		        }
		        for (int i = 5; i < my2dArray.length; i++) {
		            for( int j = 2; j < 5; j++)  {
		                my2dArray[i][j] = 1;
		            }
		        }
		        my2dArray[3][3] = 2;
		        //case centrale vide
		    }
		    
		    public void Afficher()
		    {
		    	for(int i = 0; i < my2dArray.length; i++){
		    		for(int j = 0; j < my2dArray.length; j++){
		    			System.out.print(transform(my2dArray[i][j]));;
		    		}
		    	System.out.println();
		    	}
		    }
		    
		    private String transform(int carreau)
		    {
		    		switch (carreau) {
					case 1 : return "0";	
					case 2 : return "X";
					default: return " ";
					}
		    }
		    
}	

