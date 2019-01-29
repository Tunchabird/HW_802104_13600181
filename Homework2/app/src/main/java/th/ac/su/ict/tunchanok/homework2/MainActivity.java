package th.ac.su.ict.tunchanok.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn01,btn02,btn03,btn04,btn05,btn06;
    private TextView tvColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvColor = findViewById(R.id.tvColor);
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn03 = findViewById(R.id.btn03);
        btn04 = findViewById(R.id.btn04);
        btn05 = findViewById(R.id.btn05);
        btn06 = findViewById(R.id.btn06);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {


                tvColor.setText("235-225-221");
                tvColor.setBackgroundColor(Color.parseColor("#ebe1dd"));


            }
        });


        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                tvColor.setText("236-203-202");
                tvColor.setBackgroundColor(Color.parseColor("#eccbca"));

            }
        });

        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                tvColor.setText("117-131-156");
                tvColor.setBackgroundColor(Color.parseColor("#75839c"));

            }
        });

        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                tvColor.setText("153-169-191");
                tvColor.setBackgroundColor(Color.parseColor("#99a9bf"));

            }
        });

        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                tvColor.setText("195-204-213");
                tvColor.setBackgroundColor(Color.parseColor("#c3ccd5"));

            }
        });

        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                tvColor.setText("221-226-229");
                tvColor.setBackgroundColor(Color.parseColor("#dde2e5"));

            }
        });

    }
}
