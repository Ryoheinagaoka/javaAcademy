public class CrazyPlayer{
	/**
	*オーバーライド
	*手を設定するインスタンスメソッド
	*/

	public CrazyPlayer(String name){
		super(name);
	}

	@Override
	public void sethand(){
		this.hand = this.rock;
	}
}
