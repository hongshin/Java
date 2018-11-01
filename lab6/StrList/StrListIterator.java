public class StrListIterator
{
	StrListNode cursor ;

	public StrListIterator(StrListNode first) {
		this.cursor = first ;
	}

	public boolean hasNext() {
		if (cursor == null)
			return false ;
		return true ;
	}

	public String next() {
		String data ;
		data = cursor.getData() ;
		cursor = cursor.next ;
		return data ; 
	}
}
