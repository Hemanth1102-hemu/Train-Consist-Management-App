package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Train_Consist_Management_App {

    // UC11: Validate Train ID
    public static boolean validateTrainID(String trainID) {
        String regex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trainID);
        return matcher.matches();
    }

    // UC11: Validate Cargo Code
    public static boolean validateCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainID = scanner.nextLine();

        if (validateTrainID(trainID)) {
            System.out.println("Train ID is VALID.");
        } else {
            System.out.println("Train ID is INVALID.");
        }

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        if (validateCargoCode(cargoCode)) {
            System.out.println("Cargo Code is VALID.");
        } else {
            System.out.println("Cargo Code is INVALID.");
        }

        scanner.close();
    }
}