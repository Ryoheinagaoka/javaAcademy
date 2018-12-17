/**
* 抽象クラス
* @author nagaoka
*/

//抽象クラス
abstract class Face{

abstract void nose();

}

class nose extends Face {

	//抽象クラスよりnoseメソッドをオーバーライド
	@Override
	void nose(){
		System.out.println("hello,nose");
	}

}

//動作確認用メインメソッド
public class Question1{

public static void main(String[] args){

	nose n = new nose();

	n.nose();

}

}