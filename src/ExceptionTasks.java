public class ExceptionTasks {
    public static void main(String[] args) {
        try {
            sumOfAreasOfRectangles(15, 2, 2, 2);
        } catch (NegativeVariableException ex) {
            ex.printStackTrace();
        }
    }

    public static int sumOfAreasOfRectangles(int sideA1, int sideA2, int sideB1, int sideB2) {
        if (sideA1 <= 0 | sideA2 <= 0 | sideB1 <= 0 | sideB2 <= 0) {
            throw new NegativeVariableException("Боковая сторона прямоугольника не может являться нулевым или отрицательным значением!");
        }
        int area1 = sideA1 * sideA2;
        int area2 = sideB1 * sideB2;
        int sumOfAreas = area1 + area2;
        System.out.println("Сумма площадей прямоугольников = " + sumOfAreas);
        return sumOfAreas;
    }

    static class NegativeVariableException extends RuntimeException {
        public NegativeVariableException(String message) {
            super(message);
        }
    }
}

    /* Задание №1 - Создать String = null, вызвать у нее метод, отловить исключение
        try{
        String str = null;
        str.length();
    } catch(
    Exception ex)
    {
        ex.printStackTrace();
    }
        System.out.println("Программа завершена");
     */

    /* Задание №2 - Написать код, бросающий ArrayIndexOutOfBoundsException, отловить этот Exception
      try{
        int[] arr = new int[3];
        arr[4] = 5;
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Выход за пределы массива!");
        ex.printStackTrace();
    }
    */

    /*Задание №3 - создать собственный класс-исключение - наследник класса Exception,
    создать метод, выбрасывающий это исключение,
    вызвать этот метод,
    отловить это исключение,
    вывести stack trace в Standard Output
      try {
        int coolerSpeed = coolerRotationSpeed(70);
        System.out.println(coolerSpeed);
    } catch (LowRotationSpeed ex){
        System.out.println(ex.getMessage());
        System.out.println(ex.getDegrees());
        ex.printStackTrace();
    }
}
    public static int coolerRotationSpeed(int temperature) throws LowRotationSpeed {
        int rpm = 0;
        if (temperature > 100) {
            throw new LowRotationSpeed("Температура видеочипа слишком высокая, немедленно выключите компьютер!", temperature);
        }
        if (temperature <= 25) {
            rpm = 0;
        } else if (temperature > 25 & temperature <= 40) {
            rpm = 1500;
        } else if (temperature > 40 & temperature <= 60) {
            rpm = 3000;
        } else if (temperature > 60 & temperature <= 90) {
            rpm = 5000;
        }
        return rpm;
    }
static class LowRotationSpeed extends Exception {
    int degrees;
    public int getDegrees() {
        return degrees;
    }
    public LowRotationSpeed(String message, int temperature) {
        super(message);
        degrees = temperature;
    }
}
}
*/

/* Задание №4 - создать собственный класс-исключение - наследник класса RuntimeException
создать метод, выбрасывающий это исключение
вызвать этот метод
отловить это исключение
вывести stack trace в Standard Output
добавить в конструктор своего класса возможность указания сообщения
        try{
                sumOfAreasOfRectangles(15, 2, 2, -56);
                } catch (NegativeVariableException ex) {
                ex.printStackTrace();
                }

public static int sumOfAreasOfRectangles(int sideA1, int sideA2, int sideB1, int sideB2) {
        if (sideA1 <= 0 | sideA2 <= 0 | sideB1 <= 0 | sideB2 <= 0) {
            throw new NegativeVariableException("Боковая сторона прямоугольника не может являться нулевым или отрицательным значением!");
        }
        int area1 = sideA1 * sideA2;
        int area2 = sideB1 * sideB2;
        int sumOfAreas = area1 + area2;
        System.out.println("Сумма площадей прямоугольников = " + sumOfAreas);
        return sumOfAreas;
    }
    static class NegativeVariableException extends RuntimeException {
    public NegativeVariableException(String message) {
        super(message);
    }
    }
 */