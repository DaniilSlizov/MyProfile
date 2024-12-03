package com.example.myprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button buttonBack = findViewById(R.id.buttonBack); // Инициализация кнопки "Назад"

        // Установка обработчика нажатия для кнопки "Назад"
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Завершение текущей активности и возврат к MainActivity
            }
        });
    }
}
