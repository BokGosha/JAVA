package ru.mirea.lab13.Telephone;

public class Telephone {
    private String telephone;

    public Telephone(String telephone) {
        this.telephone = telephone;
    }

    public String changeTelephone() {
        String number;
        String countryNumber;
        String convertedTelephone;

        if (telephone.startsWith("+")) {
            countryNumber = telephone.substring(1, telephone.length() - 10);

            number = telephone.substring(telephone.length() - 10);

            convertedTelephone = "+" + countryNumber + " " + number.substring(0, 3) + '-' + number.substring(3, 6) + '-' + number.substring(6);
        }
        else {
            countryNumber = "7";

            number = telephone.substring(1);

            convertedTelephone = "+" + countryNumber + " " + number.substring(0, 3) + '-' + number.substring(3, 6) + '-' + number.substring(6);
        }

        return convertedTelephone;
    }
}