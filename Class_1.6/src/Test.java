//Math class examples
//some classes in java do not need to be imported and they are present in the lang package of java
//e.g System class,Math class etc
public class Test{
    public static void main(String[] args){
        //abs function
        //abs mean absolute which mean that if you enter a number in positive form only.
        //if u enter a negative number it will multiple -1 with it and will make it positive.
        System.out.println(Math.abs(1));
        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(-99.99));
        //floor function
        //floor function print whole number nearest to the number and also smaller than that number
        //In both cases it will print 5.0
        System.out.println(Math.floor(5.9));
        System.out.println(Math.floor(5.2));
        //ceil function
        //ceil function work inversly to that of the floor function
        //It also print whole number to it but greater than that number
        //In both cases it will print 6.0
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.ceil(5.2));
        //round function
        //round function round off the number according to rounding off rules 
        //But it will not print the number like 5.0 or 6.0 rather 5 or 6
        System.out.println(Math.round(5.6));
        System.out.println(Math.round(5.2));
        System.out.println(Math.round(5.5));
        //min function
        //min function only takes two arguments and return the minimum value between them
        System.out.println("minimum value between two numbers");
        System.out.println(Math.min(5, 7));
        System.out.println(Math.min(9.9, 9.8));
        //if you have three number and you have to find minimum in between them
        System.out.println(Math.min(5,Math.min(9, 15)));
        //for four numbers
        System.out.println(Math.min(25,Math.min(2, Math.min(4, 7))));//and so onç
        //max function
        //also take two arguments and return maximum value between them
        //remaining concept is same as min function
        System.out.println("maximum value between two numbers");
        System.out.println(Math.max(5, 7));
        System.out.println(Math.max(9.9, 9.8));  
        System.out.println(Math.max(5,Math.min(9, 15)));
        System.out.println(Math.min(5,Math.max(9, 15)));
        //sqrt function
        //it return the square root of a number
        //And it's return type is double
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(20));
        System.out.println(Math.sqrt(40.4));
        //cbrt function
        //Calculate the cube root of a number
        //it's return type is also double
        System.out.println(Math.cbrt(64));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.cbrt(100));
        System.out.println(Math.cbrt(32.5));
        //pow function
        //calculate power of a number
        //Take two arguments and return double value
        //e.g 5 to the power 2
        System.out.println(Math.pow(5,2));
        System.out.println(Math.pow(2, 5.9));
        System.out.println(Math.pow(5.5, 2));
        //sin function
        //Should pass value in radians not in degrees
        //so if you have value in degrees first convert it into radian 
        //and for that we use "toRadians" function
        System.out.println("Finding sin value");
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.toRadians(90));
        //cos function
        //Should pass value in radians not in degrees
        //so if you have value in degrees first convert it into radian 
        //and for that we use "toRadians" function
        System.out.println("Finding cos value");
        System.out.println(Math.cos(Math.toRadians(0)));
        System.out.println(Math.toRadians(0));
        
        //tan function
        System.out.println("Finding tan value");
        System.out.println(Math.tan(Math.toRadians(0)));
        
        //PI function
        //it has the value of pi i-e 3.14.....
        System.out.println("pi value");
        System.out.println(Math.PI);
        //random function
        //generate random number everytime between 0 and 1 
        //0 can also be print but 1 can't be.
        //generate number less than 1 i-e 0.999.... and that is it's range
        //return type is double
        System.out.println("printing random number between 0 and 1");
        System.out.println(Math.random());
        //but if we want a random number between 0 and 10 i-e upto 9.99999...
        System.out.println(Math.random() * 10);
        //And if we want to print only the whole part like 2.0 not the decimal part like 2.9424...
        System.out.println(Math.floor(Math.random() * 10));
        //And if want a random number from 1 to 10 mean 1 and 10 should also be print randomly
        System.out.println(Math.floor(Math.random()* 10)+ 1);
        //divideExact function
        //Accept two integer arguments only and return int value only
        //Gives the exact value after division without the remainder
        System.out.println("Dividing two numbers");
        System.out.println(Math.divideExact(8, 4));
        System.out.println(Math.divideExact(8, 3));
    }
}