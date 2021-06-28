package com.WorkingWithFiles;

import java.io.*;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) {
        //Create file from Scanner. Read from that file and write into it with PrintWriter
        System.out.print("Create file path or insert file that exists: ");
        Scanner scanner = new Scanner(System.in);
        String filePathName = scanner.nextLine();
        File file = new File(filePathName);
        if(!file.exists()){
            try {
                //CREATE
                file.createNewFile();
                System.out.println(file.getName() + " created");
            } catch (IOException e) {
                System.out.println("Error creating file ") ;//No such file or directory exception
                System.out.println(e);
            }
        } else System.out.println(file.getName() + " already exists");

        try {
            //READ
            FileReader fileReader = new FileReader(filePathName);
            BufferedReader reader = new BufferedReader(fileReader);
            String content = "";
            System.out.println("CONTENT IN FILE:  ");
            if(file.length() == 0) System.out.println("FILE IS EMPTY");
            while ((content = reader.readLine()) != null){
                System.out.println(content);
            }
            //WRITE
           FileWriter fileWriter = new FileWriter(filePathName,true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            System.out.println("What do you want to print in file?");
            String textPrint = scanner.nextLine();
            printWriter.println(textPrint);
            printWriter.close();
            printWriter.flush();
            System.out.println("Contents added to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
