public class StrSequence extends StrList
{
	public String concat(String seperator) 
	{
		StrListIterator i ;
		String s = new String() ;
		for (i = iterator() ; i.hasNext() ; ) 
			s = s + i.next() + (i.hasNext() ? seperator : "") ;
		return s ;
	}
}
