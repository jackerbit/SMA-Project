package sms.function;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class SchoolDAO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public SchoolDAO() {}
	
	public List<SchoolDTO> loadData(String fileName){
		List<SchoolDTO> list = null;
		File f = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String tmp;
			while((tmp = br.readLine())!=null) {
				String[] str = tmp.split("/");
				if(list==null)
					list= new ArrayList<SchoolDTO>();
				list.add(new SchoolDTO(str[0], Integer.parseInt(str[1]), str[2], str[3],
						str[4], str[5], str[6]));
			}
		}catch(IOException e) {e.printStackTrace();}
		finally {
			try {
				if(fr!=null)	fr.close();
				if(br!=null)	br.close();
			}catch(IOException e) {e.printStackTrace();}
		}
		return list;
	}
}
