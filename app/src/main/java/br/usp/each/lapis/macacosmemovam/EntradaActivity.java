package br.usp.each.lapis.macacosmemovam;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EntradaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
    }

    public void sendMessage(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Tati queria moleux!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
