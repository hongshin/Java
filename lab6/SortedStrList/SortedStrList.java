public class SortedStrList extends StrList
{
	public SortedStrList() 
	{
	}

	public boolean add(String data) 
	{
		if (first == null) {
			super.add(data) ;
			return true ;
		}
		
		StrListNode i = first ;
		while (i.next != null) {
			if (data.compareTo(i.next.getData()) < 0) {
				StrListNode next = i.next ;
				i = i.addNext(data) ;
				i.next = next ;
				return true ;
			}			
			i = i.next ;
		}

		last = i.addNext(data) ;
		
		return true ;
	}
}
