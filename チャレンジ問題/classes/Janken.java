// package classes;

/**
* じゃんけんゲーム
* @author nagaoka
*/

public class Janken{
	/**
	*Playerクラスのインスタンスを２つ作成し、２人のじゃんけんの結果を出力するメソッド
	*@param agrs コマンドライン引数
	*/
	public static void main(String[] args){

		//Playerクラスをインスタンス化
		//引数に名前を入れて Player.nameにセット

		Player tom = new Player("tom");
		Player pepper = new Player("pepper");

		//両者のジャンケンの手をセット
		tom.setHand();
		pepper.setHand();

		System.out.println(tom.name + "さん対" + pepper.name + "さんのじゃんけんを開始します。");
		System.out.print(tom.name + "さん : ");
		tom.changehand(tom.hand);
		System.out.print(pepper.name + "さん : ");
		pepper.changehand(pepper.hand);
		Judge judge = new Judge(tom.name,pepper.name);

		judge.judge(tom.hand,pepper.hand);
	}
}