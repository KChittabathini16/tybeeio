package com.tybeeio.tybeescan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.kontakt.proximity.KontaktProvider;
import com.kontakt.proximity.KontaktProximitySDK;

public class MainActivity extends AppCompatActivity {
    String apiKey = "yqXmSMOkqONhACmwQhtHhjjdPllatMrQ";
    Context context = getApplicationContext();
    KontaktProximitySDK sdk = KontaktProvider.provideProximitySDK(context, apiKey);
}