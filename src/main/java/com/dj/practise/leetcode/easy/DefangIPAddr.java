package com.dj.practise.leetcode.easy;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class DefangIPAddr {
    //https://leetcode.com/problems/defanging-an-ip-address/

    public static void main(String[] args) {
        System.out.println(new DefangIPAddr().defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        address = address.replaceAll("\\.", "[.]");
        return address;
    }
}
