package SlidingWindow;

//To count the number of substrings containing at least one character with a frequency of at least $k$,
// my preferred approach is to use the "Total Substrings - Invalid Substrings" method.It is often easier
// to count what we don't want (the "At Most $k-1$" case) and subtract it from the total possible substrings.1.
// The Mathematical LogicTotal Substrings: As we discussed, for a string of length $n$,
// the total number of substrings is $\frac{n(n+1)}{2}$.Invalid Substrings: These are substrings where every
// character appears fewer than $k$ times (frequency $\le k-1$).The Goal: Result = Total - Invalid.

public class CountSubstringsWithFrequencyOfAtLeastOneCharacterK {
    static void main() {

    }
}
