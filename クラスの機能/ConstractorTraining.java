/**
* コンストラクタ基礎
* @author nagaoka
*/

/**
*クラス名 ConstractorTraining
*/
public class ConstractorTraining{

	/**
	*@mainメソッド
	*インスタンス化された、社員の名前を出力するメソッド
	@param args コマンドライン引数
	*/
	public static void main(String[] args){

		Employee emp = new Employee();
		Employee emp2 = new Employee("Pepper");

		emp.sayName();
		emp2.sayName();

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

	//インスタンス変数
	String name;
	//インスタンス変数
	String result;

	/**
	*社員の名前を標準出力するメソッド
	*/
	public void sayName(){
		System.out.println("私はシアトルコンサルティングの社員です。名前は"+this.name+"です。");
	}
	/**
	*インスタンス変数nameに匿名希望を代入する
	*/
	public Employee(){
		this.name = "匿名希望";
	}

	/**
	*@param name 社員名
	*引数sをインスタンス変数nameに代入
	*もし、sが１０文字より多い場合は１０文字目まで出力する
	*/
	public Employee(String name){
		this.name = name;
		if(10 < name.length()){
		 this.name = name.substring(0,10);
		}

	}
}