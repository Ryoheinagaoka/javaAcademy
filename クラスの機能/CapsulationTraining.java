/**
* カプセル化基礎
* @author nagaoka
*/

/**
*クラス名 CapsulationTraining
*/
public class CapsulationTraining{

	/**
	*mainメソッド
	*praivateDataに値をセットし、出力するメソッド
	*@param args コマンドライン引数
	*/
	public static void main(String[] args){

		//インスタンス化
		CapsulationPractice cap = new CapsulationPractice();
		//privateなインスタンス変数privateDataに200を代入

		cap.setPrivateData(200);
		//numに取得したprivateDataを代入する
		int num = cap.getPrivateData();

		System.out.println("CapsulationData:"+num);

	}
}
/**
*クラス名　CapsulationPractice
*/
class CapsulationPractice{

	/*
	*private変数
	*/
	private int privateData = 100;

	/*
	*privateな変数privateDataを取得するメソッド
	*/
	public int getPrivateData(){
		return this.privateData;
	}
	/**
	*@param number privateな変数に入れる値
	*privateな変数に値を入れるメソッド
	*/
	public void setPrivateData(int number){
		this.privateData = number;
	}
}