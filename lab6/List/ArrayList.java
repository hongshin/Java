public class ArrayList extends List 
{
	int nElements ;
	Object [] elements = new Object[10] ;

	public ArrayList()
	{
	}

	public boolean add(Object data)
	{
		if (nElements == elements.length) {
			Object [] _elements = new Object[elements.length * 2] ;
			System.arraycopy(elements, 0, _elements, 0, elements.length) ;
			elements = _elements ;
		}
		elements[nElements] = data ;
		nElements++ ;
		return true ;
	}

	public int length()
	{
		return nElements ;	
	}

	public boolean removeFirst(Object data)
	{
		for (int i = 0 ; i < nElements ; i++) {
			if (data.equals(elements[i])) {
				for (int j = i ; j < nElements - 1 ; j++) 
					elements[j] = elements[j + 1] ;
				nElements -= 1 ;
				return true ;
			}
		} 
		return false ;
	}

	public void clear()
	{
		elements = new Object[10] ;
		nElements = 0 ; 
	}

	public String toString()
	{
		String r = "<" ;
		for (int i = 0 ; i < nElements ; i++)
			r += elements[i] + (i != nElements - 1 ? "," : ">") ;		
		return r ;
	}
}
