/**
* じゃんけんゲーム用クラス
* @author nagaoka
*/

package class;

public class Player{

	//名前を格納するインスタンス変数
	String name;
	//手を格納するインスタンス変数
	int hand;

	//コンストラクタで任意の名前をセット
	void Player(String name){
		this.name = name;
	}

	/**
	*手を設定するインスタンスメソッド
	*/
	public void hands(int janken){
		this.hand = janken
	}
}