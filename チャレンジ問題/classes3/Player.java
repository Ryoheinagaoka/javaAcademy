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
	Integer hand;
	//グー、チョキ、パーは定数化
	final String ROCK= "グー";
	final String SISSORS = "チョキ";
	final String PAPER = "パー";

	//インターフェース型変数
	Tactics tac;

	/**
	*インターフェース型変数に戦略をセットするメソッド
	*/
	public void setTacticsHand(int tactics){
		tac = tactics;
	}


	//コンストラクタで任意の名前をセット
	public Player(String name){
		this.name = name;
	}

	/**
	*手を設定するインスタンスメソッド
	*/
	public void sethand(){
		this.hand = tac;
	}

	/**
	*playerhandの変数の中に入っている数字を元にジャンケンの手を出力するメソッド
	*@param hand playerhand変数を入れる
	*/
	public void changehand(int hand){
		switch(hand){
			case 1:
				System.out.println("グー");
				break;
			case 2:
				System.out.println("チョキ");
				break;
			case 3:
				System.out.println("パー");
				break;
		}
	}
}