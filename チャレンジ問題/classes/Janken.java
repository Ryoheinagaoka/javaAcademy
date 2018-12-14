// package classes;

/**
* じゃんけんゲーム
* @author nagaoka
*/

//PlayerクラスとJudgeクラスを使うためimport
// import classes.Player.*;
// import classes.Judge.*;

// import Player.*;
// import Judge.*;

public class Janken{
	/**
	*Playerクラスのインスタンスを２つ作成し、２人のじゃんけんの結果を出力するメソッド
	*@param agrs コマンドライン引数
	*/
	public static void main(String[] args){

		//Playerクラスをインスタンス化
		//引数に名前を入れて Player.nameにセット
		// classes.Player tom = new classes.Player("tom");
		// classes.Player pepper = new classes.Player("pepper");

		Player tom = new Player("tom");
		Player pepper = new Player("pepper");

		//両者のジャンケンの手をセット
		tom.sethand();
		pepper.sethand();

		System.out.println(tom.name + "さん対" + pepper.name + "さんのじゃんけんを開始します。");
		System.out.println(tom.name + "さん : " + tom.hand);
		System.out.println(pepper.name + "さん : " + pepper.hand);

		Judge judge = new Judge(tom.name,pepper.name);

		judge.judge(tom.hand,pepper.hand);
	}
}






		// //結果出力

		// System.out.println("じゃんけんを開始します");

		// System.out.println("player1 :" + player1hand);

		// System.out.println("player2 :" + player2hand);

		// System.out.println(judge);