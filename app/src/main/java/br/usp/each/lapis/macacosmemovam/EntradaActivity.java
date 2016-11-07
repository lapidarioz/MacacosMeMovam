package br.usp.each.lapis.macacosmemovam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EntradaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
    }

    public void openNaoHumanoActivity(View view) {
        Intent intent = new Intent(this, NaoHumanoActivity.class);
        startActivity(intent);
    }
}
