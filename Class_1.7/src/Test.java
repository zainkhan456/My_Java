//String class and its methods
//String is not a built in data type like int,float,double etc rather it is a class in java

public class Test{
    public static void main(String[] args){
        //there are two ways to store a string in a variable.
        String name1 = "Hello World";
        String name2 = new String("Hello World");
        System.out.println(name1);
        System.out.println(name2);
        //name1 and name2 are called referenced variables bcz they store the references of objects.
        /* So if we compare name1 and name2 strings by equality sign it will give not equal to output
           even when the two strings are equal that's because they store the refereces of objects and two 
        objects can't have same reference e.g
        if(name1 == name2){
            System.out.println("both strings are equal");
        }
        else
            System.out.println("Both the strings are not equal");
        */
// equals method
        //instead we should use equals method
        //return type bolean i-e true or false
        System.out.println("Equals method");
        if(name1.equals(name2)){
            System.out.println("Both the strings are equal");
        }
        else
            System.out.println("Both the strings are not equal");
        System.out.println(name1.equals(name2));//Simply to show that it returns true on equality
        String name3 = "Hello";
        String name4 = "hello";
        System.out.println(name3.equals(name4));//Although both the strings are same but only h is capital in first string
        //so to ignore this we use IgnoreCase method with equals method
        System.out.println(name3.equalsIgnoreCase(name4));      
        //**********************************
// charAt Method
        //charAt method or function is used to return a specific character in a string
        System.out.println("charAt method");
        System.out.println(name1.charAt(0));//print the character at index 0 i-e H
        System.out.println(name1.charAt(5));//print empty character in the string
        System.out.println(name1.charAt(10));//print empty character in the string
//      System.out.println(name1.charAt(11));//show out of bound error 
        //**********************************
// compareTo method
        /*compareTo method is used to compare two strings.when both the strings are equals it
          returns 0.when first string has less characters than the second string then it returns
          negative value e.g string1 = hell and string2 = hello output = -1,let string1 = hel and
          string2 = hello then output = -2.Similarly if first string has more characters than the 
          the second string then it will return a positive value i-e if string1 = hello and
          string2 = hell then output = 1 and so on*/
        System.out.println("compareTo method");        
        System.out.println(name1.compareTo(name2));
        //**********************************
// concat method
        //concate method is used for concatenation of two strings
        System.out.println("concat method");
        String firstname = "zain";
        String middlename = " ul";
        String lastname = " islam";
        System.out.println(firstname.concat(middlename.concat(lastname)));
// or you can also use + operator for concatenation of two strings
        System.out.println(firstname + middlename + lastname);
        //**********************************
// contains method
        //contains method is used to show whether a sequence of characters is present in a string or not
        //if present it returns true and if not it returns false
        System.out.println("contains method");
        System.out.println(name1.contains("He"));
        System.out.println(name1.contains("Ho"));
        //**********************************
// endsWith method 
        //check whether a string ends with a particular sequence of character (if yes return true) or not (return false)
        System.out.println("endsWith method"); 
        System.out.println(name1.endsWith("orld"));
        System.out.println(name1.endsWith("ello"));
// indexOf method
    //return the index of the first occurence letter in a string
    //if we enter a complete word it will return the index of the first letter of that word
        System.out.println("indexOf method");
        String name5 = "Hello are you Hello you";
        System.out.println(name5.indexOf("Hello"));
        System.out.println(name5.indexOf("H"));
        System.out.println(name5.indexOf("o"));
        System.out.println(name5.indexOf("you"));
// lastIndexOf method
    //return the index of the first letter of the last occurence word (or letter) in a string like the indexOf method
        System.out.println("lastIndexOf method");
        System.out.println(name5.lastIndexOf("Hello"));
        System.out.println(name5.lastIndexOf("H"));
        System.out.println(name5.lastIndexOf("o"));
        System.out.println(name5.lastIndexOf("you"));
// isEmpty and isBlank method
        //it is used to check whether a string is empty or not
        //if yes returns true and vice versa
        //and similar to it is isBlank method but it check whether the string has nothing i-e blank or not
        System.out.println("isEmpty and isBlank methods");
        String name6 = "";//empty and blank
        String name7 = "   ";//blank but not empty bcz it has spaces which are also considered as characters
        System.out.println(name6.isEmpty());
        System.out.println(name5.isEmpty());
        System.out.println(name7.isEmpty());
        System.out.println(name7.isBlank());
        System.out.println(name6.isBlank());
//length method
    //returns the total length of the string
    System.out.println("length method");
    System.out.println("zain ul islam");
    System.out.println(name5.length());
//replace method
    //it replaces a word or character in a string
    System.out.println("replace method");
    String name8 = "Hello how are you Hello";
    System.out.println(name8.replace("l","p"));
    System.out.println(name8.replace("are","is"));
    System.out.println(name8.replace("Hello", "Zain"));
 // startsWith method
    //return type is bolean 
    //check whether a string start with a particular character or word
    //bydefault it checks the string from 0th index
    System.out.println("startsWith method");
    System.out.println(name8.startsWith("Hell"));
    System.out.println(name8.startsWith("H"));
    System.out.println(name8.startsWith("how"));
    System.out.println(name8.startsWith("how",6));//returns true bcz the h of how is at index 6
//toLowerCase and toUpperCase methods
    System.out.println("toLowerCase and toUpperCase methods");
    System.out.println(("ZaIn").toLowerCase());
    System.out.println(name8.toLowerCase());
    System.out.println(("ZaIn").toUpperCase());
    System.out.println(name8.toUpperCase());
//trim method
    //remove the space characters or empty space before and at the end of the string and then return the string
    System.out.println("trim method");
    System.out.println("        Zain Khan        ".trim());
    }
}