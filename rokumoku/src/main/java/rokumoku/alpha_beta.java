package rokumoku;

public class alpha_beta{

	void alphabeta() { //position depth maxP
		if(depth == 0 ) //or game over in position
			//return position's weight
			
		if(maxP) {
			int maxWeight = -99999;
			for(Child child: position) {
				weight = minimax(child, depth - 1, false);
				maxWeight = max(maxWeight, weight);
			}
			return maxWeight;
		}
		else {
			int minWeight = 99999;
			for(Child child: position)
			{
				weight = minimax(child, depth - 1, true);
				minWeight = min(minWeight, weight);
			}
			return minWeight;
			
	}
}
