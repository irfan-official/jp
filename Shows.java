public class Shows{

  public static <T> void print(T value){
    System.out.print(value);
  }
  public static <T> void println(T value){
    System.out.println(value);
  }
  public static <T> void type(T value){
    System.out.println("Type of " + value + " is: " + value.getClass());
  }
}