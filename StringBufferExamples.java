//import java.util.*;
public class StringBufferExamples{
    public static void main ( String[] args ){

        // append() method 
        StringBuffer sb = new StringBuffer("hello");
        sb.append("Java"); // this will add in the string 
        System.out.println(sb); 

        // insert() function
        StringBuffer sc = new StringBuffer(" program ");
        sc.insert(0, "java"); // this will add this string at 0th index
        System.out.println(sc);

        // SetCharAt()
        StringBuffer str = new StringBuffer("welcome to Java ");
        System.out.println("String = "+str.toString());

        str.setCharAt(0, 'W');// it will cahnge the given index char of string 

        System.out.println("Modified string : "+str.toString());

        // setLength()

        StringBuffer str1 = new StringBuffer("Now you are in java.");
        System.out.println("string Length : "+str1.length()+" and string is "+str);

        str1.setLength(11);// it will print only given length of string 
        System.out.println("modified string :  "+str1.toString());

        // concat()

        String str2 = "Lets start ";

        str2 = str2.concat("Java programming ");// this will add two strings 
        System.out.println(str2);

        //equal()

        // string declaration
        String str3 ="Hello", str4 = "Hello", str5= "world";
        System.out.println(str3.equals(str4)); // it prints true if both strings are equal
        System.out.println(str4.equals(str5));//otherwise prints False
    }
}