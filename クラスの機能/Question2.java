public class Question2{
	public static void main(String[] args){

		Employee emp = new Employee();

	}
}

class Employee{

	String name;

	public void sayName(){
		System.out.println("私はシアトルコンサルティングの社員です。名前は"+this.name+"です。");
	}

	public void Employee(){
		this.name = "匿名希望";
		System.out.println(this.name);
	}

	public void Employee(String s){
		this.name = s;

		System.out.println(name.subString(0,10));
	}
}