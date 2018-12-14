// package classes;
/**
* じゃんけんゲーム用クラス
* @author nagaoka
*/


//乱数を使用するためにimport
import java.util.Random;

public class Player{

	//名前を格納するインスタンス変数
	String name;
	//手を格納するインスタンス変数
	String hand;
	//グー、チョキ、パーは定数化
	final String rock = "グー";
	final String scissors = "チョキ";
	final String paper = "パー";

	//コンストラクタで任意の名前をセット
	public Player(String name){
		this.name = name;
	}

	/**
	*手を設定するインスタンスメソッド
	*/
	public void sethand(){

		//Randomクラスの生成
		Random rnd = new Random();
		//ジャンケンの手の判定用の変数randomに1~3のランダムな値を代入
		int random = rnd.nextInt(3) + 1;

		if(random == 1){
			this.hand = this.rock;
		}else if(random == 2){
			this.hand = this.scissors;
		}else{
			this.hand = this.paper;
		}
	}
}