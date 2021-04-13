
public class Calculator {
	
	private double OperandOne;
	private double OperandTwo;
	private char Operation = ' ';
	private double result = 0;
	
	public void setOperandOne(double OP1) {
		
		this.OperandOne = OP1;
	}
	
	public void setOperandTwo(double OP2) {
		
		this.OperandTwo = OP2;
	}
	
	public void setOperation(char OP) {
		
		this.Operation = OP;
	}
	
	public void performOperation() {
		
		if (this.Operation == ' ') {
			
			System.out.println("No Operator set up");
		}
		
		else if (this.Operation == '+') {
			
			System.out.println("Perform plus");
			this.result = this.OperandOne + this.OperandTwo;
		}
		
		else if (this.Operation == '-') {
			
			System.out.println("Perform substract");
			this.result = this.OperandOne - this.OperandTwo;
		}
		
		else if (this.Operation == '*') {
			
			System.out.println("Perform multiple");
			this.result = this.OperandOne * this.OperandTwo;
		}
		
		else {
			
			System.out.println("Perform devided");
			this.result = this.OperandOne / this.OperandTwo;
		}	
	}
	
	public double getResults() {
		
		System.out.println("Result is " + this.result);
		return this.result;
	}

	

}
