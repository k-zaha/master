class Pata{

    public static void main(String[] args) {
        System.out.println("member:" + jjc.length);
        //int a = 0;
        for(int a = 0; args.length > a; a++){
            int b = a + 1;
            System.out.println("[" + b + "]:" + args[a]);
            if(a > 10){
                break;
            }
        }


    }
    
}