package BitManipulation;

//Since every number appears twice except for two unique numbers ($A$ and $B$)
// , XORing the entire array cancels out the pairs, leaving you with $A \oplus B$.
// Find the rightmost set bit of this result using xorTotal & (-xorTotal)—this bit represents a position
// where $A$ and $B$ must have different values (one has a 0, the other a 1). Use this single bit as a
// filtering mask to split the entire array into two separate groups. Because the repeating pairs share identical bits
// , they will naturally stay together in the same groups, while $A$ and $B$ are forced into separate piles.
// XORing each group individually cancels out their pairs, cleanly isolating the two unique numbers.

public class SingleNumber3 {
}
