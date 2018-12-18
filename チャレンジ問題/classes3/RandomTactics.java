//乱数を使用するためにimport
import java.util.Random;

/**
* Tacticsインターフェースを実装したクラス
*/

public class RandomTactics implements Tactics{

	/**
	*ランダムな手を設定するインスタンスメソッド
	*/
	@Override
	public int readTactics(){
		//Randomクラスの生成
		Random rnd = new Random();
		//ジャンケンの手の判定用の変数randomに1~3のランダムな値を代入
		int random = rnd.nextInt(3) + 1;

		return random;
	}
}