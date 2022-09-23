package parse;

public class Employee {
	String empName;
	int empId;
	boolean mstatus;
	int[] phnos;
	
	public Employee(String empName,int empId,boolean mstatus,int[] phnos) {
		this.empName=empName;
		this.empId=empId;
		this.mstatus=mstatus;
		this.phnos=phnos;
	}
	public Employee() {
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public boolean isMstatus() {
		return mstatus;
	}
	public void setMstatus(boolean mstatus) {
		this.mstatus = mstatus;
	}
	public int[] getPhnos() {
		return phnos;
	}
	public void setPhnos(int[] phnos) {
		this.phnos = phnos;
	}
	
	}


