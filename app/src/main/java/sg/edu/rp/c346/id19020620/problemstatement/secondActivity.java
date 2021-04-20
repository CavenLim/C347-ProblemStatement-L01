package sg.edu.rp.c346.id19020620.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

            holiday.add(new Holiday("Labour Day","labour day","1/5/2018"));
            holiday.add(new Holiday("National Day","national day","9/8/2021"));

        }
        else {
            holiday.add(new Holiday("Christmas","christmas","25/12/2021"));
            holiday.add(new Holiday("Chinese New Year","chinese new year","12/2/2021"));
            holiday.add(new Holiday("Hari Raya Haji","hari raya haji","19/7/2021"));
        }

        aa = new HolidayAdapter(this,R.layout.specificyear,holiday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holiday.get(position);
                Toast.makeText(secondActivity.this,selectedHoliday.getHolidayName()+" Date: "+selectedHoliday.getHolidayDate(),Toast.LENGTH_LONG).show();
            }
        });
    }
}