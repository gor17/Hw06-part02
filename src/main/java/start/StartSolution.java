package start;

import static task1.Task01.arrMerge;
import static task1.Task01.printArray;
import static task2.Task02.ifSumOkey;

public class StartSolution {


    public static void main(String[] args) {

        //первое задание
        int[] firstArr = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        int[] secondArr = new int[]{2, 4, 6, 8};

        int[] с = arrMerge(firstArr, secondArr);

        System.out.println("Решение первой задачи(объединениние и сортировка двух массивов)");
        printArray(с);

        // второе задание
        int[] arr = {1, 3, 5, 9, 10, 15};
        int sum = 10;

        System.out.println("Решение второй задачи (есть ли в массиве два числа, сумма которых равна sum (sum=" + sum +")):");
        System.out.println(ifSumOkey(sum, arr));
    }

}
