import java.util.Scanner;

public class StreetDurban {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many houses in the street? : ");
        int streetHouseNumber = keyboard.nextInt();
        int[] houseNumber = new int[streetHouseNumber];
        int[] totalNumberOfPeopleInHouse = new int[streetHouseNumber];
        int[][] houseAge = new int[streetHouseNumber][];
        int houseNumbers;
        int personAge;




        for (int row = 0; row < streetHouseNumber; row++) {
            System.out.print("What is the next house number? : ");
            houseNumbers = keyboard.nextInt();
            houseNumber[row] = houseNumbers;
        }


        for (int row = 0; row < streetHouseNumber; row++) {
            System.out.print("How many people live in House " + houseNumber[row] + "? : ");
            int numberOfPeopleLiveInTheHouse = keyboard.nextInt();
            houseAge[row] = new int[numberOfPeopleLiveInTheHouse];

            for (int column = 0; column < numberOfPeopleLiveInTheHouse; column++) {
                System.out.print("What is the age of person " + (column + 1) + "? : ");
                personAge = keyboard.nextInt();
                houseAge[row][column] = personAge;
            }
        }

        int sumOfHouseAge;
        int sumOfStreetAge = 0;

        for (int row = 0; row < houseAge.length; row++) {
            sumOfHouseAge = 0;
            for (int column = 0; column < houseAge[row].length; column++) {
                sumOfHouseAge += houseAge[row][column];
            }
            System.out.println("House " + houseNumber[row] + " has a total age of " + sumOfHouseAge);
            sumOfStreetAge += sumOfHouseAge;
        }

        System.out.println("The street has a total age of " + sumOfStreetAge);
    }




}




