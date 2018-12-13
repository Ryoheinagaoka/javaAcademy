/**
* switch文基礎
* @author nagaoka
*/

/**
*クラス 名Question2
*実行時引数を用いて整数値（1~10）を指定し、
*場合に応じてメッセージを出力するクラス
*/
public class SwitchTraining{

  /**
  *mainメソッド
  *switch文を使用し、場合に応じてメッセージを出力するメソッド
  *@param args コマンドライン引数
  */
  public static void main(String[] args){

    //文字列以外が入力された際にエラーを吐く

    String arg = args[0];

    //numをint型に変換
    int num = Integer.parseInt(arg);

    /**
    *引数にint型に変換された実行時引数を代入
    */
    switch (num){
      case 1:
        System.out.println("もっと頑張りましょう");
        break;
      case 2:
        System.out.println("もう少し頑張りましょう");
        break;
      case 3:
        System.out.println("さらに上を目指しましょう");
        break;
      case 4:
        System.out.println("大変よくできました");
        break;
      case 5:
        System.out.println("大変優秀ですよ");
        break;
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        System.out.println("あきらめたらそこで試合終了ですよ");
        break;
    }
  }
}
