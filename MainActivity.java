package com.example.wakeupcall;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.util.Scanner;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.net.URI;
import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {

    public static final String ACCOUNT_SID = "AC4e55b0bc40f09102e0e490ab97883e8d";
    public static final String AUTH_TOKEN = "d2323c4d43c7fd729de619b798f6a66f";
    public int phoneNumberCall = ;

    public class MakePhoneCall (int phoneNumberCall){
        // Find your Account Sid and Token at twilio.com/console
        String scan = phoneNumberInput.next();
        phoneNumberCall = Integer.parseInt(scan);}

        public OnSubmit(string phoneNumber)
        {

        }


        public void main(String[] args) throws URISyntaxException
        {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            String from = "+19282188149";
            String to = "+phoneNumberInput";

            Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
                    new URI("http://demo.twilio.com/docs/voice.xml")).create();

            System.out.println(call.getSid());
        }
    }

}
