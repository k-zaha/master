import java.io.File;
import java.util.Scanner;

/* �\�[�X����
    �A�E�g�v�b�g�p�ō쐬�����A���΃p�X���w�肷�邱�ƂŁA���v���O�������ɂ��鏊��̃f�B���N�g����
    text�t�@�C���𐶐�����v���O�����B

    ����́AFileWriter�I�u�W�F�N�g�����ł͂Ȃ��AFile�N���X��createNewFile���\�b�h���g�p���邱�ƂŁA
    �t�@�C���𐶐������B
    File�I�u�W�F�N�g�𐶐������Ƃ��ɁA��������t�@�C���̕ۑ��ꏊ���w�肵�A�������쐬���ꂽ���ǂ����ɂ��āA
    �����Ԃ��悤�ɂȂ��Ă���B
*/

class TextFileCriate {
    public static void main(String[] args){
        try {
            System.out.println("�쐬����t�@�C�����́H");
            Scanner sc = new Scanner(System.in); 
            String pt = sc.next(); //next���\�b�h���g�����ƂŁA�L�[�{�[�h����̓��͗��A�쐬���ł���B
            String fName = pt + ".txt"; 

            File nFile = new File("criatefiles/" + fName); //�쐬����t�@�C���̕ۑ��ꏊ�́AFile�I�u�W�F�N�g�쐬���ɁA�����ɓ����B


            String str = nFile.getAbsolutePath();
            System.out.println("�쐬�t�@�C��path : " + str);

            if (nFile.createNewFile()) { //createNewFike���\�b�h�ŁA�t�@�C�������ۂɒǉ��B
               System.out.println("�t�@�C���쐬����");
            } else {
                System.out.println("�t�@�C���쐬���s");
            }

            sc.close();
        } catch(Exception e) {
            System.out.println(e);
            System.out.println("�t�@�C�����w�肳��Ă��܂���\n�R�}���h���C�������Ƀt�@�C�������w�肵�āATextFileCriate�����s����ƃe�L�X�g�t�@�C�����쐬����܂��B");
        }

    }
}