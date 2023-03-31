package com.zybooks.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.SharedPreferences;

public class HelpPage extends AppCompatActivity {

    TextView myTextView;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page2);
      myTextView = findViewById(R.id.tv1);
      name = findViewById(R.id.et1);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // fetching the data from the SharedPreference
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("name", "");

        // setting the fetched data
        name.setText(s1);

    }

    @Override
    protected void onPause() {
        super.onPause();
        // creating sharedpref object
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // write the data entered and apply
        myEdit.putString("name", name.getText().toString());
        myEdit.apply();
    }

    public void aboutClickMethod(View view) {
        myTextView.setText(R.string.about);
        Toast.makeText(getApplicationContext(),"Ideally, this would be done using fragments!",Toast.LENGTH_SHORT).show();

    }

    public void helpClickMethod(View view) {
        myTextView.setText(R.string.help);
        Toast.makeText(getApplicationContext(),"Ideally, this would be done using fragments!",Toast.LENGTH_SHORT).show();
    }
}
