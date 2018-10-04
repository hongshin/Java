public class Expression
{
	boolean isValue ;
	boolean isVariable ;
	double value ;
	char operator ;
	Expression leftOperand ;
	Expression rightOperand ;

	public Expression(String s)
	{
		if (s.charAt(0) != '(') {
			if (s.charAt(0) == 'x') {
				isVariable = true ;
			}
			else {
				isValue = true ;
				value = Double.parseDouble(s) ;
			}
		}
		else {
			operator = s.charAt(1) ;
			
			int begin = 3, i, level ;
			for (i = begin, level = 0 ; 
				 s.charAt(i) != ' ' || level != 0 ; 
				 i++) {
				if (s.charAt(i) == '(')
					level++ ;
				if (s.charAt(i) == ')')
					level-- ;
			}
			leftOperand = new Expression(s.substring(begin, i)) ;
			rightOperand = new Expression(s.substring(i + 1, s.length() - 1)) ;
		}
	}

	public double eval(double x)
	{
		if (isValue)
			return value ;

		if (isVariable)
			return x ;

		double ret = 0.0 ;

		switch (operator) {
			case '+':
				ret = leftOperand.eval(x) + rightOperand.eval(x) ;
				break ;

			case '-':
				ret = leftOperand.eval(x) - rightOperand.eval(x) ;
				break ;

			case '*':
				ret = leftOperand.eval(x) * rightOperand.eval(x) ;
				break ;

			default:
				System.out.println("Invalid Expression") ;
				System.exit(1) ;
		}
		return ret ;
	}

	public String toString()
	{
		if (isValue)
			return "" + value ;

		if (isVariable)
			return "x" ;

		String ret = null ;

		switch (operator) {
			case '+':
				ret = "" + leftOperand + " + " + rightOperand ;
				break ;

			case '-':
				ret = "" + leftOperand + " - " + rightOperand ;
				break ;

			case '*':
				ret = "" + leftOperand + " * " + rightOperand ;
				break ;

			default:
				System.out.println("Invalid Expression") ;
				System.exit(1) ;
		}
		return ret ;
	}


	public static void main(String [] args)
	{
		Expression e = new Expression(args[0]) ;
		System.out.println(e) ;
	}
}
