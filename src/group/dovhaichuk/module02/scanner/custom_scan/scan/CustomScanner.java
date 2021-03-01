package dovhaichuk.module02.scanner.custom_scan.scan;

import java.util.Scanner;

public class CustomScanner {
    
    private String name;
    private String email;
    private int age;
    private double height;

    // constructor
    public CustomScanner() {}    
    
    public void scanMethod() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Answer the questions!");        
    
    System.out.print("What your name -> ");
    this.name = scanner.nextLine();
    System.out.print("What your email -> ");
    this.email = scanner.nextLine();
    System.out.print("How old are yoy -> ");
    this.age = scanner.nextInt();
    System.out.print("What your height -> ");
    this.height = scanner.nextDouble();

    //scanner.close();

    }

    //public String getName() {
      //  return name;
    //}

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    
    public void messageScan() {
        //System.out.println("Hello " + name);    
        System.out.printf("Your - \n Name: %s\n Email: %s\n Age: %d\n Height: %.2f\n", name, this.email, this.age, this.height);
        //System.out.print("Hello " + this.name);
    }    
}
