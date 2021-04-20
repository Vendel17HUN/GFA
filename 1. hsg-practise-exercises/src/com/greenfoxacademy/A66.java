package com.greenfoxacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A66 {
    public static void main(String[] args) throws IOException {
        Path myFile = Paths.get("assets/logs.csv");
        countEntries(myFile);

    }

    public static void countEntries(Path path) throws IOException {
        ArrayList<String> entryCodes = new ArrayList<>();
        Path result = Paths.get("assets/a66entering.json");

        try {
            Path filePath = Paths.get(String.valueOf(path));
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                entryCodes.add(line.substring(line.length() - 11));

            }
        } catch (Exception e) {
            System.out.println(0);
        }
        Map<Object, Long> counts =
                entryCodes.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);
        File file = new File("assets/a66entering.json");

        BufferedWriter bf = null;;

        try{

            //create new BufferedWriter for the output file
            bf = new BufferedWriter( new FileWriter(file) );

            //iterate map entries
            bf.write("{");
            bf.newLine();
            for(Map.Entry<Object, Long> entry : counts.entrySet()){

                //put key and value separated by a colon
                bf.write( "\""+entry.getKey()+"\"" + ":" + entry.getValue()+"," );

                //new line
                bf.newLine();
            }
            bf.write("}");

            bf.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{

            try{
                //always close the writer
                bf.close();
            }catch(Exception e){}
        }
    }

}
