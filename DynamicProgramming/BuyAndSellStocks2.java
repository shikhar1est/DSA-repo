package DynamicProgramming;

//At every day there are only two possible states: either I don't own a stock (so I may buy), or I
// already own one (so I may sell). From each state I always have exactly two choices—perform the action
// (buy/sell) or skip the day. Buying subtracts today's price, selling adds today's price, and I recursively
// compute the best future profit from the resulting state. Since the same (day, state) repeats many times, memoize it.
// Once I realize the state is just (index, canBuy), the transitions become almost automatic.

public class BuyAndSellStocks2 {
    public static void main(String[] args) {

    }
}
