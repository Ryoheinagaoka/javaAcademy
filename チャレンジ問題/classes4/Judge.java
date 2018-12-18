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
    //ファイルに出力する用の結果を入れる変数
    String result;


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
        public void judge(int hand1 ,int hand2){
                //player1を主軸として、player2が何を出したかによって
                //出力を変えるメソッド
            if(hand1 == hand2){
                System.out.println("あいこ");
                this.result = "あいこ";
            }else{
                if(hand1 == 1){
                    switch(hand2){
                case 2:
                        System.out.println(this.name1 + "さんの勝ち");
                        this.result = this.name1 + "さんの勝ち";
                        break;
                case 3:
                        System.out.println(this.name2 + "さんの勝ち");
                        this.result = this.name2 + "さんの勝ち";
                        break;
                }
                }else if(hand1 == 2){
                    switch(hand2){
                        case 1:
                            System.out.println(this.name2 + "さんの勝ち");
                            this.result = this.name2 + "さんの勝ち";
                            break;
                        case 3:
                            System.out.println(this.name1 + "さんの勝ち");
                            this.result = this.name1 + "さんの勝ち";
                            break;
                    }
                }else if(hand1 == 3){
                    switch(hand2){
                    case 1:
                        System.out.println(this.name1 + "さんの勝ち");
                        this.result = this.name1 + "さんの勝ち";
                        break;
                    case 2:
                        System.out.println(this.name2 + "さんの勝ち");
                        this.result = this.name2 + "さんの勝ち";
                        break;
                    }
               }
            }
        }
}