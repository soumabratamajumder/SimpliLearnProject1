package project;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class project {
    public static void main(String[] args) throws IOException {
    	File file = new File("D:\\SimplilearnFolder" );
    	
        System.out.println("**************** Welcome to Lockedme.com ***********************\n" +
                "Application Name: Virtual Key Repository\n" +
        		
                
                "***************Developer Details***************\n" +
                "Name: Soumabrata Majumder \n" +
                "Designation: JAVA Developer\n" +
                "Date: 06-07-2022");

        while (true) {
            System.out.println("Enter 1 : Get file names in ascending order\n" +
                    "Enter 2:  For Business Level Operation\n" +
                    "Enter 3: Close the Application");
            System.out.println("Enter Your Input :");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
           

            if (option == 1) {
                
                String[] children = file.list();
                Arrays.sort(children);
                for (int i = 0; i< children.length; i++) {
                    String filename = children[i];
                    System.out.println(filename);
                }
            } else if (option == 2) {
                System.out.println("Enter 1 : add file\n" +
                        "enter 2:  Delete file\n" +
                        "enter 3:  Search file\n" +
                        "enter 4:  Go back");
                
                int input = scanner.nextInt();
                
                switch (input) {
                    case 1:
                        System.out.println("Enter your file name :");
                        Scanner scanner1 = new Scanner(System.in);
                        String name = scanner1.nextLine();
                        
                        if (file.createNewFile()) {
                            System.out.println("File is created");
                        } else {
                            System.out.println("File name  already exist");
                        }
                        break;
                    case 2:
                        System.out.println("Enter file name to  delete :");
                        Scanner scanner2 = new Scanner(System.in);
                        String name1 = scanner2.nextLine();
                    
                        if(file.delete())
                            System.out.println("File is deleted");
                        else
                            System.out.println(" File not found");
                        break;
                    case 3:
                        System.out.println("Enter your file name to search :");
                        Scanner scanner3 = new Scanner(System.in);
                        String fileName = scanner3.nextLine();
                        File file2 = new File("D:\\SimplilearnFolder\\" + fileName);
                        if( file2.exists())
                        {
                            System.out.println("File is available");
                        }
                        else {
                            System.out.println("File is not available");
                        }
                    case 4:
                        System.out.println("Going  back to menu");
                        break;
                    default:
                        System.out.println("Please enter a valid one");
                }
            }
            if (option == 3){
//                System.exit(option);
                System.out.println("Exited successfully");
            }
        }
    }
}
