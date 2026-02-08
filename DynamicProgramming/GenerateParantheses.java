package DynamicProgramming;

//We recursively construct the sequence by considering these two conditions.
//
//The i-th character can be '(' if the number of opening '(' brackets used so far is less than n.
// This ensures we don’t add more opening brackets than are needed, keeping the sequence valid.
//The i-th character can be ')' if the number of closing ')' brackets used so far is less than the
// number of opening '(' brackets. This ensures that each closing bracket has a matching opening
// bracket before it, maintaining the balance

public class GenerateParantheses {
    public static void main(String[] args) {

    }
}
