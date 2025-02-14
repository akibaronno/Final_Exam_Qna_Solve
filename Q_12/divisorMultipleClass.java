import java.util.Scanner;

public class divisorMultipleClass {
    public void lcmGcd(){
        int num1,num2,max,min,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for LCM and GCD: ");
        num1  = sc.nextInt();
        num2 = sc.nextInt();
        if(num1 > num2){
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
      do {
        rem = max % min;
        max = min;
        min = rem;
       }  while(min!=0);

       int GCD = max;
       System.out.println("GCD : "+ GCD);
       int LCM = (num1*num2)/GCD;
       System.out.println("LCM : "+LCM);
             
}
}
