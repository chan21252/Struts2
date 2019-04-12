package com.chan21252.web.action;

public class WeiXinID {
    public static void main(String[] args) {
        int n = 707829217;
        for (int i=2; i<(n/2); i++){
            if (n % i == 0){
                System.out.println(n/i);
            }
        }
    }
}
