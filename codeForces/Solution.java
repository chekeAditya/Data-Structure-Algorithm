package Basic_To_Advanced_DataStructure.codeForces;

import java.util.*;

import java.util.*;

interface OnlineAccount {
    int basePrice = 120;
    int regularMoviePrice = 45;
    int exclusiveMoviePrice = 80;
}

class Account implements OnlineAccount, Comparable<Account> {
    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    public Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies) {
        this.ownerName = ownerName;
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
    }

    public int monthlyCost() {
        return basePrice + (noOfRegularMovies * regularMoviePrice) + (noOfExclusiveMovies * exclusiveMoviePrice);
    }

    @Override
    public int compareTo(Account other) {
        return Integer.compare(other.monthlyCost(), this.monthlyCost());
    }

    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD.";
    }
}

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<Account> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String[] input = scanner.nextLine().split(" ");
            String ownerName = input[0];
            int noOfRegularMovies = 0;
            int noOfExclusiveMovies = 0;

            if (input.length > 1) {
                noOfRegularMovies = Integer.parseInt(input[1]);
            }
            if (input.length > 2) {
                noOfExclusiveMovies = Integer.parseInt(input[2]);
            }

            list.add(new Account(ownerName, noOfRegularMovies, noOfExclusiveMovies));
        }

        // Sort the list based on the highest monthly cost first (descending order)
        Collections.sort(list);
        System.out.println("Most valuable account details:");
        System.out.println(list.get(0)); // Account with the highest monthly cost
    }
}

/*
3
Frank 12 6
David 7 19
Karen 14 4


Most valuable account details:
Owner is David and monthly cost is 1955 USD.
 */