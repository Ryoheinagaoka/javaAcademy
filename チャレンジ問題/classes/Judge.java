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



    public Judge(String p1Name , String p2Name){
        this.name1 = p1Name;
        this.name2 = p2Name;
    }

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
// 		//random2の数値によって出したじゃんけんの手を設定
// 		switch (random1){
//         	case 1:
//         		player1hand = rock;
//         		break;
//         	case 2:
//         		player1hand = scissors;
//         		break;
// 	        case 3:
//         		player1hand = paper;
//         		break;
// 		}

// 		//random1の数値によって出したじゃんけんの手を設定
// 		switch (random2){
//         	case 1:
//         		player2hand = rock;
//         		break;
//         	case 2:
//         		player2hand = scissors;
//         		break;
// 	        case 3:
//         		player2hand = paper;
//         		break;
// 		}

// 		//player1を主軸として、player2が何を出したかによって
// 		//出力を変えるメソッド
// 		if(player1hand == "グー"){
// 			switch(player2hand){
// 				case "グー":
//         		judge = "あいこです";
//         		break;
//         	case "チョキ":
//         		judge = "player1の勝ちです。";
//         		break;
// 	        case "パー":
//         		judge = "player2の勝ちです。";
//         		break;
//         	}
// 		}else if(player1hand == "チョキ"){
// 			switch(player2hand){
// 				case "グー":
//         		judge = "player2の勝ちです。";
//         		break;
//         	case "チョキ":
//         		judge = "あいこです";
//         		break;
// 	        case "パー":
//         		judge = "player1の勝ちです。";
//         		break;
//         	}
// 		}else{
// 			switch(player2hand){
// 				case "グー":
//         		judge = "player1の勝ちです。";
//         		break;
//         	case "チョキ":
//         		judge = "player2の勝ちです。";
//         		break;
// 	        case "パー":
//         		judge = "あいこです";
//         		break;
// 			}

// 		}

//                                 //random2の数値によって出したじゃんけんの手を設定
//                 switch (random1){
//                 case 1:
//                         player1hand = rock;
//                         break;
//                 case 2:
//                         player1hand = scissors;
//                         break;
//                 case 3:
//                         player1hand = paper;
//                         break;
//                 }

//                 //random1の数値によって出したじゃんけんの手を設定
//                 switch (random2){
//                 case 1:
//                         player2hand = rock;
//                         break;
//                 case 2:
//                         player2hand = scissors;
//                         break;
//                 case 3:
//                         player2hand = paper;
//                         break;
//                 }
// }