public class sumClass {
    public void sumOfSeries(){
        float sum = 0;
        double i = 1.0;
        do{
           sum += i;
           i = i -0.1;
           //System.out.println("sumClass: "+sum);
        } while(i>=0.1);
        System.out.println("Summing up 1+0.9+....+0.1 = "+sum);
        
    }
    }
