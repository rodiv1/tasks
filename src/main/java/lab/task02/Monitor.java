package lab.task02;

import java.io.File;
import java.util.Arrays;

public class Monitor {
    String[] files;
    IFileEvent event;

    public Monitor(String[] files, IFileEvent event) {
        this.files = Arrays.copyOf(files, files.length);
        this.event = event;
    }

    public void start() {
        File f;
        int n = 0;

        while (true) {
            for (int i = 0; i < files.length; i++) {
                if (files[i] != null) {
                    f = new File(files[i]);
                    if (f.exists() && f.isFile()) {
                        event.onFileAdded(files[i]);
                        files[i]=null;

                        n++;
                    }
                }
            }
            if (n == files.length) {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}


            System.out.println("Waiting...");
        }

    }
}