// 例外処理学習用のテストコード

class test{

   public static void main(String args[]){

 try{

   obj();


 }catch(ArrayIndexOutOfBoundsException a){


 System.out.println(a.getMessage());


 }catch(Exception e){


  System.out.println(e.getMessage());

      }
  }

 static void obj() throws Exception{

    throw new Exception
                              ("ArrayIndexOutOfBoundsException例外発生");

 
    }

}

