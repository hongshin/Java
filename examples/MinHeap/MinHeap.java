public class MinHeap implements Queue
{
	private int capacity ;
	private Comparable [] elements ;
	private int size ;

	public MinHeap(int capacity) 
	{
		if (capacity <= 0)
			throw new IllegalArgumentException("The capacity must be a postive integer") ; 
			
		this.capacity = capacity ;
		this.size = 0 ;
		this.elements = new Comparable[this.capacity + 1] ;
	}

	public void enqueue(Comparable e) throws OverflowException
	{
		if (this.size == this.capacity)
			throw new OverflowException() ;
	}

	public Comparable dequeue() throws UnderflowException
	{
		if (this.size == 0)
			throw new UnderflowException() ;
		return null ;
	}

	public int size()
	{
		return this.size ;
	}
}
