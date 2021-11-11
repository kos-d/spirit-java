//package books.promdev.part_02_libraries.chapt09.io_test;

import java.io.*;

public class Delete {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Format command: java Delete <file or catalog>");
            System.exit(0);
        }
        try {
            delete(args[0]);
            System.out.println("directory or file delete");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void delete(String filename) {
        File f = new File(filename);
        
        if (!f.exists()) fail("Delete: no file or catalog");
        if (f.isDirectory()) {
            String[] files = f.list();
            if (files.length > 0) 
                fail("Delete: no write: " + filename);
        }
        boolean success = f.delete();
        if (!success) fail("Delete: delete no complete");
    }
    protected static void fail(String msg) throws IllegalArgumentException {
        throw new IllegalArgumentException(msg);
    }
}