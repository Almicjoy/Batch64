package inheritanceExample;

public class B extends A{
	private int bid;
	private String bname;
	
	B() {
		super(100, "Alessa");
		System.out.println("B Constructor");
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}
