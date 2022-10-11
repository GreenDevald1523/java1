public class Prime {
    public static boolean isPrime(int num){ //идентификатор доступа, функция является статичной, тип возвращаемого значения, имя функции без параметров
        int count = 2;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                return false;
            }
        }
        return true;  //возвращаем значение при вызове данной функции
    }

    public static void main(String[] args) throws Exception {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
