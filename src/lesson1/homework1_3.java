package lesson1;

public class homework1_3 {
//Задача №3
    //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
    //и снова создать строку, вывести на экран

    public static void main(String[] args) {

        char[] myArray = new char[5];
        myArray[0] = 'a';
        myArray[1] = 'b';
        myArray[2] = 'c';
        myArray[3] = 'd';
        myArray[4] = 'e';


        char[] myArray2 = myArray;
        myArray[3] = 'h';
        System.out.print(myArray2);
    }
}
