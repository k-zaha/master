class Priveter {
    //�t�B�[���h
    private String abc;
    private int inte;
    String def = "private�C���q�����Ă��Ȃ�";

    //�Z�b�^�[
    public void setMethod(String s, int i){
        abc = s;
        inte = i;
    }

    //�Q�b�^�[
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
        obj1.setMethod("�e�X�g�f�[�^", 123);

        System.out.println("����Privetar�N���X�ɂ�\n" + obj1.sGet() + "��" + obj1.iGet() + "���i�[����Ă��܂��B");
        //System.out.println(obj1.def);
    }
}