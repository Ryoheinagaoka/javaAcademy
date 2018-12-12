/**
* オーバーロード基礎
* @author nagaoka
*/

/**
*クラス名　Quesiton1
*/

public class overloadTraining{
	public static void main(String[] args){

		//methodsクラスをインスタンス化
		methods met = new methods();

		//インスタンス化した機能を使用する
		met.sameName();
		met.sameName(1);
		met.sameName(1,1);
		met.sameName("a");
		met.sameName("a","b");

	}
}

class methods{
	
	//引数を保持しないsameNameメソッド
	public void sameName(){
		System.out.println("引数を持たないsameNameメソッドです");
	}
	//int型の引数を一つ保持するsameNameメソッド
	public void sameName(int i){
		System.out.println(i);
	}
	//int型の引数２つ保持するsameNameメソッド
	public void sameName(int i,int j){
		System.out.println(i+j);
	}
	//String型の引数を一つ持つsameNameメソッド
	public void sameName(String k){
		System.out.println(k);
	}
	//String型の引数を２つ持つsameNameメソッド
	public void sameName(String k,String l){
		System.out.println(k+l);
	}

}