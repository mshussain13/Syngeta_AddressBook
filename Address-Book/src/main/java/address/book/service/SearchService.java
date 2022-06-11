package address.book.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;

public class SearchService {

	
	public List<String> searchContact(String str) throws IOException {
		 String s;
		 List<String> list=new ArrayList<>();
		 File f1 = new File("src/main/webapp/file/sample.txt");
		 FileReader fr = new FileReader(f1);
		 BufferedReader br = new BufferedReader(fr);
		 String[] words = null;
		 
		while((s=br.readLine()) != null) {
			words= s.split(",");
			for (String word : words) {
				String result = word.replaceAll("\"", "");
				if(result.equals(str)) {
					list.add(result);
				}
			}
		}
		return list;
	}
	
	
}
