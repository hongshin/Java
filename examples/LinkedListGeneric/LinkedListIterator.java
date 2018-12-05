public class LinkedListIterator<T>
{
	LinkedListNode<T> cursor ;

	public LinkedListIterator(LinkedListNode<T> first) {
		this.cursor = first ;
	}

	public boolean hasNext() {
		if (cursor == null)
			return false ;
		return true ;
	}

	public T next() {
		T data ;
		data = cursor.getData() ;
		cursor = cursor.next ;
		return data ; 
	}
}
