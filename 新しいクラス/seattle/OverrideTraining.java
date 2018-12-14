/**
* オーバーライド基礎
* @author nagaoka
*/

package seattle;

class SeattleEmployee {

      /**
      * 社員氏名
      */
      private String empName;

      /**
      * 社員氏名を取得する
      * @return empName
      */
      public String getEmpName() {
            return empName;
      }

      /**
      * 社員氏名をセットする
      * @param empName 社員氏名
      */
      public void setEmpName(String empName) {
          this.empName = empName;
      }

      /**
      * 所属部署を取得する
      */
      public String getDept(){
            return "無所属";
      }
}

class SeattleSSEmployee extends SeattleEmployee {

      /**
      *親クラスのgetDeptメソッドをオーバーライド
      */
      @Override
      public String getDept(){
            return "TeamTech推進室";
      }
}

public class OverrideTraining{
/**
*mainメソッド
*インスタンスを作成し、それぞれ任意の社員名をセットし、
*所属部署、社員名を出力するメソッド
*@param args コマンドライン引数
*/
  public static void main(String[] args){
      //親クラスをインスタンス化
      SeattleEmployee emp = new SeattleEmployee();
      //子クラスをインスタンス化
      SeattleSSEmployee emp2 = new SeattleSSEmployee();

      // 部署を設定する用の変数
      String busho;
      String bushoSS;

      //名前を設定
      emp.setEmpName("Pepper");
      //name変数に取得した名前を代入
      String name = emp.getEmpName();
      //所属部署を設定
      busho = emp.getDept();

      System.out.println("社員氏名:"+name);
      System.out.println("所属部署:"+busho);

      //名前を設定
      emp2.setEmpName("長岡");
       //name変数に取得した名前を代入
      String nameSS = emp2.getEmpName();
      //所属部署を設定
      bushoSS = emp2.getDept();

      System.out.println("社員氏名:"+nameSS);
      System.out.println("所属部署:"+bushoSS);

  }
}