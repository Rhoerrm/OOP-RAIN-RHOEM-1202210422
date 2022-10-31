

public class Managers extends Employee {
	private int allowance;
	
	public Managers() {}
	
	public Managers(String name, int id) {
		super(name,id);
	}
	
	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Allowance			:"+this.allowance);
		System.out.println("========================");
	}
}
