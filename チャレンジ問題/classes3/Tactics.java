/**
* じゃんけん戦略インターフェース
*/
public interface Tactics {
/**
 * 戦略の通りにじゃんけんの手を返却するメソッド.
* グー・チョキ・パーは以下の対応を取る整数で表す.
 * (1:グー　2:チョキ　3:パー)
 * @return
*/
 public int readTactics();
}
