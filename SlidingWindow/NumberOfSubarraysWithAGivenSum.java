package SlidingWindow;

public class NumberOfSubarraysWithAGivenSum {
    public static int negandpos(int[] arr,int k){ //If the array has negative numbers, a simple sliding window
        // won't work because the window sum doesn't increase monotonically. Instead, we use Prefix Sums
        // combined with a Hash Map

        //The Core Idea: The "Footprint" Map
        // Imagine you are walking on a giant number line, starting at 0. You take steps forward (positive numbers)
        // and steps backward (negative numbers).You have a magical notebook (the Hash Map).
        // Every time you land on a number, you put a checkmark next to it in your notebook.
        // Your goal is to find out how many times you have completed a path that is exactly 3 steps long (k = 3).
        //Let's Play Out the GameOur array is: [4, -4, 3]
        // Our target k = 3.Before we start walking:
        // You are standing at 0. You mark it down.
        // Notebook: { Landed on 0: 1 time }
        // Total Target Paths Found: 0
        // Step 1: You read the first number 4.You walk forward 4 steps. You are now standing on 4.
        // You want to know if you just completed a 3-step path. If you are standing on 4, the only way you just
        // finished a 3-step path is if you previously stood on 1 (since 4 - 3 = 1).
        // You check your notebook: Have we ever stood on 1? No
        // So, you just record your current spot and move on.
        // Notebook: { 0: 1 time, 4: 1 time }Total Target Paths Found: 0
        //
        // Step 2: You read the second number -4.
        // You walk backward 4 steps from where you were (4). You are now standing on 0.You want to know if you just completed a 3-step path. If you are standing on 0, the only way you just finished a 3-step path is if you previously stood on -3 (since $0 - 3 = -3$).You check your notebook: Have we ever stood on -3? No.So, you record your current spot. Since you're back at 0, it now has 2 checkmarks.Notebook: { 0: 2 times, 4: 1 time }Total Target Paths Found: 0Step 3: You read the last number 3.You walk forward 3 steps from where you were (0). You are now standing on 3.You want to know if you just completed a 3-step path. If you are standing on 3, the only way you just finished a 3-step path is if you previously stood on 0 (since $3 - 3 = 0$).You check your notebook: Have we ever stood on 0? YES! It has 2 checkmarks!What does this mean? It means twice in the past, you were standing at 0, and from those moments up until right now, your net movement was exactly 3 steps!You add those 2 checkmarks to your total success count.Total Target Paths Found: 2Look at what the array actually did:If we look at the array [4, -4, 3]:The last element [3] by itself equals 3. (That's one path).The entire array [4, -4, 3] sums up to 3. (That's the second path).The notebook successfully found both of these paths without us ever having to loop backward or guess. It just checked where we were standing (3), subtracted the target (3), and asked the notebook: "How many times did we stand at 0 before?"
    }
    public static void main(String[] args){
        int[] arr1={3, 4, -7, 1, 3, 3, 1, -4}; //Negative & Positive numbers mixed
        int k1=7;
    }
}
