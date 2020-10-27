package com.github.leandrogodoycwb.classesemetododsnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Leandro";
        funcionario.salario = 920;

        double salarioRecuperado = funcionario.recuperarSalario( 120, 20);
        System.out.println( "O Salario do Leandro é: " + salarioRecuperado );


    }
}
