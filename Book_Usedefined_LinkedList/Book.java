package Book_Usedefined_LinkedList;

public class Book {
	private int bid;
	private String name;
	public Book()
	{
		bid=5;
		name="NA";
	}
	public Book(int bid,String name)
	{
		this.bid=bid;
		this.name=name;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return " [bid=" + bid + ", name=" + name + "] ";
	}
	
}
