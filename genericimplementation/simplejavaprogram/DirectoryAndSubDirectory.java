package genericimplementation.simplejavaprogram;

import java.io.File;

public class DirectoryAndSubDirectory {
    public static void main(String[] args) {
        File fileUrl = new File("C:\\Users\\TM\\IdeaProjects");
        directory(fileUrl);
    }
    public static long directory(File root) {
        File path = root;
        long count = path.length();

        if (path.isDirectory()) {
           for (String childF : path.list()) {
               File child = new File(path, childF);
               count += directory(child);
               System.out.println(count + "\t" + path);
           }
        }
        return count;
    }
}
