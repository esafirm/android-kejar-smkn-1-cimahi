package com.rpl.bukukontak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView display;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    display = (TextView) findViewById(R.id.display);
  }

  /* --------------------------------------------------- */
  /* > On Click */
  /* --------------------------------------------------- */

  public void onNumber(View view) {
    TextView text = (TextView) view;
    String numberText = text.getText().toString();

    display.setText(display.getText().toString() + numberText);
  }

  public void onReset(View view) {
    display.setText(null);
  }

  public void onSave(View view) {
    String textDisplay = display.getText().toString();

    Intent i = new Intent(this, DetailContactActivity.class);
    i.putExtra("telepon", textDisplay);
    startActivity(i);
  }
}
