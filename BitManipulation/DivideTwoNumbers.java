package BitManipulation;

//The idea is similar to the previous approach with the only difference that instead
// of subtracting one unit of divisor from the dividend, we can subtract multiple units
// of divisor at once until the dividend becomes smaller than divisor. This can be easily
// done by iterating on the bit position i = 30 to 0. For each bit position i,
// where (divisor << i) is less than dividend, set the ith bit of the quotient and subtract
// (divisor << i) from the dividend. After iterating over all the bits, return the
// quotient with the corresponding sign.

public class DivideTwoNumbers {
}
