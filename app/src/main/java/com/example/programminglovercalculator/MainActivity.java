package com.example.programminglovercalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner lang;
    ImageView img = null;
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

        String text = parent.getItemAtPosition(position).toString();
        String t = System.getenv(text);
        if (text.equals("Choose Lang.")){
            //do nothing
        }else{
            Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

            if (text.equals("Java")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img= findViewById(R.id.java);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);

            }else if(text.equals("C")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.c);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
                }
            else if(text.equals("C++")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.cplus);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
            }else if(text.equals("C#")){

                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.csharp);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);

            }else if(text.equals("HTML")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.html);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);

            }else if(text.equals("CSS")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.css);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);

            }else if(text.equals("JS")){
                if (img != null) {
                    img.setVisibility(View.GONE);
                }
                img = findViewById(R.id.js);
                img.setAlpha(0f);
                img.setVisibility(View.VISIBLE);
                img.animate().alpha(1f).setDuration(2000).setListener(null);
            }
            }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
//for nothing





    }
}