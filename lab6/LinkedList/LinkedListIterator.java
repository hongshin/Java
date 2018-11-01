public class LinkedListIterator
{
	LinkedListNode cursor ;

	public LinkedListIterator(LinkedListNode first) {
		this.cursor = first ;
	}

	public boolean hasNext() {
		if (cursor == null)
			return false ;
		return true ;
	}

	public Object next() {
		Object data ;
		data = cursor.getData() ;
		cursor = cursor.next ;
		return data ; 
	}
}
