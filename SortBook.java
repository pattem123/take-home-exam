
import java.util.*;


public class SortBook {
	
	String input_search;
	
	public SortBook(String input)
	{
		this.input_search = input;
	}
	
	public List<BookInformation> SortBook(List<BookInformation> list_of_books)
	{
		
		if(input_search == "Author")
		{ 
			Collections.sort(list_of_books, new Comparator() {
				public int compare(Object firstbook, Object secondbook) 
				{
				return ((BookInformation)firstbook).getAuthor().compareTo(((BookInformation)secondbook).getAuthor());
				}
				}); 
			
			 
			return list_of_books;
		}
		else if(input_search == "YearPublished")
		{
			Collections.sort(list_of_books, new Comparator() {
				public int compare(Object firstbook, Object secondbook) 
				{
				return ((BookInformation)firstbook).getYearPublished().compareTo(((BookInformation)secondbook).getYearPublished());
				}
				}); 
			
           
			return list_of_books;
			
		}
		else if (input_search == "Title")
		{
			Collections.sort(list_of_books, new Comparator() {
				public int compare(Object firstbook, Object secondbook) 
				{
				return ((BookInformation)firstbook).getTitle().compareTo(((BookInformation)secondbook).getTitle());
				}
				}); 
			
            return list_of_books;
		}
		else
		{
			
			return list_of_books;
		}
	}
}
