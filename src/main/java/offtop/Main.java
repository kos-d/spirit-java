package offtop;

public class Main {
    public static void main(String[] args) {
        byte b0 = -127;
        byte b1 = 0;
        byte b2 = 1;
        
        System.out.println(b0 + " " + b1 + " " + b2);
        
        boolean a = true;
        boolean b = true;
        boolean c = false;
        
//        boolean name = (a && !b) || c;
        System.out.println((a && !b) || c);
        
        
        System.out.println("------");
        int rc = 0;
for (int i = 0; i <= 6; i++) {
	if (i % 2 == 0)
		continue;
	if (i % 5 == 0)
		break;
	rc += 1;
}
System.out.println(rc);

System.out.println("------");
System.out.print("c" + (1 + 1) + ("0" + 2) + 'o');
System.out.println("------");
int []array = {1, 2, 3, 4, 5, 6};
int i = array.length - 1;
while (i > 0) {
	i--;
	System.out.print(array[i]);
}
switchExample(3);
switchExample(2);
switchExample(0);
switchExample(1);
    }
    public static int switchExample(int i) {
	switch (i) {
	case 1: System.out.print(3);
        break;
	case 2: System.out.print(2);
        break;
	case 3: System.out.print(1);
        break;
        default: System.out.print(0);
        break;
	}
	return 5;
}

}