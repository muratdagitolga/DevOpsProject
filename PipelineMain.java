class PipelineMain {

    public static void main(String[] args) {


        // success code
        System.out.println("Enter two numbers");
        int first = 30;
        int second = 20;

        // add two numbers
        int summary = add(first, second);

        System.out.println(first + " " + second);
        System.out.println("The sum is: " + summary);


/*
        // success code
        System.out.println("Enter two numbers");
        double first = 10.0;
        double second = 20.0;

        // add two numbers
        double summary = add(first, second);

        System.out.println(first + " " + second);
        System.out.println("The sum is: " + summary);
         */

    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static long add(long first, long second) {
        return first + second;
    }
}