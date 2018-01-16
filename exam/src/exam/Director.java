package exam;

public class Director extends Manager{
	 int bonus;
		public Director(String name, int amount,int bonus){
			super(name,amount);
			this.bonus = bonus;
			
		}
		@Override
		public void print(){
			int total = amount + 5000;
			System.out.print(name + "\t"+ total + "("+bonus+")");
		}

}
