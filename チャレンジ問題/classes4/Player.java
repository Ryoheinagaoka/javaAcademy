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

	//ファイルに出力するにあたりじゃんけんの手を格納
	String outputhand = "";

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
	public void setHand(){
		this.hand = tac.readTactics();
	}

	/**
	*playerhandの変数の中に入っている数字を元にジャンケンの手を出力するメソッド
	*@param hand playerhand変数を入れる
	*/
	public void changeHand(int hand){
		switch(hand){
			case 1:
				System.out.println(ROCK);
				outputhand = ROCK;
				break;
			case 2:
				System.out.println(SISSORS);
				outputhand = (SISSORS);
				break;
			case 3:
				System.out.println(PAPER);
				outputhand = (PAPER);
				break;
		}
	}
}