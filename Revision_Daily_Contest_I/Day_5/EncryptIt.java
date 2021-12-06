package Basic_To_Advanced_DataStructure.Revision_Daily_Contest_I.Day_5;

/**
 * Encrypt It -0:31:43
 * Description
 *
 * Encryption is the process of converting a plaintext message into ciphertext which can be decoded back into the original message. An encryption algorithm along with a key is used in the encryption and decryption of data. There are several types of data encryptions which form the basis of network security. Encryption schemes are based on block or stream ciphers.
 *
 * Today, your task is to encrypt and print the encrypted string. You will be given a single line which contains alphabets, numbers and symbols, followed by a number K. You need to encrypt it in a way such that every character in the string is rotated by the given fixed number K.
 *
 * Only encrypt Alphabets and Numbers. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %, should remain unencrypted.
 *
 * Look at the sample test case for better understanding.
 *
 *
 * Input
 * Input Format
 *
 * First line of input contains a single line of string 'S'
 *
 * Second line contains the number, encrypt key  K
 *
 * Constraints
 *
 * S contains alpha, numeric and symbols
 *
 * 0<=N<=1000
 *
 *
 *
 *
 * Output
 * Print the encrypted string.
 *
 *
 * Sample Input 1
 *
 * All-convoYs-9-be:Alert1.
 * 4
 * Sample Output 1
 *
 * Epp-gsrzsCw-3-fi:Epivx5.
 * Hint
 *
 * Sample 1 Explanation
 *
 * A becomes E, Y becomes C, 9 becomes 3,
 *
 * -, . unchanged.
 */

import java.util.Scanner;

public class EncryptIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int n = arr.length;
        int k = sc.nextInt();
        res(n,k,arr);
    }

    static void res(int n, int k, char[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 'a') {
                char a = 0;
                a = (char) (arr[i] - 'a');
                arr[i] = (char) ((char) ((a+k)%26)+'a');
                System.out.print(arr[i]);
            }else if (arr[i] == ':') {
                System.out.print(arr[i]);
            }
            else if (arr[i] >= 'A') {
                char a = 0;
                a = (char) (arr[i] - 'A');
                arr[i] = (char) ((char) ((a+k)%26)+'A');
                System.out.print(arr[i]);
            } else     if (arr[i] >= '0') {
                char a = 0;
                a = (char) (arr[i] - '0');
                arr[i] = (char) ((char) ((a + k) % 10) + '0');
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]);
            }
        }
    }
}
