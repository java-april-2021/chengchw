
public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator CA1 = new Calculator();
		
		CalculatorEnhance CA2 = new CalculatorEnhance();
//		CA1.setOperandOne(23.2);
//		CA1.setOperandTwo(12.5);
//		CA1.setOperation('+');
//		CA1.performOperation();
//		CA1.getResults();
//		CA1.setOperation('-');
//		CA1.performOperation();
//		CA1.getResults();
//		CA1.setOperation('*');
//		CA1.performOperation();
//		CA1.getResults();
//		CA1.setOperation('/');
//		CA1.performOperation();
//		CA1.getResults();
		
		CA2.performOperation(2.0);
		CA2.performOperation('+');
		CA2.performOperation(3.0);
		CA2.performOperation('-');
		CA2.performOperation(5.0);
		CA2.performOperation('+');
		CA2.performOperation(4.0);
		CA2.performOperation('*');
		CA2.performOperation(1.0);
		CA2.performOperation('/');
		CA2.performOperation(3.0);
		CA2.performOperation('=');
		CA2.getResults();
		

	}

}
