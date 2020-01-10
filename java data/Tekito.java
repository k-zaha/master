class Priveter {
    //フィールド
    private String abc;
    private int inte;
    String def = "private修飾子をつけていない";

    //セッター
    public void setMethod(String s, int i){
        abc = s;
        inte = i;
    }

    //ゲッター
    public String sGet(){
        return abc;
    }
    public int iGet(){
        return inte;
    }
}


class Tekito {
    public static void main(String[] args){
        Priveter obj1 = new Priveter();
        obj1.setMethod("テストデータ", 123);

        System.out.println("現在Privetarクラスには\n" + obj1.sGet() + "と" + obj1.iGet() + "が格納されています。");
        //System.out.println(obj1.def);
    }
}