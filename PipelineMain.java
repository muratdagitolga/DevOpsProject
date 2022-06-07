class PipelineMain {

  public static void main(String[] args) {
    
    System.out.println("Enter two numbers");
    int first = 20;
    int second = 20;
    
    System.out.println(first + " " + second);

    // add two numbers
    int sum = first + second;
    System.out.println("The sum is: " + sum);
  }

  public int add(int first, int second) {
    return first + second;
  }
}