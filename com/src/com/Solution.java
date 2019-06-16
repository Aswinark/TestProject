package com;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.nio.file.Paths;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Files;
	import java.nio.file.Path;


	public class Solution {

		public static void main(String[] args) {
		
			List<Employee> files=readFileFromCsv("input.csv");
			for(Employee f: files)
			{
				System.out.println(f);
			}
			
			List<Employee> files1=getSortedList(files);
			for(Employee f: files1)
			{
				System.out.println(f.getfirstName());
			}
			filterFileBasedOnCity(files);
			
		}

		private static List<Employee> readFileFromCsv(String fileName)
		{
			List<Employee> files=new ArrayList<>();
			Path pathToFile=Paths.get(fileName);//to get the filepath
			try(BufferedReader br=Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
				String line=br.readLine();
				while(line!=null)
				{
					String[] attributes=line.split(",");
					Employee file=createList(attributes);
					files.add(file);
					line=br.readLine();
				}
			} catch(IOException ioe)
			{
				ioe.printStackTrace(); //it prints the error class and error line
			}
			return files;
		}
		private static Employee createList(String[] metadata)
		{
			String fName=metadata[0];
			String lName=metadata[1];
			String companyName=metadata[2];
			String address=metadata[3];
			String city=metadata[4];
			String country=metadata[5];
			String state=metadata[6];
			String zip=metadata[7];
			String phone1=metadata[8];
			String phone2=metadata[9];
			String email=metadata[10];
			String web=metadata[11];
			return new Employee(fName,lName,companyName,address,city,country,state,zip,phone1,phone2,email,web);
		
		}
		public static List<Employee> getSortedList(List<Employee> l)
		{
			
			for(int i=0;i<l.size()-1;i++)
			{
				for(int j=i+1;j<l.size()-1;j++)
				{
					if(l.get(i).getfirstName().compareTo(l.get(j).getfirstName())>0)
					{
						 Collections.swap(l,i,j);
						
					}
				}
			}
			return l;
		}
		public static void filterFileBasedOnCity(List<Employee> m)
		{

			//List<Employee1> ans=m.stream().filter(i->i.getcity().equals("New York")).collect(Collectors.toList());
			for(Employee f: m)
			{
				if(f.getcity().equals("\"New York\""))
				{
					System.out.println(f.getfirstName()+" "+f.getlastName()+" "+f.getcity());
				}
				
			}
			
		}
	}

