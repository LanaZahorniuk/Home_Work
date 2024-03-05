package org.example.HW_19;
import java.util.Random;
public class уч {


        public static void main(String[] args) {
            int[] numbers = checkNumber();
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }

        public static int[] makeNumbers() {
            Random random = new Random();
            int[] arr = new int[15];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(10);
            }
            return arr;
        }

        public static int[] checkNumber() {
            int[] numbers = makeNumbers();
            int sum = 0;
            int multiplicationResult;
            int evenSum = 0;

            // Вычисление контрольной суммы по алгоритму Луна
            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 != 0) {
                    multiplicationResult = numbers[i] * 2;
                    if (multiplicationResult > 9) {
                        multiplicationResult -= 9;
                    }
                    evenSum += multiplicationResult;
                } else {
                    sum += numbers[i];
                }
            }

            // Вычисление последней цифры (контрольной)
            int checksum = (sum + evenSum) % 10;
            numbers[14] = checksum; // Заменяем последний элемент в массиве на контрольную цифру

            return numbers;
        }
    }


