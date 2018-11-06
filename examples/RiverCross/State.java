public class State
{
	Location man ; 
	Location goat ;
	Location cabbage ;
	Location wolf ;

	public State prev ;

	public State() 
	{
		man = Location.Left ;
		goat = Location.Left ;
		cabbage = Location.Left ;
		wolf = Location.Left ;
	}

	public State(Location man, Location goat, Location cabbage, Location wolf, State prev)
	{
		this.man = man ;
		this.goat = goat ;
		this.cabbage = cabbage ;
		this.wolf = wolf ;
		this.prev = prev ;
	}

	public boolean isValid()
	{
		if (man != goat && goat == cabbage)
			return false ;
		if (man != wolf && wolf == goat)
			return false ;
		return true ;
	}

	public boolean isDone() 
	{
		return man == Location.Right && goat == Location.Right && cabbage == Location.Right && wolf == Location.Right ;
	}

	public String toString()
	{
		String r = "<" ;
		r += "man:" + this.man + ", goat:" + this.goat + ", cabbage:" + this.cabbage + ", wolf:" + this.wolf ;
		r += ">" ;
		return r ;
	}

	public boolean equals(Object obj) 
	{
		if (obj == null)
			return false ;

		if (!(obj instanceof State))
			return false ;
		State that = (State) obj ;
		return this.man == that.man && this.goat == that.goat && 
			this.cabbage == that.cabbage && this.wolf == that.wolf ;
	}

	public UniqueList nextStates()
	{
		UniqueList nexts = new UniqueList() ;

		nexts.add(new State(this.man.inverse, this.goat, this.cabbage, this.wolf, this)) ;

		if (man == goat) 
			nexts.add(new State(this.man.inverse, this.goat.inverse, this.cabbage, this.wolf, this)) ;
		if (man == cabbage)
			nexts.add(new State(this.man.inverse, this.goat, this.cabbage.inverse, this.wolf, this)) ;
		if (man == wolf)
			nexts.add(new State(this.man.inverse, this.goat, this.cabbage, this.wolf.inverse, this)) ;

		return nexts ;
	}
}
