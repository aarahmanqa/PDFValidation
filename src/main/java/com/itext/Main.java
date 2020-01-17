package com.itext;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Main {

	public static void main(String[] args) {

		PdfReader reader;

		try {

			reader = new PdfReader("download.pdf");

			// pageNumber = 1
			String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

			System.out.println(textFromPage);

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
