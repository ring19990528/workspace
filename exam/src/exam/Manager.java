package exam;

public class Manager extends Employee{
		public Manager (String name,int amount){
			super(name,amount);
		}
		@Override
		public void print(){
			int total = amount + 5000;
			System.out.print(name + "\t" + total);
		}
}
