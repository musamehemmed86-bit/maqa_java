package pet.java;


import java.io.File;

public class PetJava {
    public static void main(String[] args) {
    File myfile = new File("C:\\Users\\hp\\Desktop\\JAVA\\File");
    File folder1 = new File("C:\\Users\\hp\\Desktop\\JAVA\\Folder-1");
    File txtfile = new File("C:\\Users\\hp\\Desktop\\JAVA\\Folder-1\\fileInfoFromFolder1.txt");
    File folder2 = new File("C:\\Users\\hp\\Desktop\\JAVA\\Folder-2");

    System.out.println("Directory myfile: " + myfile.isDirectory());
    System.out.println("Directory folder1: " + folder1.isDirectory());
    System.out.println("Directory txtfile: " + txtfile.isDirectory());
    System.out.println("Directory folder2: " + folder2.isDirectory());

    System.out.println("Absolute path: " + myfile.getAbsolutePath());
    System.out.println("File name: " + txtfile.getName());
    System.out.println("Last Modified: " + txtfile.lastModified());

    System.out.println("Folder 1 exists: " + folder1.exists());
    System.out.println("Folder 2 delete: " + folder2.delete());
    System.out.println("Folder 2 exists: " + folder2.exists());
}
}
if (Developia.createNewFile()) {
        System.out.println("File created");
            System.out.println("file name: " + Developia.getName());
        System.out.println("file path: " + Developia.getAbsolutePath());
        } else {
        System.out.println("No such a File, Already exists");
            System.out.println("file path: " + Developia.getAbsolutePath());
        }