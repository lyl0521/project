package homework;

import java.io.*;

public class EX06 {
    public static void main(String[] args) {
//        编写程序，能将C盘的某一文件复制到D盘
        copy();
    }

     public static void copy(){
            try (
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("c:/123.txt"));
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:/1234.txt"))
            ) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}
