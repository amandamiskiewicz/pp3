/*14.	The class String includes methods for examining individual characters of the sequence, 
for comparing strings, for searching strings, for extracting substrings, 
and for creating a copy of a string with all characters translated to uppercase or to lowercase. 
You can use the methods in your programs. Write a program that, for the text:
"Have a nice day!"
calculates and displays:
a.	The number of characters
b.	The first 9 characters
c.	True if the text ends with the suffix "day!"
d.	True if the text is not empty
e.	Index of the last occurrence of the character ‘e’
f.	The text in which each space character has been replaced with a minus sign
g.	The text converted to upper case*/


public class Zad14 {
    public static String x = "Have a nice day!";
    public static void main(String[] args) {
        //a
        int a = x.length();
        System.out.println(a);
        //b
        String b = x.substring(0, 10);
        System.out.println(b);
        //c
        boolean c = x.endsWith("day!");
        System.out.println(c);
        //d
        boolean d = !(x.isEmpty());
        System.out.println(d);
        //e
        int e = x.lastIndexOf("e");
        System.out.println(e);
        //f
        String f = x.replace(" ","-");
        System.out.println(f);
        //g
        String g = x.toUpperCase();
        System.out.println(g);
    }
}
