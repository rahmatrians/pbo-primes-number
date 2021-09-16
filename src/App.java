import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//Created by Rahmat Riansyah - 41519010010

class Main {
    public static void main(String args[]) {
        Scanner inputFunc = new Scanner(System.in);
        getPrimes grade = new getPrimes();
        int start, end;

        System.out.print("Masukkan nilai awal : ");
        start = inputFunc.nextInt();

        System.out.print("Masukkan nilai akhir : ");
        end = inputFunc.nextInt();

        List<Integer> data = grade.generatePrime(start, end);

        System.out.println("\nBerikut adalah deret bilangan prima dari " + start + " sampai " + end + "  : "
                + data.toString().replace("[", "").replace("]", ""));

    }
}

class getPrimes {

    public List<Integer> generatePrime(int start, int end) {
        List<Integer> primes = new ArrayList<>();

        for (int x = start; x <= end; x++) {
            int temp = 0;
            for (int z = 1; z <= x; z++) {
                if (x % z == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 2) {
                primes.add(x);
            }
        }

        return primes;
    }
}