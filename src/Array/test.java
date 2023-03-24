package Array;

public class test {
	
	private static void printName(int n) {
        if (--n > 0) {
            System.out.println(n);
            printName(n);
        }
    }
    
    public static void main(String args[]) {
            printName(10000000);
    }

}
