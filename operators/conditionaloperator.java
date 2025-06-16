class conditionaloperator {
public static void main(String[] args) {
int x = 10, y = 20, z = 15;
int largest = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
System.out.println("The largest number is: " + largest);
 }
}
