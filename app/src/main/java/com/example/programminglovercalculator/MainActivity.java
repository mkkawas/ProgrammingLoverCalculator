package com.example.programminglovercalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner lang;
    ImageView img = null;
    String final_text = "Name\t\t\t\t\t\t\t\tLanguage\t\t\t\t\t\t\t\tScore\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lang = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.langs, R.layout.spinnertext);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        lang.setAdapter(adapter);

        lang.setOnItemSelectedListener(this);




    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        int n;
        Random rand = new Random();
        TextView name = findViewById(R.id.name);
        EditText number = findViewById(R.id.number);
        TextView fin = findViewById(R.id.f);

        fin.setText(final_text);
        String text = parent.getItemAtPosition(position).toString();
        if (text.equals("Choose Lang.")){
            if (img != null) {
                img.setVisibility(View.GONE);
            }
        }else{

            if (text.equals("Java")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img= findViewById(R.id.java);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                n = rand.nextInt(100);
                number.setText(n+"%");
                final_text += name.getText().toString() +"\t\t\t\t\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+number.getText().toString()+"%\n";
                fin.setText(final_text);



            }else if(text.equals("C")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.c);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                n = rand.nextInt(100);
                number.setText(n+"%");
                final_text += name.getText().toString() +"\t\t\t\t\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+number.getText().toString()+"%\n";
                fin.setText(final_text);


            }else if(text.equals("C++")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.cplus);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                n = rand.nextInt(100);
                number.setText(n+"%");
                final_text += name.getText().toString() +"\t\t\t\t\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+number.getText().toString()+"%\n";
                fin.setText(final_text);

            }else if(text.equals("C#")){

                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.csharp);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                n = rand.nextInt(100);
                number.setText(n+"%");
                final_text += name.getText().toString() +"\t\t\t\t\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+number.getText().toString()+"%\n";
                fin.setText(final_text);



            }else if(text.equals("Python")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.python);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                n = rand.nextInt(100);
                number.setText(n+"%");
                final_text += name.getText().toString() +"\t\t\t\t\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+number.getText().toString()+"%\n";
                fin.setText(final_text);


            }else if(text.equals("PHP")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.php);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                n = rand.nextInt(100);
                number.setText(n+"%");
                final_text += name.getText().toString() +"\t\t\t\t\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+number.getText().toString()+"%\n";
                fin.setText(final_text);


            }else if(text.equals("JS")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.js);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                n = rand.nextInt(100);
                number.setText(n+"%");
                final_text += name.getText().toString() +"\t\t\t\t\t\t\t\t"+text+"\t\t\t\t\t\t\t\t"+number.getText().toString()+"%\n";
                fin.setText(final_text);
            }
            }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
//for nothing





    }
}