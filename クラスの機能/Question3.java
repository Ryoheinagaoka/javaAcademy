/**
* クラス変数・クラスメソッド基礎
* @author nagaoka
*/

/**
*クラス名 Question2
*/
public class Question3{
	public static void main(String[] args){

		Employee2 emp = new Employee2();
		Employee2 emp2 = new Employee2("Pepper");

		emp.sayName();
		emp2.sayName();

		Employee2.empcount();

	}
}

/**
*クラス名　Employee
*1.名前を格納する文字列型のインスタンス変数を持つ
*2.名前を標準出力するインスタンスメソッドを持つ
*3.引数なしのコンストラクタを持つ
*4.文字列を引数に持つコンストラクタを持つ
*/


class Employee{


	String name;
	String result;

	/**
	*
	*/
	public void sayName(){
		System.out.println("私はシアトルコンサルティングの社員です。名前は"+this.name+"です。");
	}

	public Employee(){
		this.name = "匿名希望";
	}

	public Employee(String s){
		this.name = s;
		if(10 < s.length()){
		 this.name = s.substring(0,10);
		}



	}
}

class Employee2{

	String name;
	String result;

	//社員人数用のクラス変数
	static int i = 0;

	/**
	*
	*/
	public void sayName(){
		System.out.println("私はシアトルコンサルティングの社員です。名前は"+this.name+"です。");
	}

	/**
	*社員人数をカウントするメソッド
	*/

	public Employee2(){
		this.name = "匿名希望";

		Employee2.i++;
	}

	public Employee2(String s){
		this.name = s;
		if(10 < s.length()){
		 this.name = s.substring(0,10);
		}
		Employee2.i++;
	}

	public static void empcount(){
		System.out.println("社員は全部で"+i+"人です");
	}


	}