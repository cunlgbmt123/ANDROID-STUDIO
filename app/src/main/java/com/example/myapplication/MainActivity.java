package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private CheckBox pho, bundau, hutieu, banhmi;
    private Button goimon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick()
    {
        pho = (CheckBox) findViewById(R.id.pho);
        bundau = (CheckBox) findViewById(R.id.bundau);
        hutieu = (CheckBox) findViewById(R.id.hutieu);
        banhmi = (CheckBox) findViewById(R.id.banhmi);
        goimon = (Button) findViewById(R.id.goimon);

        goimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double atm = 0;
                StringBuilder kq = new StringBuilder();
                kq.append("Món ăn được gọi: ");
                if(pho.isChecked())
                {
                    kq.append("\n\t - Phở : 50K");
                    atm += 50000;
                }
                if(bundau.isChecked())
                {
                    kq.append("\n\t - Bún Đậu : 75K");
                    atm += 75000;
                }
                if(hutieu.isChecked())
                {
                    kq.append("\n\t - Hủ Tiếu : 30K");
                    atm += 30000;
                }
                if(banhmi.isChecked())
                {
                    kq.append("\n\t - Bánh Mì : 20K");
                    atm += 20000;
                }
                DecimalFormat tien = new DecimalFormat("#,##0.00");
                String sotien = tien.format(atm);
                kq.append("\n\t ==> Tổng Thành Tiền Là: "+ sotien + "VNĐ");
                Toast.makeText(getApplicationContext(), kq.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }


}