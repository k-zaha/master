import java.io.File;
import java.util.Scanner;

/* ソース説明
    アウトプット用で作成した、相対パスを指定することで、自プログラム内にある所定のディレクトリに
    textファイルを生成するプログラム。

    今回は、FileWriterオブジェクト生成ではなく、FileクラスのcreateNewFileメソッドを使用することで、
    ファイルを生成した。
    Fileオブジェクトを生成したときに、生成するファイルの保存場所を指定し、正しく作成されたかどうかについて、
    判定を返すようになっている。
*/

class TextFileCriate {
    public static void main(String[] args){
        try {
            System.out.println("作成するファイル名は？");
            Scanner sc = new Scanner(System.in); 
            String pt = sc.next(); //nextメソッドを使うことで、キーボードからの入力欄、作成ができる。
            String fName = pt + ".txt"; 

            File nFile = new File("criatefiles/" + fName); //作成するファイルの保存場所は、Fileオブジェクト作成時に、引数に入れる。


            String str = nFile.getAbsolutePath();
            System.out.println("作成ファイルpath : " + str);

            if (nFile.createNewFile()) { //createNewFikeメソッドで、ファイルを実際に追加。
               System.out.println("ファイル作成成功");
            } else {
                System.out.println("ファイル作成失敗");
            }

            sc.close();
        } catch(Exception e) {
            System.out.println(e);
            System.out.println("ファイルが指定されていません\nコマンドライン引数にファイル名を指定して、TextFileCriateを実行するとテキストファイルが作成されます。");
        }

    }
}