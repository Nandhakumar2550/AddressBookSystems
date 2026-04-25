package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public void writeToFile(List<Contact> contacts, String fileName) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        // BufferedWriter → write data to file

        for (Contact c : contacts) {

            writer.write(c.getFirstName() + "," +
                    c.getLastName() + "," +
                    c.getCity() + "," +
                    c.getState() + "," +
                    c.getZip());
            // write contact as CSV format

            writer.newLine();
        }

        writer.close();
        // close → release resource
    }

    public List<String> readFromFile(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        // BufferedReader → read file

        List<String> data = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            data.add(line);
            // read each line and store
        }

        reader.close();

        return data;
    }
}