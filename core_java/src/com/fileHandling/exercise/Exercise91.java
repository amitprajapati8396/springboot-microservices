package com.fileHandling.exercise;

import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class Exercise91 {
	public static void main(String[] args) throws Exception {
		CSVWriter csvWriter = new CSVWriter(new FileWriter("movies.csv"));
        csvWriter.writeNext(new String[]{"Pushpa", "Allu Arjun" ,"Rashmika Mandanna"});
        csvWriter.writeNext(new String[]{"KGF", "Rocky","Srinidhi"});
        csvWriter.writeNext(new String[]{"Bahubali", "Prabhas", "Anushka setty"});
      
        csvWriter.close();
	}
}
