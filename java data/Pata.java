class Pata{

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("コマンドライン引数が入っていません(><)");
        } else if(args.length >= 9) {
            System.out.println("member:9");
        } else {
            System.out.println("member:" + args.length);
        }

        for(int a = 0; a < args.length; a++){
            int b = a + 1;
            System.out.println("[" + b + "]:" + args[a]);
            if(a > 7){ //aが数字＋1の状態で通過するまでスキップし続けるため、カウントしたい数字分の、－2でカウント制限をかけられる。
                //System.out.println(a);
                break;
            }
        }


    }
    
}