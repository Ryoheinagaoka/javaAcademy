/**
* 抽象クラス
* @author nagaoka
*/

//抽象クラス
abstract class Face{
	//継承用のメソッドの為、処理等は特になし
	abstract void nose();

}

class Nose extends Face {

	//抽象クラスよりnoseメソッドをオーバーライド
	@Override
	void nose(){
		System.out.println("hello,nose");
	}

}

//動作確認用メインメソッド
public class AbstractTraining {

	/**
	*mainメソッド
	*noseメソッドが出力させるメソッド
	*@param コマンドライン引数
	*/
	public static void main(String[] args){

		nose n = new nose();

		n.nose();

	}

}