//package books.example.chapt03_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCopy {
// /home/t-800/dev/workspace/spirit-java/data2/
// /home/t-800/dev/workspace/spirit-java/src/main/java/books/example/chapt03_io/
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Format: java FileCopy <base file> <baseCopy file");
        } else {
            try {
                copy(args[0], args[1]);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void copy(String from_name, String to_name)
            throws IOException {
        File from_file = new File(from_name);

        File to_file = new File(to_name);

        if (!from_file.exists()) {
            abort("no exists file: " + from_name);
        }
        if (!from_file.isFile()) {
            abort("no possible copy catalog: " + from_name);
        }
        if (!from_file.canRead()) {
            abort("base file can not read: " + from_name);
        }
        if (to_file.isDirectory()) {
            to_file = new File(to_file, from_file.getName());
        }
        if (to_file.exists()) {
            if (!to_file.canWrite()) {
                abort("baseCopy file can not write: " + to_file);
            }
            System.out.print("overwrite exists file "
                    + to_file.getName() + "? (Y/N): ");
            System.out.flush();
            BufferedReader in
                    = new BufferedReader(new InputStreamReader(System.in));
            String response = in.readLine();
            if (!response.equals("Y") && !response.equals("y")) {
                abort("exists file can not be overwrite");
            }
        } else {
            String parent = to_file.getParent();
            if (parent == null) {
                parent = System.getProperty("user.dir");
            }
            File dir = new File(parent);
            if (!dir.exists()) {
                abort("catalog baseCopy no exists: " + parent);
            }
            if (dir.isFile()) {
                abort("catalog baseCopy no catalog: " + parent);
            }
            if (!dir.canWrite()) {
                abort("catalog baseCopy can not be write: " + parent);
            }
        }

        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(from_file);
            to = new FileOutputStream(to_file);
            byte[] buffer = new byte[4096];
            int bytes_read;

            while ((bytes_read = from.read(buffer)) != -1) {
                to.write(buffer, 0, bytes_read);
            }
        } finally {
            if (from != null) {
                try {
                    from.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (to != null) {
                try {
                    to.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void abort(String msg) throws IOException {
        throw new IOException("FileCopy: " + msg);
    }
}
