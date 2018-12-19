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
	int hand;
	//グー、チョキ、パーは定数化
	final String ROCK= "グー";
	final String SISSORS = "チョキ";
	final String PAPER = "パー";

	//コンストラクタで任意の名前をセット
	public Player(String name){
		this.name = name;
	}

	/**
	*手を設定するインスタンスメソッド
	*/
	public void setHand(){

		//Randomクラスの生成
		Random rnd = new Random();
		//ジャンケンの手の判定用の変数randomに1~3のランダムな値を代入
		int random = rnd.nextInt(3) + 1;

		this.hand = random;
	}

	/**
	*playerhandの変数の中に入っている数字を元にジャンケンの手を出力するメソッド
	*@param hand playerhand変数を入れる
	*/
	public void changehand(int hand){
		switch(hand){
			case 1:
				System.out.println(ROCK);
				break;
			case 2:
				System.out.println(SISSORS);
				break;
			case 3:
				System.out.println(PAPER);
				break;
		}
	}
}