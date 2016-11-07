package br.usp.each.lapis.macacosmemovam;

import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class NaoHumanoActivity extends AppCompatActivity {

    protected Chronometer chronometerSessao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nao_humano);
        iniciarSessao();
    }

    protected void iniciarSessao() {
        chronometerSessao = (Chronometer) findViewById(R.id.chronometerSessao);
        chronometerSessao.start();
    }

    protected void encerarSessao(View view) {
        chronometerSessao.stop();
//        Intent intent = new Intent(this, EntradaActivity.class);
//        startActivity(intent);
    }

}
