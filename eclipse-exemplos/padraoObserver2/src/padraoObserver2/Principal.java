package padraoObserver2;

public class Principal {

	public static void main(String args[]) 
	{ 
		// create objects for testing 
		AverageScoreDisplay averageScoreDisplay = 
				new AverageScoreDisplay(); 
		CurrentScoreDisplay currentScoreDisplay = 
				new CurrentScoreDisplay(); 

		// pass the displays to Cricket data 
		CricketData cricketData = new CricketData(); 

		// register display elements 
		cricketData.registerObserver(averageScoreDisplay); 
		cricketData.registerObserver(currentScoreDisplay); 

		// in real app you would have some logic to 
		// call this function when data changes 
		cricketData.dataChanged(); 

		//remove an observer 
		cricketData.unregisterObserver(averageScoreDisplay); 

		// now only currentScoreDisplay gets the 
		// notification 
		cricketData.dataChanged(); 
	} 
}

