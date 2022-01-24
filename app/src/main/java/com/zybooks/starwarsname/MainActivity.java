package com.zybooks.starwarsname;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class NameGenerator {
        //declare variables
        private String firstName;
        private String lastName;
        private String cityName;
        private String mothersMaidenName;
        private final static String TAG = "MainActivity";


        public void createStarWarsName(String arg[]) {
            //creates a scanner variable and asks the user to input strings
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter first name: ");
            firstName = scan.nextLine();
            System.out.print("Enter last name: ");
            lastName = scan.nextLine();
            System.out.print("Enter city name: ");
            cityName = scan.nextLine();
            System.out.print("Enter mother's maiden name: ");
            mothersMaidenName = scan.nextLine();

            //use substrings to create name
            String starWarsFirstName = lastName.substring(0, 3) + firstName.substring(0, 2);
            String starWarsLastName = mothersMaidenName.substring(0, 2) + cityName.substring(0, 3);

            //output your complete star wars name
            System.out.println(starWarsFirstName + " " + starWarsLastName);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}