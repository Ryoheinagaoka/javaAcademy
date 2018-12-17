// package classes;

/**
* じゃんけんゲーム用クラス
* @author nagaoka
*/

public class Judge{

    //Player1の名前用変数
    String name1;
    //Player2の名前用変数
    String name2;


    //judgeメソッドでプレイヤーネームを使用するためコンストラクタで名前を受け取る
    public Judge(String p1Name , String p2Name){
        this.name1 = p1Name;
        this.name2 = p2Name;
    }
        /**
        *じゃんけんの判定をするメソッド
        *@param hand1 一人目のプレイヤーの手
        *@param hand2 二人目のプレイヤーの手
        */
        public void judge(String hand1 ,String hand2){
                //player1を主軸として、player2が何を出したかによって
                //出力を変えるメソッド
                if(hand1 == "グー"){
                        switch(hand2){
                case "グー":
                        System.out.println("あいこです");
                        break;
                case "チョキ":
                        System.out.println(this.name1 + "さんの勝ち");
                        break;
                case "パー":
                        System.out.println(this.name2 + "さんの勝ち");
                        break;
                }
                }else if(hand1 == "チョキ"){
                        switch(hand2){
                                case "グー":
                        System.out.println(this.name2 + "さんの勝ち");
                        break;
                case "チョキ":
                       System.out.println("あいこです");
                        break;
                case "パー":
                        System.out.println(this.name1 + "さんの勝ち");
                        break;
                }
                }else{
                        switch(hand2){
                 case "グー":
                        System.out.println(this.name1 + "さんの勝ち");
                        break;
                case "チョキ":
                        System.out.println(this.name2 + "さんの勝ち");
                        break;
                case "パー":
                        System.out.println("あいこです");
                        break;
                        }
                }
        }
}