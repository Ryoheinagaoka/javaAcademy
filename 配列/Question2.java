class Question2{
	public static void main(String[] args){
		
		int seiseki[][] = {
			{20,50,60},
			{30,60,70},
			{45,60,80},
			{35,40,50}
		};

		String[] empers ={"社員1","社員2","社員3","社員4"};

		int x = 1;

		for(int i =0;i < empers.length; i++){
			for(int j = 0; j < seiseki[i].length; j++){
				System.out.println(empers[i]+"の"+x+"回目の点数は"+seiseki[i][j]+"点です。");
				x++;
			}
			x=1;
		}

	}
}