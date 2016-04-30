package com.rpl.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private static final int HARGA_KOPI = 5;

  private Button buttonPlus;
  private TextView textCounter;

  private int counter = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textCounter = (TextView) findViewById(R.id.textCounter);
    buttonPlus = (Button) findViewById(R.id.buttonPlus);
    buttonPlus.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        counter += 1;
        textCounter.setText(String.valueOf(counter));
      }
    });

    final TextView textPrice = (TextView) findViewById(R.id.textPrice);
    Button buttonOrder = (Button) findViewById(R.id.btnOrder);
    buttonOrder.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textPrice.setText("$" + (counter * HARGA_KOPI));
      }
    });
  }

  public void onMinus(View view) {
    counter = Math.max(0, counter - 1);
    textCounter.setText(String.valueOf(counter));
  }
}
