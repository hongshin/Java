import java.io.* ;
import java.util.* ;

public class TodoList
{
	static TreeMap<String, String> todoList = new TreeMap<String, String>() ;

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in) ;

		do {
			try {
				System.out.print(">") ;
				String l = in.nextLine() ;
				if (l.equals("")) 
					continue ;
				StringTokenizer st = new StringTokenizer(l) ;
				String op = st.nextToken() ;

				switch (op) {
					case "add": {
						String time = st.nextToken() ;
						String item = new String() ;
						while (st.hasMoreTokens()) 
							item += " " + st.nextToken() ;
						todoList.put(time, item) ;
						break ;
					}

					case "list": {
						int i = 0 ;
						for (Iterator<String> itr = todoList.keySet().iterator() ; itr.hasNext() ; i++) {
							String date = itr.next() ;
							System.out.println("[" + i + "] " + date + ", " + todoList.get(date)) ;
						}
						break ;
					}

					case "delete": {
						int index = Integer.parseInt(st.nextToken()) ;
						if (index < 0 || index >= todoList.size()) 
							throw new IllegalArgumentException(Integer.toString(index)) ;
						todoList.remove(index) ;
						break ;
					}

					case "quit": 
						System.exit(0) ;

					default:
						throw new IllegalArgumentException(op) ;
				}
			}
			catch (IllegalArgumentException e) {
				System.out.println("Wrong input: " + e) ;
			}
		} while (true) ;
	}
}
