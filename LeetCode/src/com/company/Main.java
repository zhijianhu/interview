package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string="   - 321";
        String string2="3.14159";
        System.out.println(myAtoi(string));
        System.out.println(myAtoi(string2));
    }
    public static int reverse(int x) {
        if(x>Integer.MAX_VALUE||x<=Integer.MIN_VALUE)
            return 0;
        long y=0;
        boolean  positive=true;
        if(x<0)
            positive=false;
        boolean flag=true;
        x=x>=0?x:-x;
        while(x>0)
        {
            int cur=x%10;
            x=x/10;
            if(cur==0&&flag)
                continue;
            y=y*10+cur;
            flag=false;
        }
        if(!positive)
            y=-y;
        if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE)
            return 0;
        return (int)y;
    }
    public static int myAtoi(String str) {
        char[] charr=str.toCharArray();
        if(charr.length==0||(!Character.isDigit(charr[0])&&charr[0]!=' '&&charr[0]!='+'&&charr[0]!='-'))
            return 0;
        StringBuilder number=new StringBuilder();
        boolean whitespace=true;
        boolean firstpositive=true;
        for(int i=0;i<charr.length;i++){
            if(charr[i]==' '&&whitespace)
                continue;
            if(Character.isDigit(charr[i])||(charr[i]=='+'&&firstpositive)||(charr[i]=='-'&&firstpositive)) {
                number.append(charr[i]);
                System.out.println(charr[i]);
                whitespace = false;
                firstpositive=false;
            }
            else
                break;
        }
        System.out.println(number.length());
        System.out.println(new String(number));
        if(number.length()==0)
            return 0;
        if((number.length()==1&&charr[0]=='-')){
            return 0;
        }
        System.out.println(new String(number));
        double doublenumber=Double.valueOf(new String(number));
            if(doublenumber>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(doublenumber<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        return (int)doublenumber;
    }
}
