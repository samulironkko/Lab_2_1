package com.example.lab_2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private List<String> countries;
    private ArrayAdapter<String> countriesAdapter;
    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countries = new ArrayList<String>(Arrays.asList("Afghanistan", "Albania", "Algeria", "American Samoa",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"));

        myListView = (ListView) findViewById(R.id.country_list_view);
        EditText myEditText = (EditText) findViewById(R.id.text_editor);

        findViewById(R.id.add_button).setOnClickListener(this);
        //findViewById(R.id.edit_button).setOnClickListener(this);
        findViewById(R.id.remove_button).setOnClickListener(this);

        countriesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                countries);

        myListView.setAdapter(countriesAdapter);

        /*
        final String[] COUNTRIES = new String[]{
                "Afghanistan", "Albania", "Algeria", "American Samoa",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
        };
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                COUNTRIES);
        myListView.setAdapter(aa);
        */
    }


    private String getTextFieldText(){
        EditText editor = findViewById(R.id.text_editor);
        String text = editor.getText().toString();
        return text;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.add_button){
            String countryToAdd = getTextFieldText();
            countries.add(countryToAdd);
            Collections.sort(countries);
            myListView.setAdapter(countriesAdapter);
        }
        else if (view.getId() == R.id.remove_button){

            String countryToRemove = getTextFieldText();
            countries.remove(countryToRemove);
            myListView.setAdapter(countriesAdapter);
        }
    }
}
