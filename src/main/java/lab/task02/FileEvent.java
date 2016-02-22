package lab.task02;

import java.io.File;
import java.util.Date;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.println("File added: " + s);
        File f = new File(s);
        long l = f.lastModified();
        Date d = new Date(l);
        System.out.println(d.toString());
    }
}