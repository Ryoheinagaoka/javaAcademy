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

		//戦略を決める
		tom.settac();
		pepper.setCrazytac();

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