
import java.util.*;
public class CalculatorEnhance {

	private ArrayList<Double> DouArr = new ArrayList<Double>();
	private ArrayList<Character> OpeArr =  new ArrayList<Character>();
	private double result;
	
	
	
	private void updateResult() {
	
		for(int i = 0; i < OpeArr.size(); i++) {
			
			if (OpeArr.get(i).equals('*')) {
				
				Double num = this.DouArr.get(i)* this.DouArr.get(i+1);
				
				DouArr.set(i,0.0);
				DouArr.set(i+1, num);
			}
			
			else if (OpeArr.get(i).equals('/')) {
				
				Double num = this.DouArr.get(i)/ this.DouArr.get(i+1);
				DouArr.set(i,0.0);
				DouArr.set(i+1, num);
			}
			
			else if (OpeArr.get(i).equals('-')) {
				
				DouArr.set(i+1, DouArr.get(i+1)*(-1));
			}	
		}
		
		Double sum = 0.0;
		
		for (int j = 0; j< DouArr.size(); j++) {
			
			sum += DouArr.get(j);
			
		}
		
		this.result = sum;
		
		
	}
	
	
	public void performOperation(Character inputOb) {
		
		if (inputOb.equals('=')) {
			
			this.updateResult();
		}
		
		else {
			
			OpeArr.add(inputOb);
		}
	}
	
	public void performOperation(Double inputOb) {
		
		DouArr.add(inputOb);
	}
	
	public void getResults() {
		
		System.out.println(this.result);
	}
	
	
	
	
	
}
