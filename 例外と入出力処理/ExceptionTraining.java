/**
* 例外
* @author nagaoka
*/

public class ExceptionTraining {
	/**
	*mainメソッド
	*入力された実行時引数の値によってエラー出力をするメソッド
	*@param args コマンドライン引数
	*/
	public static void main(String[] args) {

	try{

	   int i = Integer.parseInt(args[0]);
	   int j = Integer.parseInt(args[1]);

	   System.out.println(i/j);

	   //エラーが発生しなければ下記処理実行
	   System.out.println("正常");

	}catch(ArrayIndexOutOfBoundsException e){
		//引数の数が２つではない場合下記エラー処理
 		System.out.println("引数は二つ設定してください");
	}catch(NumberFormatException e){
	 	//数字以外が設定された場合下記エラー処理
 		System.out.println("数字を入力してください");
	}finally{
		System.out.println("終了");
	}
	}
 }