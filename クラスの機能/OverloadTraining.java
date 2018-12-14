/**
* オーバーロード基礎
* @author nagaoka
*/

/**
*クラス名　Quesiton1
*/

public class OverloadTraining{
	/**
	*mainメソッド
	*インスタンスメソッドを使用するメソッド
	*@param args コマンドライン引数
	*/
	public static void main(String[] args){

		//methodsクラスをインスタンス化
		Methods met = new Methods();

		//インスタンス化した機能を使用する
		met.sameName();
		met.sameName(1);
		met.sameName(1,1);
		met.sameName("a");
		met.sameName("a","b");

	}
}

class Methods{

	//引数を保持しないsameNameメソッド
	public void sameName(){
		System.out.println("引数を持たないsameNameメソッドです");
	}
	/**
	*int型の引数を一つ保持するsameNameメソッド
	*@param i 数値
	*/
	public void sameName(int i){
		System.out.println(i);
	}
	/**
	*int型の引数を一つ保持するsameNameメソッド
	*@param i 数値
	*@param j 数値
	*/
	public void sameName(int i,int j){
		System.out.println(i+j);
	}
	/**
	*int型の引数を一つ保持するsameNameメソッド
	*@param k 文字列
	*/
	public void sameName(String k){
		System.out.println(k);
	}
	/**
	*int型の引数を一つ保持するsameNameメソッド
	*@param k 文字列
	*@param l 文字列
	*/
	public void sameName(String k,String l){
		System.out.println(k+l);
	}

}