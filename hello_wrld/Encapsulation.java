package hello_wrld;
//encapsulation: binding logically related data(methods and variales) to provide easy access and Security
class guy{
	private int age;
	private int salary;
	void setAge(int age)
	{this.age= age;}
	void setSalary(int salary){
		this.salary=salary;
	}
	int getAge()
	{
		return age;
	}
	int getSalary()
	{
		return salary;
	}
}
public class Encapsulation {
public static void main(String[] args) {

	guy a=new guy();
	a.setAge(22);
	a.setSalary(50000);
	System.out.println("Age is: "+a.getAge());
	System.out.println("Salary is: "+a.getSalary());
	
}
}
