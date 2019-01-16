package com.example.lab_2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] COUNTRIES = new String[] {
                "Afghanistan", "Albania", "Algeria", "American Samoa",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
        };
        ListView myListView = (ListView) findViewById(R.id.country_list_view);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                COUNTRIES);
        myListView.setAdapter(aa);
    }
}
