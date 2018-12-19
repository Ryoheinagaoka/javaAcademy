/**
* 例外
* @author nagaoka
*/

public class ExceptionTraining {
	/**
	*入力された実行時引数の値によってエラー出力を
	*/
	public static void main(String[] args) {

	try{

	 	/**
	 	*@param args
	 	*実行時引数をint型に変換
	 	*/
	   int i = Integer.parseInt(args[0]);
	   int j = Integer.parseInt(args[1]);

	   System.out.println(i/j);

	   //エラーが発生しなければ下記処理実行
	   System.out.println("正常");
	   System.out.println("終了");

	}catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
		 	/**
		 	*実行時引数の数が0個の場合or２個設定されていない場合下記エラー処理
		 	*/
		 	if (e instanceof ArrayIndexOutOfBoundsException ) {
		 		System.out.println("引数は二つ設定してください");
		 		System.out.println("終了");
		 	}
		 	/**
		 	*数字以外が設定された場合下記エラー処理
		 	*/
		 	if (e instanceof NumberFormatException ) {
		 		System.out.println("数字を入力してください");
		 		System.out.println("終了");
			}
		 }
 	}
}