// TwelveInts.java
// Store 12 integers in array and display them from first to last, and from last to first

public class TwelveInts {
    public static void main(String[] args)
    {
        int[] numbers  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int i;
        System.out.println("From first to last is");
        for(i=0; i<numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println("\n");
        System.out.println("From last to first is");
        for(i = numbers.length - 1; i >= 0; i--)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}
