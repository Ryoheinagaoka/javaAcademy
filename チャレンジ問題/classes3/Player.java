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

	//インターフェース型変数
	Tactics tac;

	/**
	*インターフェース型変数に戦略をセットするメソッド
	*/
	public void setRandomTactics(){
		this.tac = new RandomTactics();
	}

	public void setCrazyTactics(){
		this.tac = new CrazyTactics();
	}


	//コンストラクタで任意の名前をセット
	public Player(String name){
		this.name = name;
	}

	/**
	*手を設定するインスタンスメソッド
	*/
	public void sethand(){
		this.hand = tac.readTactics();
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