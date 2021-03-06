package carte.blanche.com.countrycode;

import android.content.Context;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import android.util.Log;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by w7 on 6/18/2016.
 */
public class GetCountryDetails {
    Context context;
    Map<String, Integer> country;
    Map<String,String> countryFullname;

    public GetCountryDetails(Context context) {
        this.context = context;
    }

    public  boolean isSimInserted()
    {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);  //gets the current TelephonyManager
        return !(tm.getSimState() == TelephonyManager.SIM_STATE_ABSENT );

    }


    @Nullable
    public String getUserCountry() {
        try {
            final TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

            final String simCountry = tm.getSimCountryIso();
            if (simCountry != null && simCountry.length() == 2) { // SIM country code is available
                return simCountry.toLowerCase(Locale.US);
            } else if (tm.getPhoneType() != TelephonyManager.PHONE_TYPE_CDMA) { // device is not 3G (would be unreliable)
                String networkCountry = tm.getNetworkCountryIso();
                if (networkCountry != null && networkCountry.length() == 2) { // network country code is available
                    return networkCountry.toLowerCase(Locale.US);
                }
            }
        } catch (Exception e) {

        }
        return null;
    }

    public String getCountryFullname(String countryShortForm){
        countryFullname = new HashMap<>();

        countryFullname.put("AF", "Afghanistan");
        countryFullname.put("AL", "Albania");
        countryFullname.put("DZ", "Algeria");
        countryFullname.put("AS","American Samoa");
        countryFullname.put("AD", "Andorra");
        countryFullname.put("AO", "Angola");
        countryFullname.put("AI", "Anguilla");
        countryFullname.put("AQ", "Antarctica");
        countryFullname.put("AG", "Antigua and Barbuda");
        countryFullname.put("AR", "Argentina");
        countryFullname.put("AM", "Armenia");
        countryFullname.put("AW", "Aruba");
        countryFullname.put("AU", "Australia");
        countryFullname.put("AT", "Austria");
        countryFullname.put("AZ", "Azerbaijan");
        countryFullname.put("BS", "Bahamas");
        countryFullname.put("BH", "Bahrain");
        countryFullname.put("BD", "Bangladesh");
        countryFullname.put("BB", "Barbados");
        countryFullname.put("BY", "Belarus");
        countryFullname.put("BE", "Belgium");
        countryFullname.put("BM", "Bermuda");
        countryFullname.put("BZ", "Belize");
        countryFullname.put("BJ", "Benin");
        countryFullname.put("BT", "Bhutan");
        countryFullname.put("BO", "Bolivia");
        countryFullname.put("BQ", "Bonaire");
        countryFullname.put("BA", "Bosnia and Herzegovina");
        countryFullname.put("BW", "Botswana");
        countryFullname.put("BR", "Brazil");
        countryFullname.put("BN", "Brunei Darussalam");
        countryFullname.put("BV", "Bouvet Island");
        countryFullname.put("IO", "British Indian Ocean Territory");
        countryFullname.put("BG", "Bulgaria");
        countryFullname.put("BF", "Burkina Faso");
        countryFullname.put("MM", "Myanmar");
        countryFullname.put("BI", "Burundi");
        countryFullname.put("KH", "Cambodia");
        countryFullname.put("CM", "Cameroon");
        countryFullname.put("CA", "Canada");
        countryFullname.put("CV", "Cape Verde");
        countryFullname.put("KY", "Cayman Islands");
        countryFullname.put("CF", "Central African Republic");
        countryFullname.put("TD", "Chad");//
        countryFullname.put("CL", "Chile");
        countryFullname.put("CN", "China");
        countryFullname.put("CX", "Christmas Island");
        countryFullname.put("CC", "Cocos (Keeling) Islands");
        countryFullname.put("CO", "Colombia");
        countryFullname.put("KM", "Comoros");
        countryFullname.put("CG", "Congo");
        countryFullname.put("CD", "Democratic Republic of the Congo");
        countryFullname.put("CK", "Cook Islands");
        countryFullname.put("CR", "Costa Rica");
        countryFullname.put("CW", "CuraÃ§ao");
        countryFullname.put("HR", "Croatia");
        countryFullname.put("CU", "Cuba");
        countryFullname.put("CY", "Cyprus");
        countryFullname.put("CZ", "Czech Republic");
        countryFullname.put("DK", "Denmark");
        countryFullname.put("DJ", "Djibouti");
        countryFullname.put("DM", "Dominica");
        countryFullname.put("DO", "Dominican Republic");
        countryFullname.put("TL", "Timor-Leste");
        countryFullname.put("EC", "Ecuador");
        countryFullname.put("EG", "Egypt");
        countryFullname.put("SV", "El Salvador");
        countryFullname.put("GQ", "Equatorial Guinea");
        countryFullname.put("ER", "Eritrea");
        countryFullname.put("EE", "Estonia");
        countryFullname.put("ET", "Ethiopia");
        countryFullname.put("FK", "Falkland Islands (Malvinas)");
        countryFullname.put("FO", "Faroe Islands");
        countryFullname.put("FJ", "Fiji");
        countryFullname.put("FI", "Finland");
        countryFullname.put("FR", "France");
        countryFullname.put("PF", "French Polynesia");
        countryFullname.put("GA", "Gabon");
        countryFullname.put("GM", "Gambia");
        countryFullname.put("GE", "Georgia");
        countryFullname.put("DE", "Germany");
        countryFullname.put("GF", "French Guiana");
        countryFullname.put("TF", "French Southern Territories");
        countryFullname.put("GH", "Ghana");
        countryFullname.put("GU", "Guam");
        countryFullname.put("GG", "Guernsey");
        countryFullname.put("GI", "Gibraltar");
        countryFullname.put("GR", "Greece");
        countryFullname.put("GL", "Greenland");
        countryFullname.put("GP", "Guadeloupe");
        countryFullname.put("GT", "Guatemala");
        countryFullname.put("GN", "Guinea");
        countryFullname.put("GW", "Guinea-Bissau");
        countryFullname.put("GY", "Guyana");
        countryFullname.put("HT", "Haiti");
        countryFullname.put("HN", "Honduras");
        countryFullname.put("HK", "Hong Kong");
        countryFullname.put("HU", "Hungary");
        countryFullname.put("IS", "Iceland");
        countryFullname.put("IN", "India");
        countryFullname.put("ID", "Indonesia");
        countryFullname.put("IR", "Iran, Islamic Republic of");
        countryFullname.put("IQ", "Iraq");
        countryFullname.put("IE", "Ireland");
        countryFullname.put("IM", "Isle of Man");
        countryFullname.put("IL", "Israel");
        countryFullname.put("IT", "Italy");
        countryFullname.put("CI", "CÃ´te d'Ivoire");
        countryFullname.put("JM", "Jamaica");
        countryFullname.put("JP", "Japan");
        countryFullname.put("JE", "Jersey");
        countryFullname.put("JO", "Jordan");
        countryFullname.put("KZ", "Kazakhstan");
        countryFullname.put("KE", "Kenya");
        countryFullname.put("KI", "Kiribati");
        countryFullname.put("KW", "Kuwait");
        countryFullname.put("KG", "Kyrgyzstan");
        countryFullname.put("LA", "Lao People's Democratic Republic");
        countryFullname.put("LV", "Latvia");
        countryFullname.put("LB", "Lebanon");
        countryFullname.put("LS", "Lesotho");
        countryFullname.put("LR", "Liberia");
        countryFullname.put("LY", "Libya");
        countryFullname.put("LI", "Liechtenstein");
        countryFullname.put("LT", "Lithuania");
        countryFullname.put("LU", "Luxembourg");
        countryFullname.put("MO", "Macao");
        countryFullname.put("MK", "Macedonia, the Former Yugoslav Republic of");
        countryFullname.put("MG", "Madagascar");
        countryFullname.put("MW", "Malawi");
        countryFullname.put("MY", "Malaysia");
        countryFullname.put("MV", "Maldives");
        countryFullname.put("ML", "Mali");
        countryFullname.put("MT", "Malta");
        countryFullname.put("MH", "Marshall Islands");
        countryFullname.put("MR", "Mauritania");
        countryFullname.put("MU", "Mauritius");
        countryFullname.put("YT", "Mayotte");
        countryFullname.put("MX", "Mexico");
        countryFullname.put("FM", "Micronesia, Federated States of");
        countryFullname.put("MD", "Moldova, Republic of");
        countryFullname.put("MQ", "Martinique");
        countryFullname.put("MC", "Monaco");
        countryFullname.put("MN", "Mongolia");
        countryFullname.put("ME", "Montenegro");
        countryFullname.put("MS", "Montserrat");
        countryFullname.put("MA", "Morocco");
        countryFullname.put("MZ", "Mozambique");
        countryFullname.put("NA", "Namibia");
        countryFullname.put("NR", "Nauru");
        countryFullname.put("NP", "Nepal");
        countryFullname.put("NL", "Netherlands");
        countryFullname.put("AN", "Netherlands Antilles");
        countryFullname.put("NC", "New Caledonia");
        countryFullname.put("NZ", "New Zealand");
        countryFullname.put("NI", "Nicaragua");
        countryFullname.put("NE", "Niger");
        countryFullname.put("NG", "Nigeria");
        countryFullname.put("NU", "Niue");
        countryFullname.put("NF", "Norfolk Island");
        countryFullname.put("KP", "Korea, Democratic People's Republic of");
        countryFullname.put("NO", "Norway");
        countryFullname.put("OM", "Oman");
        countryFullname.put("PK", "Pakistan");
        countryFullname.put("PW", "Palau");
        countryFullname.put("PS", "Palestine, State of");
        countryFullname.put("PA", "Panama");
        countryFullname.put("PG", "Papua New Guinea");
        countryFullname.put("PY", "Paraguay");
        countryFullname.put("PE", "Peru");
        countryFullname.put("PH", "Philippines");
        countryFullname.put("PN", "Pitcairn");
        countryFullname.put("PL", "Poland");
        countryFullname.put("PT", "Portugal");
        countryFullname.put("PR", "Puerto Rico");
        countryFullname.put("QA", "Qatar");
        countryFullname.put("RO", "Romania");
        countryFullname.put("RU", "Russian Federation");
        countryFullname.put("RW", "Rwanda");
        countryFullname.put("RE", "Reunion");
        countryFullname.put("BL", "Saint Barthelemy");
        countryFullname.put("WS", "Samoa");
        countryFullname.put("KN", "Saint Kitts and Nevis");
        countryFullname.put("SM", "San Marino");
        countryFullname.put("ST", "Sao Tome and Principe");
        countryFullname.put("SA", "Saudi Arabia");
        countryFullname.put("SN", "Senegal");
        countryFullname.put("RS", "Serbia");
        countryFullname.put("SC", "Seychelles");
        countryFullname.put("SL", "Sierra Leone");
        countryFullname.put("SG", "Singapore");
        countryFullname.put("SK", "Slovakia");
        countryFullname.put("SI", "Slovenia");
        countryFullname.put("SB", "Solomon Islands");
        countryFullname.put("SO", "Somalia");
        countryFullname.put("ZA", "South Africa");
        countryFullname.put("KR", "Korea, Republic of");
        countryFullname.put("ES", "Spain");
        countryFullname.put("LK", "Sri Lanka");
        countryFullname.put("SH", "Saint Helena");
        countryFullname.put("PM", "Saint Pierre and Miquelon");
        countryFullname.put("SD", "Sudan");
        countryFullname.put("SR", "Suriname");
        countryFullname.put("SZ", "Swaziland");
        countryFullname.put("SE", "Sweden");
        countryFullname.put("CH", "Switzerland");
        countryFullname.put("SY", "Syrian Arab Republic");
        countryFullname.put("TW", "Taiwan, Province of China");
        countryFullname.put("TJ", "Tajikistan");
        countryFullname.put("TZ", "United Republic of Tanzania");
        countryFullname.put("TH", "Thailand");
        countryFullname.put("TG", "Togo");
        countryFullname.put("TK", "Tokelau");
        countryFullname.put("TO", "Tonga");
        countryFullname.put("TN", "Tunisia");
        countryFullname.put("TR", "Turkey");
        countryFullname.put("TM", "Turkmenistan");
        countryFullname.put("TV", "Tuvalu");
        countryFullname.put("AE", "United Arab Emirates");
        countryFullname.put("UG", "Uganda");
        countryFullname.put("GB", "United Kingdom");
        countryFullname.put("UA", "Ukraine");
        countryFullname.put("UY", "Uruguay");
        countryFullname.put("US", "United States");
        countryFullname.put("UZ", "Uzbekistan");
        countryFullname.put("VU", "Vanuatu");
        countryFullname.put("VA", "Holy see");
        countryFullname.put("VE", "Venezuela");
        countryFullname.put("VN", "Viet Nam");
        countryFullname.put("WF", "Wallis and Futuna");
        countryFullname.put("YE", "Yemen");
        countryFullname.put("ZM", "Zambia");
        countryFullname.put("ZW", "Zimbabwe");
        countryFullname.put("MF", "Saint Martin(French part");
        countryFullname.put("LC", "Saint Lucia");
        countryFullname.put("VC", "Saint Vincent and the Grenadines");
        countryFullname.put("SX", "Sint Maarten(Dutch part");
        countryFullname.put("GS", "South Georgia and the south Sandwich Islands ");
        countryFullname.put("SS", "South Sudan");
        countryFullname.put("SJ", "Svalbard and Jan Mayen");
        countryFullname.put("TT", "Trinidad and tobago");
        countryFullname.put("TC", "Turks and Caicos Islands");
        countryFullname.put("UM", "United States Minor Outlying Islands");
        countryFullname.put("VG", "British Virgin Islands");
        countryFullname.put("VI", "US Virgin Islands");
        countryFullname.put("EH", "Western Sahara");
        countryFullname.put("AX", "Aland Islands");

        String CountryName = countryFullname.get(countryShortForm.toUpperCase());
        Log.w("Country name",CountryName);
        return CountryName;
    }
    public int getCountryCode(String countryname) {
        country = new HashMap<>();
        country.put("AF", 93);
        country.put("AL", 355);
        country.put("DZ", 213);
        country.put("AD", 376);
        country.put("AS",1-684);
        country.put("AO", 244);
        country.put("AI",1-264);
        country.put("AQ", 672);
        country.put("AG",1-268);
        country.put("AR", 54);
        country.put("AM", 374);
        country.put("AW", 297);
        country.put("AU", 61);
        country.put("AT", 43);
        country.put("AZ", 994);
        country.put("BS",1-242);
        country.put("BH", 973);
        country.put("BD", 880);
        country.put("BB",1-246);
        country.put("BY", 375);
        country.put("BE", 32);
        country.put("BZ", 501);
        country.put("BJ", 229);
        country.put("BM",1-441);
        country.put("BT", 975);
        country.put("BO", 591);
        country.put("BA", 387);
        country.put("BQ",599);
        country.put("BW", 267);
        country.put("BV",47);
        country.put("BR", 55);
        country.put("IO",246);
        country.put("BN", 673);
        country.put("BG", 359);
        country.put("BF", 226);
        country.put("MM", 95);
        country.put("BI", 257);
        country.put("KH", 855);
        country.put("CM", 237);
        country.put("CA", 1);
        country.put("CV", 238);
        country.put("KY",1-345);
        country.put("CF", 236);
        country.put("TD", 235);//
        country.put("CL", 56);
        country.put("CN", 86);
        country.put("CX", 61);
        country.put("CC", 61);
        country.put("CO", 57);
        country.put("KM", 269);
        country.put("CG", 242);
        country.put("CD", 243);
        country.put("CK", 682);
        country.put("CR", 506);
        country.put("CW",599);
        country.put("HR", 385);
        country.put("CU", 53);
        country.put("CY", 357);
        country.put("CZ", 420);
        country.put("DK", 45);
        country.put("DJ", 253);
        country.put("TL", 670);
        country.put("EC", 593);
        country.put("EG", 20);
        country.put("SV", 503);
        country.put("GQ", 240);
        country.put("ER", 291);
        country.put("EE", 372);
        country.put("ET", 251);
        country.put("FK", 500);
        country.put("FO", 298);
        country.put("FJ", 679);
        country.put("FI", 358);
        country.put("FR", 33);
        country.put("PF", 689);
        country.put("GF",594);
        country.put("GA", 241);
        country.put("GM", 220);
        country.put("GE", 995);
        country.put("DE", 49);
        country.put("DM",1-767);
        country.put("DO",1-809);
        country.put("GH", 233);
        country.put("GI", 350);
        country.put("GR", 30);
        country.put("GL", 299);
        country.put("GT", 502);
        country.put("GD",1-473);
        country.put("GP",590);
        country.put("GG",44);
        country.put("GU",1-671);
        country.put("TF",262);
        country.put("GN", 224);
        country.put("GW", 245);
        country.put("GY", 592);
        country.put("HT", 509);
        country.put("HN", 509);
        country.put("HK", 852);
        country.put("HU", 36);
        country.put("IN", 91);
        country.put("ID", 62);
        country.put("IR", 98);
        country.put("IS",354);
        country.put("IQ", 964);
        country.put("IE", 353);
        country.put("IM", 44);
        country.put("IL", 972);
        country.put("IT", 39);
        country.put("JM",1-876);
        country.put("CI", 225);
        country.put("JP", 81);
        country.put("JE",44);
        country.put("JO", 962);
        country.put("KZ", 7);
        country.put("KE", 254);
        country.put("KI", 686);
        country.put("KW", 965);
        country.put("KG", 996);
        country.put("LA", 856);
        country.put("LV", 371);
        country.put("LB", 961);
        country.put("LS", 266);
        country.put("LR", 231);
        country.put("LY", 218);
        country.put("LI", 423);
        country.put("LT", 370);
        country.put("LU", 352);
        country.put("MO", 853);
        country.put("MK", 389);
        country.put("MG", 261);
        country.put("MW", 265);
        country.put("MY", 60);
        country.put("MV", 960);
        country.put("ML", 223);
        country.put("MT", 356);
        country.put("MH", 692);
        country.put("MQ",596);
        country.put("MS",1-664);
        country.put("MR", 222);
        country.put("MU", 230);
        country.put("YT", 262);
        country.put("MX", 52);
        country.put("FM", 691);
        country.put("MD", 373);
        country.put("MC", 377);
        country.put("MN", 976);
        country.put("ME", 382);
        country.put("MA", 212);
        country.put("MZ", 258);
        country.put("NA", 264);
        country.put("NR", 674);
        country.put("NP", 977);
        country.put("NL", 31);
        country.put("AN", 599);
        country.put("NC", 687);
        country.put("NZ", 64);
        country.put("NI", 505);
        country.put("NE", 227);
        country.put("NG", 234);
        country.put("NU", 683);
        country.put("NF",672);
        country.put("KP", 850);
        country.put("MP",670);
        country.put("NO", 47);
        country.put("OM", 968);
        country.put("PK", 92);
        country.put("PW", 680);
        country.put("PS",970);
        country.put("PA", 507);
        country.put("PG", 675);
        country.put("PY", 595);
        country.put("PE", 51);
        country.put("PH", 63);
        country.put("PN", 870);
        country.put("PL", 48);
        country.put("PT", 351);
        country.put("PR", 1);
        country.put("QA", 974);
        country.put("KN",1-869);
        country.put("LC",1-758);
        country.put("RO", 40);
        country.put("MF",590);
        country.put("RU", 7);
        country.put("RW", 250);
        country.put("RE",262);
        country.put("BL", 590);
        country.put("WS", 685);
        country.put("SM", 378);
        country.put("ST", 239);
        country.put("SA", 966);
        country.put("SN", 221);
        country.put("RS", 381);
        country.put("SC", 248);
        country.put("SL", 232);
        country.put("SG", 65);
        country.put("SK", 421);
        country.put("SI", 386);
        country.put("SB", 677);
        country.put("SO", 252);
        country.put("ZA", 27);
        country.put("KR", 82);
        country.put("ES", 34);
        country.put("LK", 94);
        country.put("SH", 290);
        country.put("PM", 508);
        country.put("SD", 249);
        country.put("SX",1-721);
        country.put("SR", 597);
        country.put("SJ",47);
        country.put("SZ", 268);
        country.put("SE", 46);
        country.put("CH", 41);
        country.put("SY", 963);
        country.put("TW", 886);
        country.put("TJ", 992);
        country.put("TZ", 255);
        country.put("TH", 66);
        country.put("TG", 228);
        country.put("TT",1-868);
        country.put("GS",500);
        country.put("TK", 690);
        country.put("TO", 676);
        country.put("TN", 216);
        country.put("TR", 90);
        country.put("TC",1-649);
        country.put("TM", 993);
        country.put("TV", 688);
        country.put("VC",1-784);
        country.put("AE", 971);
        country.put("UG", 256);
        country.put("GB", 44);
        country.put("UA", 380);
        country.put("SS",211);
        country.put("UY", 598);
        country.put("US", 1);
        country.put("UM",1);
        country.put("UZ", 998);
        country.put("VU", 678);
        country.put("VG",1-284);
        country.put("VA", 379);
        country.put("VE", 58);
        country.put("VN", 84);
        country.put("VI",1-340);
        country.put("WF", 681);
        country.put("EH",212);
        country.put("YE", 967);
        country.put("ZM", 260);
        country.put("ZW", 263);
        country.put("AX",358);
        int countryCode = country.get(countryname.toUpperCase());
        Log.w("Country code",countryCode+"");
        return countryCode;
    }


}
