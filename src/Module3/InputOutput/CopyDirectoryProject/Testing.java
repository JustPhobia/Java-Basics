package Module3.InputOutput.CopyDirectoryProject;

import java.io.File;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        File directory = new File("/home/superphobia/Downloads/Java Projects For Weekednd/");
        System.out.println(Arrays.toString(directory.list()));
        String person = "Abouleita";
        System.out.println(person.charAt(person.length()));
    }
}
