public enum Location {
	Left("Left"), Right("Right") ;

	public String label ;
	public Location inverse ;

	static {
		Left.inverse = Right ;
		Right.inverse = Left ;
	}

	Location(String label) 
	{
		this.label = label ;
		this.inverse = inverse ;
	}

	public String toString() 
	{
		return label ;
	}
}
