package Javatugas;

import java.util.Scanner;

public class TugasCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======Selamat Datang di Calculator Sederhana ======");

        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        double hasil;

        switch (operator) {
            case '+':
                hasil = num1 + num2;
                break;
            case '-':
                hasil = num1 - num2;
                break;
            case '*':
                hasil = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    hasil = num1 / num2;
                } else {
                    System.out.println("Error! Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Operator tidak valid.");
                return;
            case '%':
                hasil = num1 % num2;
                break;
        }

        System.out.println("Hasil: " + hasil);
    }
}