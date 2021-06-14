package com.example.webview_browser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonIr;
    private Button buttonFechar;
    private TextView editTextTextURL;
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa os componentes da interface aos componentes da classe
        buttonFechar = findViewById(R.id.buttonFechar);
        buttonIr = findViewById(R.id.buttonIr);
        editTextTextURL = findViewById(R.id.editTextTextURL);
        webview = (WebView) findViewById (R.id.webview);

        //Inicialização do textView com o endereço
        editTextTextURL.setText("https://www.google.com");
    }

    public void onClickBotaoIr(View v){
        webview.loadUrl(editTextTextURL.getText().toString());
    }

    public void onClickBotaoFechar(View v){
        System.exit(0);
    }
}