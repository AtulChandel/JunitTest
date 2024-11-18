package learn.unit.testing;

public class Calculator {
   public static int SumTwoNumber(int a, int b){
       return a+b;
   }
   public static int DifferenceTwoNumber(int a, int b){
       return a-b;
   }
   public static int MultipleTwoNumber(int a, int b){
       return a*b;
   }
   public static int DivisionTwoNumber(int a, int b){
       return a/b;
   }
   public static int sumAnyNumber(int ...num) {
       int sum = 0;
       for (int i : num) {
           sum += i;
       }
       return sum;
   }
}
