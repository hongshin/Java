public class LinkedListNode<T> 
{
	public LinkedListNode<T> next ;
	private T data ;

	public LinkedListNode(T data) 
	{
		this.data = data ;
		this.next = null ;
	}

	public T getData() 
	{
		return data ;
	}

	public LinkedListNode<T> addNext(T data)
	{
		this.next = new LinkedListNode<T>(data) ;
		return this.next ;
	}
}
