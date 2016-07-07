To get the country code , name, short form in android 

  GetCountryDetails details;
    TextView txtCountryCode, txtCountryShortForm, txtCountryFullName;

//Initialise the class
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
