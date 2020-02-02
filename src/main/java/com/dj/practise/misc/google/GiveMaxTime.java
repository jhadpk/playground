package com.dj.practise.misc.google;

/**
 * @author deepakjha
 * @project playground
 */
public class GiveMaxTime {

    public static void main(String[] args) {
        System.out.println(new GiveMaxTime().giveMaxTime("asd"));
    }

    private String giveMaxTime(final String T) {
        char[] time = T.toCharArray();

        if (time[0] == '?' ) {
            time[0] = (time[1] == '?' || time[1] <= '3') ? '2' : '1';
        }

        if (time[1] == '?') {
            time[1] = time[0] == '2' ? '3' : '9';
        }

        time[3] = time[3] == '?' ? '5' : time[3];
        time[4] = time[4] == '?' ? '9' : time[4];
        return String.copyValueOf(time);
    }
}
