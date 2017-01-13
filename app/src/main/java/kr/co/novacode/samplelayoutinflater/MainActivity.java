package kr.co.novacode.samplelayoutinflater;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = (Button)findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inflateLayout();
            }
        });
    }

    private void inflateLayout() {
        LinearLayout contentsLayout = (LinearLayout)findViewById(R.id.contentsLayout);

        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.button, contentsLayout, true);

        Button selectButton = (Button)findViewById(R.id.selectButton);
        final CheckBox allDay = (CheckBox)findViewById(R.id.allDay);
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (allDay.isChecked()) {
                    allDay.setChecked(false);
                } else {
                    allDay.setChecked(true);
                }
            }
        });
    }
}
