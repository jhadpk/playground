package com.dj.practise.leetcode.medium;

/**
 * @author deepakjha on 2/2/20
 * @project playground
 */
public class PushDominos {
    //https://leetcode.com/problems/push-dominoes/

    //INCOMPLETE AND INCORRECT

    public static void main(String[] args) {
        System.out.println(new PushDominos().pushDominoes("R.......L.R........."));
    }

    public String pushDominoes(String dominoes) {
        String original = dominoes;

        int firstLeftPush = dominoes.indexOf('L');
        int firstRightPush = dominoes.indexOf('R');
        if (firstLeftPush < firstRightPush) {
            for (int i = 0; i < firstLeftPush; i++) {
                dominoes = dominoes.substring(0,i) + 'L' + dominoes.substring(i+1);
            }
        }

        int lastLeftPush = dominoes.lastIndexOf('L');
        int lastRightPush = dominoes.lastIndexOf('R');
        if (lastLeftPush < lastRightPush) {
            for (int i = lastRightPush; i < dominoes.length(); i++) {
                dominoes = dominoes.substring(0,i) + 'R' + dominoes.substring(i+1);
            }
        }

        //setUp Left pushes
        for (int i = dominoes.length() - 2; i >= 0; i--) {
            if (dominoes.charAt(i + 1) == 'L' && dominoes.charAt(i) == '.') {
                dominoes = dominoes.substring(0, i) + 'L' + dominoes.substring(i + 1);
            }
        }

        //setUp Right pushes
        for (int i = 1; i < dominoes.length() - 2; i++) {
            if (dominoes.charAt(i - 1) == 'R' && original.charAt(i) == '.' && (original.charAt(i + 1) == '.' || original.charAt(i + 1) == 'R')) {
                dominoes = dominoes.substring(0, i) + 'R' + dominoes.substring(i + 1);
            }
        }

        //setUp Nullified pushes
        for (int i = 1; i < dominoes.length() - 1; i++) {
            if ((original.charAt(i - 1) == 'R' && original.charAt(i + 1) == 'L' && original.charAt(i) == '.') ||
                    (original.charAt(i) != 'L' &&
                            original.charAt(i) != 'R' &&
                            original.charAt(i - 1) == '.' &&
                            original.charAt(i + 1) == '.' &&
                            dominoes.charAt(i - 1) == 'R' &&
                            dominoes.charAt(i + 1) == 'L')) {
                dominoes = dominoes.substring(0, i) + '.' + dominoes.substring(i + 1);
            }
        }

        return dominoes;
    }
}
