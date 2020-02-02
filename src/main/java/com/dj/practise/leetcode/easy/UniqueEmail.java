package com.dj.practise.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author deepakjha on 1/15/20
 * @project playground
 */
public class UniqueEmail {
    //https://leetcode.com/problems/unique-email-addresses/submissions/

    public static void main(String[] args) {
        System.out.println(new UniqueEmail().numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] names = email.split("@");
            String local = names[0].replaceAll("\\.", "");
            String localName = local.contains("+") ? local.substring(0, local.indexOf("+")) : local;
            String domainName = names[1];
            String updatedEmail = localName + "@" + domainName;

            uniqueEmails.add(updatedEmail);
        }

        return uniqueEmails.size();
    }
}
