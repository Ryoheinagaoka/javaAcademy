import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.*;

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
		try{
			//Playerクラスをインスタンス化
			//引数に名前を入れて Player.nameにセット
			Player tom = new Player("tom");
			Player pepper = new Player("pepper");

			//プレイヤーの戦略をセット（各Tacticsをセット）
			tom.setRandomTactics();
			pepper.setCrazyTactics();

			//各プレイヤーの手をセット
			tom.setHand();
			pepper.setHand();

			System.out.println(tom.name + "さん対" + pepper.name + "さんのじゃんけんを開始します。");
			System.out.print(tom.name + "さん : ");
			tom.changeHand(tom.hand);
			System.out.print(pepper.name + "さん : ");
			pepper.changeHand(pepper.hand);
			Judge judge = new Judge(tom.name,pepper.name);

			judge.judge(tom.hand,pepper.hand);



			//出力の準備をする
			//Calendarクラスのオブジェクトを生成する

	        Calendar cl = Calendar.getInstance();
	        //SimpleDateFormatクラスでfile名用のフォーマットパターンを設定する
	        SimpleDateFormat fileName = new SimpleDateFormat("yyyyMMdd");
	        //SimpleDateFormatクラスでfile内容用のフォーマットパターンを設定する
	        SimpleDateFormat file = new SimpleDateFormat("yyyy/MM/dd");
	        //現在の日付を設定
	        String time = fileName.format(cl.getTime());
	        String time2 = file.format(cl.getTime());
	        //絶対pathを定義
	        String path = new String("/Users/nagaoka.ryouhei/JavaAcademy/チャレンジ問題/classes4/file/result/");
	        //fileを作成する場所、名前を指定
	        File output = new File(path + "OutputJanken_" + time + ".txt");
	        //ファイルを出力する
	        FileWriter jankenResult = new FileWriter(output);
	        jankenResult.write("【日付】\n");
	        jankenResult.write(time2 + "\n");
	        jankenResult.write("\n");
	        jankenResult.write("【対戦者】\n");
	        jankenResult.write(tom.name + "," + pepper.name + "\n");
	        jankenResult.write("\n");
	        jankenResult.write("【結果】\n");
	        jankenResult.write(tom.name + ":" + tom.outputhand + "\n");
	        jankenResult.write(pepper.name + ":" + pepper.outputhand + "\n");
	        jankenResult.write(judge.result + "です。" + "\n");




	        //ファイルを閉じる
	        jankenResult.close();
		}catch(IOException e){
			System.out.println("出力エラーです");
		}
	}
}