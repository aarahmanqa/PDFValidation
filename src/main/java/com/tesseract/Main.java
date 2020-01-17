package com.tesseract;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Main {

	public static void main(String[] args) {
		 Tesseract tesseract = new Tesseract(); 
	        try { 
	  
	            tesseract.setDatapath("tessdata");	            
	  
	            // the path of your tess data folder 
	            // inside the extracted file 
	            String text = tesseract.doOCR(new File("FL_CLOSED_END_MOTOR_VEHICLE_LEASE_0bb06559-7f58-4e25-b9d3-945ba248a1c8.pdf")); 
	  
	            // path of your image file 
	            System.out.print(text); 
	        } 
	        catch (TesseractException e) { 
	            e.printStackTrace(); 
	        }
	}
}
