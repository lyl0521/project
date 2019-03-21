import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("d:/project");
        File[]  files = file.listFiles();
        for (int i = 1; i < files.length; i++) {
//            if (files[i].isFile()) {    //  目录下的文件，不包括子路径
            if (files[i].isDirectory()){    //   目录下的子路径，  不包括文件
                System.out.println(files[i]);
            }
        }
    }
}
