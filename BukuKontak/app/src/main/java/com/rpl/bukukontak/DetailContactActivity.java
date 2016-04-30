package com.rpl.bukukontak;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DetailContactActivity extends AppCompatActivity {

  TextView textNomerTelepon;
  EditText textNama;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail_contact);

    String telp = getIntent().getStringExtra("telepon");
    textNomerTelepon = (TextView) findViewById(R.id.nomerTelepon);
    textNomerTelepon.setText(telp);

    textNama = (EditText) findViewById(R.id.nama);
  }

  public void onSave(View view) {
    String telp = textNomerTelepon.getText().toString();
    String nama = textNama.getText().toString();

    new AlertDialog.Builder(this)
      .setMessage("Contact Saved!\n" +
        "Nomor Telepon:" + telp + "\n" +
        "Nama:" + nama
      )
      .setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
          finish();
        }
      })
      .show();
  }
}
