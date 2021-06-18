package OOP.ClassObject;

public class Static {



    private static int a =10;
    public static void main(String[] args) {

        Students st = new Students("Chinh",20);
        Students st2 = new Students("Chinh",20);
        Students st3 = new Students("Chinh",20);
        Static s = new Static();
        s.display();

        System.out.println(a);
        int[] arr1 = new int[] {3, 4, 2};
        double[] arr2 = new double[] {1.3, 4.2, 6.7};
        System.out.println(ArrayCalculator.sumOfArray(arr1));
        System.out.println(ArrayCalculator.sumOfArray(arr2));
    }
    public void display()
    {
        System.out.println(Students.amoutStudent);
    }
}

class Students{
    private String name;
    private int age;
    public static int amoutStudent;
    public Students()
    {

    }
    public Students(String name, int age)
    {
        this.name = name;
        this.age = age;
        amoutStudent++;
    }


}

 class ArrayCalculator{
    public static int sumOfArray(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static double sumOfArray(double[] arr)
    {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
}
