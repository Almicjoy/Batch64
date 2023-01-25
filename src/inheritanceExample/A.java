package inheritanceExample;

public class A {
	private int aid;
	private String aname;
	
	A(int aid, String aname) {
		System.out.println("A Constructor");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}

}
