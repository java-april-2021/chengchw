
public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator CA1 = new Calculator();
		
		CA1.setOperandOne(23.2);
		CA1.setOperandTwo(12.5);
		CA1.setOperation('+');
		CA1.performOperation();
		CA1.getResults();
		CA1.setOperation('-');
		CA1.performOperation();
		CA1.getResults();
		CA1.setOperation('*');
		CA1.performOperation();
		CA1.getResults();
		CA1.setOperation('/');
		CA1.performOperation();
		CA1.getResults();

	}

}
