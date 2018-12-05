import java.io.* ;
import java.util.* ;

public class TodoList
{
	static TreeMap<String, ArrayList<String>> 
		todoList = new TreeMap<String, ArrayList<String>>() ;

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in) ;

		do {
			String line = new String() ;
			try {
				System.out.print(">") ;
				line = in.nextLine() ;
				if (line.equals("")) 
					continue ;
				StringTokenizer st = new StringTokenizer(line) ;
				String op = st.nextToken() ;

				switch (op) {
					case "add": {
						String time = st.nextToken() ;
						String item = new String() ;
						while (st.hasMoreTokens()) 
							item += " " + st.nextToken() ;

						ArrayList<String> list = todoList.get(time) ;
						if (list == null) {
							list = new ArrayList<String>() ;
							todoList.put(time, list) ;
						}
						list.add(item) ;
						break ;
					}

					case "list": {
						if (st.hasMoreTokens() == false) {
							for (Iterator<String> i = todoList.keySet().iterator() ; i.hasNext() ; ) {
								System.out.println(i.next()) ;
							}

						}
						else {
							int i = 0 ;
							String date = st.nextToken() ;
							ArrayList<String> itemList = todoList.get(date) ;
							for (Iterator<String> itr = itemList.iterator() ; itr.hasNext() ; i++) {
								String item = itr.next() ;
								System.out.println("[" + i + "] " + date + ", " + item) ;
							}
						}
						break ;
					}

					case "delete": {
						String date = st.nextToken() ;
						ArrayList<String> itemList = todoList.get(date) ;
						if (itemList == null)
							throw new IllegalArgumentException(date) ;
						
						int index = Integer.parseInt(st.nextToken()) ;
						if (index < 0 || index >= itemList.size()) 
							throw new IllegalArgumentException(Integer.toString(index)) ;

						itemList.remove(index) ;

						if (itemList.size() == 0)
							todoList.remove(date) ;
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
			catch (NoSuchElementException e) {
				System.out.println("Parsing error: " + line) ;
			}
		} while (true) ;
	}
}
