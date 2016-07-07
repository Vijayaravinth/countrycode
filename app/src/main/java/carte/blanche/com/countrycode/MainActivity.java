package carte.blanche.com.countrycode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GetCountryDetails details;
    TextView txtCountryCode, txtCountryShortForm, txtCountryFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        details = new GetCountryDetails(MainActivity.this);
        txtCountryCode = (TextView) findViewById(R.id.countrycode);
        txtCountryShortForm = (TextView) findViewById(R.id.countryshort);
        txtCountryFullName = (TextView) findViewById(R.id.countryfull);

        //get the country short form
        String countryShortForm = details.getUserCountry();
        //get the country code
        int CountryCode = details.getCountryCode(countryShortForm);
        //get the country full name
        String countryfullname = details.getCountryFullname(countryShortForm);

        //set the values
        txtCountryCode.setText("Country Code :" + CountryCode);
        txtCountryShortForm.setText("Country Short Form :" + countryShortForm);
        txtCountryFullName.setText("Country Full Name :" + countryfullname);
    }
}
