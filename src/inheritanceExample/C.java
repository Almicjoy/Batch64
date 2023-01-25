package inheritanceExample;

public class C extends A{
	private int cid;
	private String cname;
	
	C() {
		super(105, "Wow");
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
