package BitManipulation;

//Because every number appears 3 times except for the unique one, look at the array
// vertically as columns of binary bits. If you sum up the 1s in any given bit column
// across all numbers, the numbers that appear 3 times will always contribute a multiple of 3
// to that column's total. Therefore, if you take the sum of any column modulo 3 (sum % 3),
// the triplets completely cancel out to 0, and any leftover 1 must belong exclusively to the unique number.
// By doing this for all 32 bit columns, you perfectly rebuild the single number.

public class SingleNumber2 {
}
