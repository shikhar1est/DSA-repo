package GreedyAlgorithm.ActivitySelectionProblems;

//This problem is a classic variation of the Activity Selection Problem.

//The Activity Selection Problem is a classic optimization problem used to demonstrate the Greedy Algorithm strategy.
//
//The goal is to select the maximum number of activities that can be performed
// by a single person or resource (like a meeting room),
// assuming that each activity has a specific start and end time and that only one activity can happen at a time.

//To solve this, you must follow the Earliest Finish Time (EFT) rule:
//
//Always pick the activity that finishes first.

//The Core Logic: "The Early Finisher Rule"
//To fit the most meetings in, you should always pick the meeting that ends the earliest.
// This leaves the maximum amount of time available for the next meetings.
//
//->Sort all meetings by their end times.
//
//->Pick the first meeting (it's the one that ends the earliest).
//
//->Iterate through the rest. If a meeting starts after the previous one finished, pick it and update the finish time.

public class NMeetingsInARoom {
    public static void main(String[] args) {

    }
}
