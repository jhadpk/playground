package com.dj.practise.leetcode.medium;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author deepakjha on 1/10/20
 * @project playground
 */
public class TinyUrl {
    //https://leetcode.com/problems/encode-and-decode-tinyurl/
    private final String URL = "http://tinyurl.com/";
    Map<String, String> encodeMap = new HashMap<>();
    Map<String, String> decodeMap = new HashMap<>();
    Set<String> encodedUrls = new HashSet<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (encodedUrls.contains(longUrl)) {
            return URL + decodeMap.get(longUrl);
        }
        boolean newKeyFound = false;
        String key = "";
        while (!newKeyFound) {
            key = getKey();
            if (!encodeMap.containsKey(URL + key)) {
                newKeyFound = true;
            }
        }
        encodeMap.put(URL + key, longUrl);
        decodeMap.put(longUrl, key);
        encodedUrls.add(longUrl);
        return URL + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return encodeMap.get(shortUrl);
    }


    private String getKey() {
        final String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVQXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * alphanumeric.length());
            sb.append(alphanumeric.charAt(index));
        }
        return sb.toString();
    }
}
