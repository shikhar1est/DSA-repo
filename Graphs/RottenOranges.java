package Graphs;

//0 representing an empty cell,
//1 representing a fresh orange, or
//2 representing a rotten orange.

//The idea is to use BFS (Breadth-First Search) because BFS explores the grid level by level.
// In DFS, we can not say that a fresh orange getting rotten from another rotten orange represents
// its minimum time to rot because DFS explores deeply in one direction. However, in BFS ensuring that
// when a fresh orange becomes rotten, it is always at the earliest possible time.

//To apply this idea, we first add all the initially rotten oranges to a queue.
// Then, we process them one by one from the queue. For each rotten orange, we check its four neighboring cells.
// If a neighbor is a fresh orange (1), it becomes rotten, and we push it into the queue.
// As BFS moves level by level, we also keep track of a variable to record the time taken — this value
// increases with each level processed.
//Once the queue becomes empty, it means all possible oranges have been processed.
// Finally, we check the grid again — if any fresh orange is still left, it means it couldn’t be reached,
// so we return -1. Otherwise, the maximum time recorded gives us the minimum time required to rot all the
// oranges.
public class RottenOranges {
    public static int helper(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;

    }
    public static void main(String[] args) {
          int[][] grid={{2,1,1},{1,1,0},{0,1,1}};
          System.out.println(helper(grid));
    }
}
