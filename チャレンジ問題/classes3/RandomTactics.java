//乱数を使用するためにimport
import java.util.Random;

/**
*常にグーを出す戦略のクラス
*/
public class RandomTactics implements Tactics{
	public int readTactics(){
		/**
		*手を設定するインスタンスメソッド
		*/
			//Randomクラスの生成
			Random rnd = new Random();
			//ジャンケンの手の判定用の変数randomに1~3のランダムな値を代入
			int random = rnd.nextInt(3) + 1;

			return random;
	}
}