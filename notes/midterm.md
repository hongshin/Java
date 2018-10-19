Mideterm Exam, 2018 Fall 
=========

1. Explain at least 5 major differences between Java and C (15 points)
 
2. When should a member of a class be private, and when it be public? (8 points)
 
3. Explain what is type in programming language, and then explain types of the Java programming language (10 points)
 
4. Write a static method `removeDuplicates(Character [] in)` that returns a new array of the characters in the given array, but without any duplicate characters. Always keep the first copy of the character and remove subsequent ones. For example, if in contains `b`, `d`, `a`, `b`, `f`, `a`, `g`, `a`, `a` and `f`, then the method will return an array containing `b`, `d`, `a`, `f` and `g` (9 points)
 
 
 5. The following defines the class Expression which constructs a data structure for a given prefix arithmetic expression.
```java
public class Expression {
	boolean isValue, isVariable ;
	double value ;
	char operator = ' ' ;
	Expression leftOperand = null, rightOperand = null ;

	public Expression(String s) {
		if (s.charAt(0) != '(') {
			if (s.charAt(0) == 'x') {
				isVariable = true ;
			} else {
				isValue = true ;
				value = Double.parseDouble(s) ; 
}
		} else {
			operator = s.charAt(1) ;
			int begin = 3, i, level ;
			for (i = begin, level = 0 ; s.charAt(i) != ' ' || level != 0 ; i++){
				if (s.charAt(i) == '(')
					level++ ;
				if (s.charAt(i) == ')')
					level-- ;
			}
			leftOperand = new Expression(s.substring(begin, i)) ;
			rightOperand = new Expression(s.substring(i + 1, s.length() - 1)) ;
		}
	}

	public static void main(String [] args) {
		System.out.println(new Expression(args[0]) ;
	}
}
```

    Define toString method such that the main method prints the infix version of a prefix arithmetic expression given as a command line argument (12 points). For example, a command and its expected result are as follow:
```
$ java Expression “(* (+ 2 x) (* x 3))”
((2 + x) * (x * 3))
$
```

6. There are certain numbers whose sum of the cube of every digit is same as that number, for example, 153 (i.e., 1^3 + 5^3 + 3^3 = 153). Write a Java program that receives one command line argument for a positive integer, and then print out “True” if the give positive integer satisfies the aforementioned property; otherwise, prints out its sum of the cube of every digit (16 points)

7. Write down a Java program on the subsequent four pages to answer to the following two sub-problems.

* Write a class StringTokenizer that has the following three interface methods (14 points)
  - `public StringTokenizer(String str, String delim) `

     Constructs a string tokenizer for the specified string str. The characters in the delim argument are the delimiters for separating tokens. Delimiter characters themselves will not be treated as tokens. Assume that str is not null and delim is neither null nor an empty string.

  - `public boolean hasMoreTokens()`

  tests if there are more tokens available from this tokenizer's string. If this method returns true, then a subsequent call to nextToken will return a token

  - `public String nextToken()`

  returns the next token from this string tokenizer or return null if no token is available.

* Write a static `main` method for your `StringTokenizer` class, which receives two command line arguments and then checks whether your `StringTokenizer` class and the `StringTokenizer class` in the Java Util library behave the same way: create two objects of the two classes, with the first command line argument as the specified string (i.e., `str`) and the second one as the delimiter string (i.e., `delim`), and then check whether their `nextToken()` methods return the same sequence of tokens. 

   The program should print out nothing if they generate the same sequence of tokens. Otherwise, it prints out the pair of tokens on which two classes degree for the first time. Note that if you create a correct StringTokenizer, it will always print out nothing. For any invalid command line argument, the program prints out “Invalid arguments” and then terminates (16 points).


