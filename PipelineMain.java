class PipelineMain {

    public static void main(String[] args) {

        System.out.println("Enter two numbers");
        int first = 20;
        int second = 20;

        // add two numbers
        int summary = add(first, second);
        System.out.println(first + " " + second);
        System.out.println("The sum is: " + summary);
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static long add(long first, long second) {
        return first + second;
    }

    public static double add(double first, double second) {
        return first + second;
    }
}