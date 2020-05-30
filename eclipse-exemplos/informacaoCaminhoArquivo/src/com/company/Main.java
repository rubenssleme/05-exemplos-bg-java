package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
        System.out.println("Entre com caminho da pasta: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files  = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for(File file : files){
            System.out.println(file);
        }

        System.out.println("Informaçoes do  arquivo");
        System.out.println("getPath " + path.getPath());
        System.out.println("getName " + path.getName());
        System.out.println("getParent " + path.getParent());
        System.out.println("free" + path.getFreeSpace());
        System.out.println("total" + path.getTotalSpace());
        System.out.println("used" + path.getUsableSpace());
        System.out.println("used" + path.getParentFile().toString());





	sc.close();
    }
}
