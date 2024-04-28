public class Driver {
    public static void main(String[] args) {

        var MathOperation=new Addition();
      System.out.println(MathOperation.add(2,4));
      System.out.println(MathOperation.sub(6,4));
      Swap mathOperation = new Swap();
      int[] result = mathOperation.swap(4, 6);
      System.out.println("Swapped values: " + result[0] + " and " + result[1]);
  
    }
}
