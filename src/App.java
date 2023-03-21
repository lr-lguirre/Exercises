import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int nums[] = {25, 4, 16, 9, 10};
        int sumNumbers = sumNums(nums);
        System.out.println("Total: " + sumNumbers);
        boolean findValue = findVal(nums);
        if (findValue) { System.out.println("Item Found"); }
            else { System.out.println("Item not found"); }
            int userIn = userNums();
        System.out.println(userIn);
    }

    public static int sumNums (int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public static Boolean findVal (int nums[]) {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input search number: ");
        int numSearch = sc.nextInt();
        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] == numSearch)
                found = true;
            }
            //sc.close();
            return found;
    }
    public static int userNums () {
        Scanner input = new Scanner(System.in);
        int total = 6;
        int i = 1;
        int [] arr = new int[5];
        while (i < total ){
            int idx = i - 1;
            System.out.println("Input value " + i + ": ");
            arr[idx] = input.nextInt();
            i++;
        }
        //input.close();
        return sumNums(arr);
    } 
}
