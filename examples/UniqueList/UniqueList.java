public class UniqueList extends LinkedList 
{
	UniqueList()
	{
		super() ;
	}

	public boolean contains(Object obj)
	{
		for (LinkedListIterator i = iterator() ; i.hasNext() ; ) {
			Object elem = i.next() ;
			if (elem.equals(obj) == true)
				return true ;
		}
		return false ;
	}

	public boolean add(Object obj)
	{
		if (contains(obj) == true)
			return false ;
		return super.add(obj) ;
	}
}
