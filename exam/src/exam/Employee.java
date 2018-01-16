package exam;

public class Employee {
		int amount;
		String name;
		public Employee(String name,int amount){
			this.name = name;
			this.amount = amount;
		}
		public void print(){
			System.out.print(name + "\t" + amount);
		}
}
