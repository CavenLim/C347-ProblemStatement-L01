package sg.edu.rp.c346.id19020620.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class secondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvType;
    ArrayList<Holiday> holiday;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        lv = (ListView) this.findViewById(R.id.lvTypes);
        tvType = (TextView) findViewById(R.id.textViewType);

        Intent i = getIntent();
        String selectedType = i.getStringExtra("selectedType");
        tvType.setText(selectedType);


        holiday = new ArrayList<Holiday>();
        if (selectedType.equals("Secular")){
            holiday.add(new Holiday("Christmas","christmas","17/7/2018"));
            holiday.add(new Holiday("Labour Day","labour day","17/9/2018"));


        }
        else {
            holiday.add(new Holiday("Chinese New Year","chinese new year","17/7/2020"));
            holiday.add(new Holiday("Hari Raya Haji","hari raya haji","17/7/2025"));
        }

        aa = new HolidayAdapter(this,R.layout.specificyear,holiday);
        lv.setAdapter(aa);
    }
}