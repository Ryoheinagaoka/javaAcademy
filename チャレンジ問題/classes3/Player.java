// package classes;
/**
* じゃんけんゲーム用クラス
* @author nagaoka
*/


//乱数を使用するためにimport
import java.util.Random;

public class Player {

	//Tactics型の変数を宣言
	Tactics[] tac ;

	/**
	*ランダムにじゃんけんの手を返すメソッド
	*@return
	*/
	public RandomTactics readTactics();
	public CrazyTactics razyReadTactics();

	/**
	*Tactics型の変数に戦略をセットするメソッド
	*/
	void settac(){
		this.tac[] = readTactics();
	}

	/**
	*Tactics型の変数に戦略をセットするメソッド
	*/
	void setCrazytac(){
		this.tac[] = CreazyReadTactics();
	}

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

		if(this.tac == 1){
			this.hand = this.rock;
		}else if(this.tac == 2){
			this.hand = this.scissors;
		}else{
			this.hand = this.paper;
		}
	}
}