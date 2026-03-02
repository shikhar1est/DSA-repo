//DONE ON TUF+
package PrefixSum;

//The idea is to use Prefix Sum Technique along with Hashing. On observing carefully, we can say
// that if a subarray arr[i...j] has sum divisible by k, then (prefix sum[i] % k) will be equal to
// the (prefix sum[j] % k). So, we can iterate over arr[] while maintaining a hash map or dictionary
// to count the number of (prefix sum mod k). For each index i, the number of subarrays ending at
// i and having sum divisible by k will be equal to the count of occurrences of (prefix sum[i] mod k) before i.


//We basically take running sums(prefixes) and store into hashmaps these values (reminders,frequency)
//if say, a remainder is at 4 different indices a,b,c,d then it would form 6 pairs(Choose 2 from 6)
// a,b | a,c | a,d | b,c | b,d | c,d |

//Handle the negative numbers by using (prefix%k+k)%k

public class SubarraySumDivisibleByK {
    public static void main(String[] args) {

    }
}
