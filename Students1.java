package kiran;

public class Students1 {
	private String name;
	private int rollno;
	private int marks;
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getRoll() {
		return rollno;
	}




	public void setRoll(int roll) {
		this.rollno = roll;
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		this.marks = marks;
	} 
	  public String checkResult() {
		  if(marks>=40) {
			  return "pass";
		  }
		  else {
			  return "fail";
		  }
	  }
     public void displayDatalist() {
    	 System.out.println("RollNo: "+" "+getRoll());
    	 System.out.println("Name:"+" "+getName());
    	 System.out.println("Marks :"+" "+getMarks());
    	 System.out.println("Result :"+" "+checkResult());
     }

	public static void main(String[] args) {
		Students1 obj=new Students1();
		obj.setRoll(101);
		obj.setName("kiran");
		obj.setMarks(90);
		System.out.println("\n Students Details List");
		obj.displayDatalist();
	}

}
