package Module3.InputOutput.CopyDirectoryProject;

import java.io.*;

public class CopyFiles {
    private final long SMALL_SIZE = 8192L;
    private final long MEDIUM_SIZE = 16384L;
    private final long LARGE_SIZE =32768L;
    private File srcDirectory;
    private File destDirectory;

    public CopyFiles(File srcDirectory, File destDirectory){
        this.srcDirectory = srcDirectory;
        this.destDirectory = destDirectory;
    }

    public boolean copyFile() {
        return fileTypeTest(srcDirectory, destDirectory);
    }

    private boolean fileTypeTest(File srcDirectory, File destDirectory) {
        File destFile;
        boolean allCopied = true;
        if (srcDirectory.isFile()) {
            if (destDirectory.isDirectory()) {
                destFile =new File(destDirectory, srcDirectory.getName());
        }else{
            destFile = destDirectory ;
        }
            try (InputStream source = new BufferedInputStream(new FileInputStream(srcDirectory));
                    OutputStream copy = new BufferedOutputStream(new FileOutputStream(destFile))) {
                long size = srcDirectory.length();
                return dynamicSizing(source, copy, size);
            } catch (IOException e) {
                System.out.println("Stream error in testing file type: " + e);
                return false;
            }
        } else if (srcDirectory.isDirectory()) {
            File[] files = srcDirectory.listFiles();
            if (files == null) {
                System.out.println("Could not access directory: " + srcDirectory);
            } else if (files.length == 0) {
                System.out.println("Empty directory: " + srcDirectory);
            }else{

                for (File srcFile : files) {
                    boolean result;
                    File newDestDir = new File(destDirectory, srcFile.getName());
                    if (srcFile.isDirectory()) {
                        newDestDir.mkdirs();
                        result = fileTypeTest(srcFile, newDestDir);
                    } else {
                        destFile = new File(destDirectory, srcFile.getName());
                        result = fileTypeTest(srcFile, destFile);
                    }
                    if (!result){
                        allCopied = false;
                    }
                }
            }
        }
        return allCopied;
    }




    private boolean dynamicSizing(InputStream source, OutputStream copy, long size){
        byte[] buffer;
        
        if (size <= SMALL_SIZE){
            buffer = new byte[(int)getSMALL_SIZE()];
            return loopFile(buffer,source,copy);
        }else if(size <= MEDIUM_SIZE) {
            buffer = new byte[(int)getMEDIUM_SIZE()];
            return loopFile(buffer,source,copy);
        }else {
            buffer = new byte[(int) getLARGE_SIZE()];
            return loopFile(buffer,source,copy);
        }
    }

    private boolean loopFile(byte[] buffer, InputStream source,OutputStream copy){
        int bytesRead;
        try {
            while((bytesRead = source.read(buffer)) != -1) {
                copy.write(buffer,0, bytesRead);
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public long getSMALL_SIZE() {
        return SMALL_SIZE;
    }

    public long getMEDIUM_SIZE() {
        return MEDIUM_SIZE;
    }

    public long getLARGE_SIZE() {
        return LARGE_SIZE;
    }
}
