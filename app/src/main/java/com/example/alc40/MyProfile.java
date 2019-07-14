package com.example.alc40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        TextView profileName = findViewById(R.id.profile_name);
        TextView track = findViewById(R.id.track);
        TextView country = findViewById(R.id.country);
        TextView email = findViewById(R.id.email);
        TextView phoneNumber = findViewById(R.id.phone_number);
        TextView slackUsername = findViewById(R.id.slack);

        profileName.setText(R.string.profile_name);
        track.setText(R.string.track);
        country.setText(R.string.Country);
        email.setText(R.string.email);
        phoneNumber.setText(R.string.phone_number);
        slackUsername.setText(R.string.slack_username);


    }
}
