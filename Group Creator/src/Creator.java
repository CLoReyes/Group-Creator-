import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.*;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Creator
	{
		
		
		public static void main(String[] args) throws IOException
		{
			studentNames();
	
			groupGenerator();
			//collections/shuffle(myArray)
		
			
		
		}

		private static void studentNames() throws FileNotFoundException
			{	
			ArrayList<String> studes = new ArrayList<String>();
			Scanner studs = new Scanner (new File("Random22Names.txt"));
			for (String student : studes)
				{
					studes.add(student);
				}
			Collections.shuffle(studes);
			
			
				
//				Scanner fileInput = new Scanner (new File("Random22Names.txt"));
//				Scanner scannerWithNames = new Scanner(names);
//				List<String> estudiantes = new ArrayList<String>();
//				while (names.hasNextLine())
//					{
//						estudiantes.add(names.nextLine());
//					}
//				
//				String[] students = estudiantes.toArray(new String[0]);
			}


		private static void groupGenerator() throws FileNotFoundException
			{
				ArrayList<String> studes = new ArrayList<String>();
				Scanner studs = new Scanner (new File("Random22Names.txt"));
				for (String student : studes)
					{
						studes.add(student);
					}
				
				boolean regen = true;
				while (regen)
					{
						Scanner options = new Scanner (System.in);
						System.out.println("How many groups would you like?");
						int group = options.nextInt();
						
						System.out.println(studes);
						
						Scanner options2 = new Scanner (System.in);
						System.out.println("Would you like to generate another group?");
						String answer = options2.nextLine();
						if (answer.equals("Yes"))
							{
								regen = true;
							}
						else
							{
								regen = false;
								System.out.println(":thumbs_up:");
							}
						
					}
				
			}
	}
