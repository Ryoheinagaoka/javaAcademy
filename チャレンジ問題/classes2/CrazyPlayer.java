public class CrazyPlayer extends Player{
	/**
	*オーバーライド
	*手を設定するインスタンスメソッド
	*/

	public CrazyPlayer(String name){
		super(name);
	}

	@Override
	public void sethand(){
		this.hand = 1;
	}
}