package com.example.wakeupcall2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_main.view.*

import android.telephony.PhoneNumberUtils


import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        Call.setOnClickListener {
            var phoneNumber: String =  phoneInput.toString()
            phoneNumber.toInt()
            //pass value to Twilio
                    //use twilo to call
                }
    }
}

public class MakePhoneCall {
    // Find your Account Sid and Token at twilio.com/console
    public  final var ACCOUNT_SID = "AC4e55b0bc40f09102e0e490ab97883e8d";
    public  final var AUTH_TOKEN = "d2323c4d43c7fd729de619b798f6a66f";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        var from = "+19282188149";
        var to = "+14155551212";

        Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
        new URI("http://demo.twilio.com/docs/voice.xml")).create();

        System.out.println(call.getSid());
    }
}
