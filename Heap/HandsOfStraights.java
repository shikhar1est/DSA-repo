package Heap;

//You can't just pick cards at random. The absolute smallest card left in your hand must be the starting card of a new consecutive group because nothing smaller exists to jumpstart it. By tracking card frequencies in a sorted map (TreeMap), you can repeatedly grab the smallest available card and greedily check if its next required consecutive neighbors (card + 1, card + 2, etc.) are present. If any neighbor is missing, return false immediately.

public class HandsOfStraights {
    public static void main(String[] args) {

    }
}
