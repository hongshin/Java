public interface Queue 
{
	public void enqueue(Comparable e) throws OverflowException ;
	public Comparable dequeue() throws UnderflowException ;
}
