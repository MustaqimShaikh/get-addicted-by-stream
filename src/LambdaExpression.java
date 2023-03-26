public class LambdaExpression {

  /**
   * what is the lambda expression ?
   */

  public static void main(String[] args) {

//    Thread thread = new Thread(new Runnable() { // Here we using annoyances class, in this case no anonymous class is created.
//      //Runnable is functionalInterface that mean we can use directly abstract method of it. this case run() method is abstract method
//      @Override
//      public void run() {
//        System.out.println("In another thread");
//      }
//    });


    //we can also write the above code like this
    Thread thread1 = new Thread(() -> System.out.println("In another thread")); //in this case no anonymous class is created.
    thread1.start();
    System.out.println("in main method");
  }

  /**
   *Function Typically have below 4 things
   * 1.name - anonymous
   *       2.body
   *       3.parameters list   //This 2 must have the lambda function
   * 4.return type - inferred
   */


}
