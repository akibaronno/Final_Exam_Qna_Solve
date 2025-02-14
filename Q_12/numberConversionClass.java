import java.util.Scanner;

public class numberConversionClass {
public static void decimalToBinaryOctalHexadecimal(int decimal) {
    System.out.println("Decimal to binary conversion: ");
    String binary = Integer.toBinaryString(decimal);
    System.out.println("Binary: " + binary);
    System.out.println("Decimal to octal conversion: ");
    String octal = Integer.toOctalString(decimal);
    System.out.println("Octal: " + octal);
    System.out.println("Decimal to hexadecimal conversion: ");
    String hexadecimal = Integer.toHexString(decimal);
    System.out.println("Hexadecimal: " + hexadecimal);
}
public static void binaryToDecimalOctalHexadecimal(int binary){
    System.out.println("Binary to decimal conversion: ");
    int base = 2;
    int decimal  = decimalConvert(binary,base);
    // int sum = 0,i = 0,rem;
    // do{
    //     rem = binary%10;
    //     sum += rem*Math.pow(2,i);
    //     i++;
    //     binary /= 10;
    // } while(binary!=0);
    //int decimal = sum;
    System.out.println("Decimal: " + decimal);
    System.out.println("Binary to octal conversion");
    String octal = Integer.toOctalString(decimal);
    System.out.println("Octal : "+ octal);
    System.out.println("Binary to hexadecimal conversion");
    String hexadecimal = Integer.toHexString(decimal);
    System.out.println("Hexadecimal : "+ hexadecimal);
}

public static void octalToBinaryDecimalHexadecimal(int octal) {
    System.out.println("Octal to decimal conversion");
    int base = 8;
    int decimal = decimalConvert(octal,base);
    System.out.println("Decimal : "+ decimal);
    System.out.println("Octal to binary conversion");
    String binary = Integer.toBinaryString(decimal);
    System.out.println("Binary : "+ binary);
    System.out.println("Octal to hexadecimal conversion");
    String hexadecimal = Integer.toHexString(decimal);
    System.out.println("Hexadecimal : "+ hexadecimal);
}

public static void hexadecimalToBinaryOctalDecimal(int hexadecimal){
    System.out.println("Hexadecimal to decimal conversion");
    int base = 16;
    int decimal = decimalConvert(hexadecimal,base);
    System.out.println("Decimal : "+ decimal);
    System.out.println("Hexadecimal to binary conversion");
    String binary = Integer.toBinaryString(decimal);
    System.out.println("Binary : "+ binary);
    System.out.println("Hexadecimal to octal conversion");
    String octal  = Integer.toOctalString(decimal);
    System.out.println("Octal : "+octal);


}
public static int decimalConvert(int num,int base){
 
    int sum = 0,i = 0,rem;
    do{
        rem = num%10;
        sum += rem*Math.pow(base,i);
        i++;
        num /= 10;
    } while(num!=0);

    return sum;
}

    public void numberSystem() {
        Scanner sc = new Scanner(System.in);
     System.out.println("Number Conversion Program");
     System.out.println("1. Decimal to binary,octal,hexadecimal conversion");
     System.out.println("2. Binary to decimal,octal,hexadecimal conversion");
     System.out.println("3. Octal to decimal,octal,hexadecimal  conversion");
     System.out.println("4. Hexadecimal to decimal,binary,octal conversion");
     while(true){
     System.out.println("Enter your choice: ");
     int choice = sc.nextInt();
     switch (choice) {
        case 1: System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        decimalToBinaryOctalHexadecimal(decimal); 
            break;
            case 2: System.out.println("Enter a binary number: ");
            int binary = sc.nextInt();
            binaryToDecimalOctalHexadecimal(binary);
            break;
            case 3: System.out.println("Enter a Octal number: ");
            int octal = sc.nextInt();
            octalToBinaryDecimalHexadecimal(octal);
            break;
            case 4: System.out.println("Enter a Hexadecimal number: ");
            int hexadecimal = sc.nextInt();
            hexadecimalToBinaryOctalDecimal(hexadecimal);
            break;
     
        default: System.out.println("Invalid number please try again");
            break;
     }
    System.out.print("Type \""+"brk \""+" to close the connection");
    System.out.println(" or type anything to continue");
        String decision = sc.next();
        System.out.println(decision);
        if(decision.equals("brk")){
            break;
        }
        else {
            //System.out.println("Enter your choice;");
        }
    }
}
}
