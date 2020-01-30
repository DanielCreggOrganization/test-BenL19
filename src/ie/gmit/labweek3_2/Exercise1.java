package ie.gmit.labweek3_2;

import java.util.Scanner;

/**
 * ScanFlow
 */
public class Exercise1{

    public static void main(String[] args) {
        birthMonthFinder();
    }
    
    static void birthMonthFinder(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the month in which you were born: ");
        int month = input.nextInt();

        String result = "";

        if(month == 1){
            result = "January";
        }else if(month == 2){
            result = "February";
        }else if(month == 3){
            result = "March";
        }else if(month == 4){
            result = "April";
        }else if(month == 5){
            result = "May";
        }else if(month == 6){
            result = "June";
        }else if(month == 7){
            result = "July";
        }else if(month == 8){
            result = "August";
        }else if(month == 9){
            result = "September";
        }else if(month == 10){
            result = "October";
        }else if(month == 11){
            result = "November";
        }else if(month == 12){
            result = "December";
        }else{
            System.out.println("number entered is invalid, Enter a number between 1 and 12");
        }
        
            System.out.println("you were born in "+result);
    }
}

