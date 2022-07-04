/*
Check Digits. Credit cards usually have a so-called check digit. This is a single digit that I assigned when the 
account number is developed and has a special property. One particularly simple mechanism is to assign the last digit 
of the sum of all the other digits. For example, suppose we have a nine-digit account number (including the check digit). 
The check digit would be the sum of the eight digits. This digit could be placed any where’s in the sequence, say the
third digit. As a full example, suppose the eight numbers are 12345678. Their sum is 36; thus, 6 is the check digit. 
The account number is therefore 126345678. Write a program to read in a nine digit integer from the keyboard and check it 
for these rules. Write"okay" or "not okay" for the results of the test.


*/
import java.util.Scanner;
public class Main {
        //    sumDoubleEven() will return the integer after double the value by multiplying with 2.
        public static int sumDoubleEven(long checkNum) {
            int sum = 0;
            String num = checkNum + "";
            for (int i = num.length() - 2; i >= 0; i -= 2) {
            
                sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
            }
            return sum;
        }

        public static int getDigit(int checkNum) {
            if (checkNum < 9)
                return checkNum;
            return checkNum / 10 + checkNum % 10;
        }

        public static int sumodd(long checkNum) {
            int sum = 0;
            String num = checkNum + "";
            for (int i = num.length() - 1; i >= 0; i -= 2)
                sum += Integer.parseInt(num.charAt(i) + "");
           
            return sum;
            
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please! Enter digits:");
            String in = scanner.next();
            long num = Long.parseLong(in);
            System.out.println(sumDoubleEven(num) + sumodd(num));
            if((sumDoubleEven(num) + sumodd(num)) % 10==0){
                System.out.print("Okay");
            }else {
                System.out.print("Not Okay");
            }
            System.out.println();

        }

    }
