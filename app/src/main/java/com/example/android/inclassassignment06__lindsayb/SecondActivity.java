package com.example.android.inclassassignment06__lindsayb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText name;
    private EditText albums;
    private CheckBox together;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (EditText) findViewById(R.id.name_of_band);
        albums = (EditText) findViewById(R.id.number_of_albums);
        together = (CheckBox) findViewById(R.id.still_together);
    }

    public void submitBand(View view) {

        String submitName = name.getText().toString();
        int submitAlbum = Integer.parseInt(albums.getText().toString());
        boolean submitTogether = together.isChecked();

        Band meal = new Band(submitName, submitAlbum, submitTogether);

        Intent data = new Intent();
        data.putExtra(Keys.BAND, meal);
        setResult(RESULT_OK, data);
        finish();
    }

}