import java.util.NoSuchElementException ;

public interface Dictionary
{
	public void put(String key, String val) ;
	public String get(String key) ;
	public String remove(String key) throws NoSuchElementException ;
}
