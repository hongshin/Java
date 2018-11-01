public class StrListNode  
{
	public StrListNode next ;
	private String data ;

	public StrListNode(String data) 
	{
		this.data = data ;
		this.next = null ;
	}

	public String getData() 
	{
		return data ;
	}

	public StrListNode addNext(String data)
	{
		this.next = new StrListNode(data) ;
		return this.next ;
	}
}
