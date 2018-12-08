package com.airline.test;

import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountLinesOfEachFile {
    public static void main(String[] args) {
        String pathname = "F:\\Projects\\IntelliJ IDEA Projects\\Airline-Projects\\src\\main\\java\\com\\airline";
        String csvPath = "F:\\Projects\\IntelliJ IDEA Projects\\Airline-Projects\\test.csv";
        File file = new File(pathname);

        Writer writer = null;
        try {
            writer = Files.newBufferedWriter(Paths.get(csvPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        String[] record = new String[2];
        String[] header = {"File Name", "LOC"};
        csvWriter.writeNext(header);

        CountLinesOfEachFile countLinesOfEachFile = new CountLinesOfEachFile();
        countLinesOfEachFile.fileOperation(file, csvWriter);
        try {
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fileOperation(File file, CSVWriter csvWriter) {
        try {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    fileOperation(f, csvWriter);
                }
            } else {
                int totalLines = getTotalLines(file);
                writeToFile(file.getName(), csvWriter, totalLines);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getTotalLines(File file) {
        int lines = 0;
        FileReader in = null;
        try {
            in = new FileReader(file);
            LineNumberReader reader = new LineNumberReader(in);
            reader.skip(Long.MAX_VALUE);
            lines = reader.getLineNumber();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public void writeToFile(String name, CSVWriter csvWriter, Integer lineNum) {
        String[] headerRecord = {name, lineNum.toString()};
        csvWriter.writeNext(headerRecord);
    }
}
