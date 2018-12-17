/**
* ピラミッド作成ゲーム
* @author nagaoka
*/


public class Challenge2{
	/**
	*ピラミッド型の文字列を出力する
	*@param args コマンドライン引数
	*/
	public static void main(String[] args){

		//縦の列を上のfor文、横の列を下のfor文で表示
		//各列毎に空白と■を出力をするタイミングを指定
		for(int i = 1;i < 5;i++){
			for(int j = 1;j < 8;j++){
				switch(i){
					case 1:
						if(j == 4){
							System.out.print("■");
						}else{
							System.out.print(" ");
						}
						break;
					case 2:
						if(j == 3 || j ==5){
							System.out.print("■");
						}else{
							System.out.print(" ");
						}
						break;
					case 3:
						if(1 < j && j <7){
							System.out.print("■");
						}else{
							System.out.print(" ");
						}
						break;
					case 4:
						System.out.print("■");
						break;
				}
			}
			//一列処理が終わったら次の行に移行する為改行
			System.out.println("");
		}
	}
}