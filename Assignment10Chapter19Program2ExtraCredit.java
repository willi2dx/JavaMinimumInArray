/* CS 1302
    * SECTION
    * PROFESSOR NORTH
    * GORDON ELLIOTT WILLIAMS
    * Assignment 10 - Chapter 19 - Program 2 - Extra Credit
   */
public class Assignment10Chapter19Program2ExtraCredit{

public static void main(String[] args) {

   Integer[] FirstArray = {753, 984, 312, 487, 870, 981};

System.out.println("Integers from the first array ");
   display(FirstArray);
   MinMax(FirstArray);

   Double[] SecondArray = {752.1, 147.8, 258.3, 654.8, 665.9, 222.4};

System.out.println();
System.out.println("Doubles from the second array ");
   display(SecondArray);
   MinMax(SecondArray);

}

private static <E extends Comparable<E>> void display(E[] array) {

   for(int y = 0; y < array.length; y++)

{

System.out.print(array[y] + " ");

}

}

public static <E extends Comparable<E>> void MinMax(E[] list)

{

E min = null;

  

for(E item:list){

if(min == null){

min = item;

continue;

}

if(item.compareTo(min) < 0){

min = item;

}

}

System.out.println("The minimum/smallest value is  "+min);  

   E max = null;
   for(E item:list){

   if(max == null){
   max = item;
      continue;

}

   if(item.compareTo(max) > 0){
   max = item;

}

}

   System.out.println("The maximum/largest value: "+ max);

}  

}

        
        