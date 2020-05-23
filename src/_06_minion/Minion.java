package _06_minion;

public class Minion {
		String name;
		String color;
		String master;
		int eyes;
	public Minion( String name, int eyes, String color, String master) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
		this.eyes=eyes;
		this.master=master;
	}




	



	public String getName() {
		
		// TODO Auto-generated method stub
		return name;
	}




	public int getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}




	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}




	public void setMaster(String master) {
		// TODO Auto-generated method stub
		this.master=master;
	}




	public String getMaster() {
		// TODO Auto-generated method stub
		return master;
	}
}
