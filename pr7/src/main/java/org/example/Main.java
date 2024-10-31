package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        File file = new File("/home/user/Desktop/all.pdf");
        try(PDDocument document = PDDocument.load(file)) {
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            String text = pdfTextStripper.getText(document);
            System.out.println(text);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}