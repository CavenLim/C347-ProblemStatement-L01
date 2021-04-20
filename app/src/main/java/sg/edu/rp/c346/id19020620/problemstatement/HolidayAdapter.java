package sg.edu.rp.c346.id19020620.problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView holidayName;
    private TextView holidayDate;
    private ImageView holidayImage;


    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holiday = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.specificyear, parent, false);

        // Get the TextView object
        holidayName = (TextView) rowView.findViewById(R.id.textView);
        // Get the ImageView object
        holidayImage = (ImageView) rowView.findViewById(R.id.imageView);
        holidayDate = (TextView) rowView.findViewById(R.id.textViewDate);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currHoliday = holiday.get(position);
        String holidayNow = currHoliday.getHolidayName();

        holidayName.setText(holidayNow);


           if (currHoliday.getIsImage().equals("chinese new year")) {
               holidayName.setText(holidayNow);
               holidayImage.setImageResource(R.drawable.cny);
               holidayDate.setText(currHoliday.getHolidayDate());


           }
           else if (currHoliday.getIsImage().equals("national day")){
               holidayName.setText(holidayNow);
               holidayImage.setImageResource(R.drawable.national_day);
               holidayDate.setText(currHoliday.getHolidayDate());

           }
            else if (currHoliday.getIsImage().equals("hari raya haji")){
               holidayName.setText(holidayNow);
                holidayImage.setImageResource(R.drawable.hari_raya_haji);
               holidayDate.setText(currHoliday.getHolidayDate());

            }
           else if (currHoliday.getIsImage().equals("hari raya puasa")){
               holidayName.setText(holidayNow);
               holidayImage.setImageResource(R.drawable.hari_raya_puasa);
               holidayDate.setText(currHoliday.getHolidayDate());

           }

           else if (currHoliday.getIsImage().equals("christmas")){

            holidayName.setText(holidayNow);
            holidayImage.setImageResource(R.drawable.christmas);
               holidayDate.setText(currHoliday.getHolidayDate());

           }
           else if (currHoliday.getIsImage().equals("deepavali")){

               holidayName.setText(holidayNow);
               holidayImage.setImageResource(R.drawable.deepavali);
               holidayDate.setText(currHoliday.getHolidayDate());

           }
           else if (currHoliday.getIsImage().equals("labour day")){

               holidayName.setText(holidayNow);
               holidayImage.setImageResource(R.drawable.labour_day);
               holidayDate.setText(currHoliday.getHolidayDate());


           }







        // Return the nicely done up View to the ListView
        return rowView;
    }
}
