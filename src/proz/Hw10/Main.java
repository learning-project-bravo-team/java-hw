package proz.Hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static void main(String[] args) {
//      HW 10.1
//      https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
//      Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//      The output should be two capital letters with a dot separating them.
//      It should look like this:
//      Sam Harris => S.H
//      patrick feeney => P.F

        System.out.println(abbrevName("rt gh"));

//        https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
//        All of the animals are having a feast! Each animal is bringing one dish.
//        There is just one rule: the dish must start and end with the same letters as the animal's name.
//        For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
//        Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.
//        Assume that beast and dish are always lowercase strings, and that each has at least two letters.
//        beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.
        System.out.println(feast("great blue heron","garlic nanu"));

//        https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
//        Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
//        Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!
//        E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
//        Note: You can expect all of the inputs to be the same length.
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
//        https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
//        When provided with a letter, return its position in the alphabet.
//        Input :: "a"
//        Output :: "Position of alphabet: 1"
//        Note: Only lowercased English letters are tested
        System.out.println(position('c'));

//        https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
//        I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.
//        P.S. Each array includes only integer numbers. Output is a number too.
        System.out.println(arrayPlusArray(new int[] {2,4,6},new int[] {-2,-4,-7}));
        System.out.println("------------ HW10.2 ------------");
//        HW 10.2
//        https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
//        Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
        System.out.println(boolToWord(false));
//        https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java

//        Your task is to create a function that does four basic mathematical operations.
//        The function should take three arguments - operation(string/char), value1(number), value2(number).
//        The function should return result of numbers after applying the chosen operation.
//        Examples(Operator, value1, value2) --> output
//        ('+', 4, 7) --> 11
//        ('-', 15, 18) --> -3
//        ('*', 5, 5) --> 25
//        ('/', 49, 7) --> 7
        System.out.println(basicMath("*", 5,6));

//        https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
//        Build a function that returns an array of integers from n to 1 where n>0.
//        Example : n=5 --> [5,4,3,2,1]
        System.out.println(Arrays.toString(reverse(15)));

//        https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
//        Write a function to split a string of space-separated words and convert it into an array of words.
//        Words in the input will be separated by exactly one space. The input will not have leading or trailing spaces.
//        A "word" is any contiguous sequence of characters that does not contain any space.
//        Examples (Input ==> Output):
//        "string" ==> ["string"]
//        "Robin Singh" ==> ["Robin", "Singh"]
//        "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));

//        https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
//Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.
// When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
// Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
// S is misinterpreted as 5
// O is misinterpreted as 0
// I is misinterpreted as 1
// The test cases contain numbers only by mistake.
        System.out.println(correct("15 I09I5"));



    }

    public static String abbrevName(String name) {
        List<String> twoWords = new ArrayList<>(Arrays.asList(name.toUpperCase().split(" ")));
        String initials="";
        initials = twoWords.get(0).charAt(0) + "." + twoWords.get(1).charAt(0);

        return initials;
    }
    public static boolean feast(String beast, String dish) {

        return (beast.charAt(0)==dish.charAt(0) &&  beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1));

    }

    public static String tripleTrouble(String one, String two, String three) {
        String s="";
        for (int i=0; i< one.length(); i++){
            s+=""+ one.charAt(i) + two.charAt(i) +three.charAt(i);
        }
        return s;
    }

    public static String position(char alphabet)
    {
        char a = 'a';
        return "Position of alphabet: " + ((int)alphabet  - (int)a +1) ;
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum=0;
        for (int i=0; i<arr1.length; i++){
            sum+=arr1[i];
        }
        for (int i=0; i<arr2.length; i++){
            sum+=arr2[i];
        }
        return sum;
    }

    public static String boolToWord(boolean b)
    {
        if (b){
            return "Yes";
        }else{
            return "No";
        }
    }
    public static Integer basicMath(String op, int v1, int v2)
    {
        if (op.equals("+")){
            return v1+v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
    public static int[] reverse(int n){
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=n-i;
        }
        return arr;
    }
    public static String[] stringToArray(String s) {
        return s.split(" ");

    }

    public static String correct(String string) {

        return string.replace('5','S').replace('0','O').replace('1','I');

    }

}
