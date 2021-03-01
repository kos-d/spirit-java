package dovhaichuk.module02.scanner.custom_scan.main;

import dovhaichuk.module02.scanner.custom_scan.scan.CustomScanner;

//import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        CustomScanner customScan = new CustomScanner();
        customScan.scanMethod();
        customScan.messageScan();
    }
}

