package homework.day07;

import homework.EX01;
import homework.EX06;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class EX07 {
    public static void main(String[] args) throws IOException {
        EX01 ex01 = new EX01();
        EX01.createFiledir();
        EX06 ex06 = new EX06();
        EX06.copy();
    }}