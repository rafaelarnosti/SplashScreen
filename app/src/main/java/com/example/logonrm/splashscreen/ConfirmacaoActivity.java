package com.example.logonrm.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmacaoActivity extends AppCompatActivity {

    private TextView tvConfirmacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);
        tvConfirmacao = (TextView)findViewById(R.id.tvConfirmacao);

        if(getIntent()!=null){
            String Nome = getIntent().getStringExtra("NOME");
            String Idade = getIntent().getStringExtra("IDADE");
            String Time = getIntent().getStringExtra("TIME");
            tvConfirmacao.setText(getString(R.string.confirmacao_cadastro,Nome,Time));
        }

    }
}
