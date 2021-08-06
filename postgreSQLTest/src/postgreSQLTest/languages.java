package postgreSQLTest;

public class languages {
	private int id;
	private String e;
	private String g;
	private String n;
	
	public languages(String e, String g, String n)
	{
		this.e = e;
		this.g = g;
		this.n = n;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public String getG() {
		return g;
	}
	public void setG(String g) {
		this.g = g;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	
}
