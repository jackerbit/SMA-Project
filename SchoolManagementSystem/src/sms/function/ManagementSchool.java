package sms.function;

import java.util.List;

public class ManagementSchool {
	protected List<SchoolDTO> list = null;
	
	public ManagementSchool(List<SchoolDTO> list) {
		this.list = list;
	}
	
	public void display() {
		if(list.isEmpty())	System.out.println("List school is empty !");
		else {
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i).toString());
		}
	}
	
	public void findSchoolByYear(String year) {
		int check = 0;
		if(list.isEmpty())	System.out.println("List school is empty !");
		else {
			for(int i=0;i<list.size();i++) {
				String[] tmp = list.get(i).getYear().split("-");
				if(Integer.parseInt(year) >= Integer.parseInt(tmp[0])&&Integer.parseInt(year)<=Integer.parseInt(tmp[1])) {
					System.out.println(list.get(i).toString());
					check=1;
				}
			}
		}
		if(check==0)	System.out.println("There has not found any school in list");
	}
	
	public void findSchoolByNumberOfStudent(int num) {
		int check = 0;
		if(list.isEmpty())	System.out.println("List school is empty !");
		else {
			for(int i=0;i<list.size();i++) {
				if(num<=list.get(i).getQuantity()) {
					System.out.println(list.get(i).toString());
					check=1;
				}
			}
		}
		if(check==0)	System.out.println("There has not found any school in list");
	}
	
	public void findSchoolByName(String name) {
		name = name.toUpperCase();
		System.out.println(name);
		int check = 0;
		if(list.isEmpty())	System.out.println("List school is empty !");
		else {
			for(int i=0;i<list.size();i++) {
				if(isBruteSearch(name, list.get(i).getName().toUpperCase())==true) {
					System.out.println(list.get(i).toString());
					check=1;
				}
			}
		}
		if(check==0)	System.out.println("There has not found any school in list");
	}
	
	public boolean isBruteSearch(String p, String a) {
		int i=0,j=0;
		do {
			if(a.substring(i, i+1).equals(p.substring(j, j+1))) {
				i++;
				j++;
			}else {
				i = i-j+1;
				j=0;
			}
		}while(j<p.length()&&i<a.length());
		if(j>=p.length()) return true;
		return false;
	}
}
