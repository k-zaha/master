class Pata{

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("�R�}���h���C�������������Ă��܂���(><)");
        } else if(args.length >= 9) {
            System.out.println("member:9");
        } else {
            System.out.println("member:" + args.length);
        }

        for(int a = 0; a < args.length; a++){
            int b = a + 1;
            System.out.println("[" + b + "]:" + args[a]);
            if(a > 7){ //a�������{1�̏�ԂŒʉ߂���܂ŃX�L�b�v�������邽�߁A�J�E���g�������������́A�|2�ŃJ�E���g��������������B
                //System.out.println(a);
                break;
            }
        }


    }
    
}