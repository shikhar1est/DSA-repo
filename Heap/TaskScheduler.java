package Heap;

//GREEDY METHOD:
//The greedy solution is based on one core idea: The task that appears the most times
// is the most restrictive bottleneck. If you can fit that task into a valid schedule,
// everything else will easily fall into place.


//To minimize total time, the schedule is entirely bottlenecked by the most frequent task
// ($f_{max}$). Imagine creating a grid layout where each of the $(f_{max} - 1)$
// blocks has a size of $(n + 1)$ to satisfy the cooling period. The final occurrences of these most
// frequent tasks sit safely at the very end (maxcount). You greedily fill the empty slots inside this
// grid with your remaining tasks. If you run out of empty slots because you have too many other unique
// tasks, you don't need any idle time at all, meaning the answer is simply the total number of tasks.
// Therefore, the problem reduces to a simple mathematical comparison:
// $\max((f_{max} - 1) \times (n + 1) + \text{maxcount}, \text{tasks.length})$.





//HEAP METHOD:

//The Heap Simulation Strategy:
// To minimize idle time, you always want to execute the task with the highest remaining frequency first.Count Frequencies: Throw all task frequencies into a Max-Heap.Track Cooldowns: Use a standard queue as a "cooling window" to hold tasks that are waiting for their $n$ intervals to pass. The queue stores pairs of (remaining_frequency, time_when_available).Simulate Time: Loop until both the Max-Heap and the cooling queue are empty:Increment the time counter.If there is a task available in the Max-Heap, pop it, decrement its frequency, and if it still has occurrences left, push it to the cooling queue with its "release time" ($\text{current\_time} + n$).Check if any task in the cooling queue has finished its cooldown. If yes, push it back into the Max-Heap.
public class TaskScheduler {
    public static void main(String[] args) {

    }
}
