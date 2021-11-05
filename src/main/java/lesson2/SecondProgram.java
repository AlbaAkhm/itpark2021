package lesson2;

public class SecondProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        long summa = summa(3,5);
        System.out.println(summa);
        long othersumma = summa(5,5);
        System.out.println(othersumma);
        long otherssumma = summa(2,18);
        System.out.println(otherssumma);
        long resultOfMinus = minus(2,5);
        System.out.println(resultOfMinus);
        long multiplyAndSumma = multiplyAndSumma(5);
        System.out.println(multiplyAndSumma);
        long divideAndMinus = divideAndMinus(50,10);
        System.out.println(divideAndMinus);
        long differenceCube = differenceCube(81,13);
        System.out.println(differenceCube);
        long basicTrigonometricIdentity = basicTrigonometricIdentity(405);
        System.out.println(basicTrigonometricIdentity);
    }

    /**
     * Метод будет складывать два аргумента и возвращать результат этой операции
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат сложения
     */
    public static long summa(int arg1, int arg2) {
         /*В этой переменой будет храниться сложения двух чисел
         Результат вычисления должен быть совместим по типу с аргументами
         над которыми осуществляется операция сложения
        еще одна строка*/
        int result = arg1 + arg2;
        return result;
    }
    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }
    public static long multiplyAndSumma(int arg1) {
        int result = 3 * arg1 + 15;
        return result;
    }
    public static long divideAndMinus(int arg1, int arg2) {
        int result = arg1 / 2 - arg2 / 2;
        return result;
    }
    public static long differenceCube(int arg1, int arg2)  {
        int result = (int) ((Math.pow(arg1,3)) - (3 * (Math.pow(arg1,2)) * arg2) + (3 * arg1 * (Math.pow(arg2,2))) - (Math.pow(arg2,3)));
        return result;
    }
    public static long basicTrigonometricIdentity(int arg1) {
        int result = (int) ((Math.pow(Math.sin(arg1),2)) + (Math.pow(Math.cos(arg1),2)));
        return result;
    }

}
