public class LinkedListNode  
{
	public LinkedListNode next ;
	private Object data ;

	public LinkedListNode(Object data) 
	{
		this.data = data ;
		this.next = null ;
	}

	public Object getData() 
	{
		return data ;
	}

	public LinkedListNode addNext(Object data)
	{
		this.next = new LinkedListNode(data) ;
		return this.next ;
	}
}
