package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/11/20
 * @project playground
 */
public class CountPrimes {
    //https://leetcode.com/problems/count-primes/

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(17));
    }


    public int countPrimes(int n) {
        if (n <= 1) return 0;
        boolean[] nonPrimeArr = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!nonPrimeArr[i]) {
                if (isPrime(i)) {
                    markNonPrime(nonPrimeArr, i, n);
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i*i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void markNonPrime(boolean[] nonPrimeArr, int multiple, int n) {
        int i = multiple;
        while (i < n) {
            nonPrimeArr[i] = true;
            i += multiple;
        }
    }
}
