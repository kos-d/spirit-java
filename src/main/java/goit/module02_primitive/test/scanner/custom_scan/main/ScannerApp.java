package goit.module02_primitive.test.scanner.custom_scan.main;

import goit.module02_primitive.test.scanner.custom_scan.scan.CustomScanner;

//import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        CustomScanner customScan = new CustomScanner();
        customScan.scanMethod();
        customScan.messageScan();
    }
}

