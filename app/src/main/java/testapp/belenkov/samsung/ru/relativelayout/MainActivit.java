package testapp.belenkov.samsung.ru.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class MainActivit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CD cd = new CD();
        try {
            cd.setArtist(getValue(getResources().getXml(R.xml.catalog1), "artist"));
            cd.setCountry(getValue(getResources().getXml(R.xml.catalog1), "country"));
            cd.setGenre(getValue(getResources().getXml(R.xml.catalog1), "genre"));
            cd.setPrice(getValue(getResources().getXml(R.xml.catalog1), "price"));

            Toast.makeText(this, cd.toString(), Toast.LENGTH_LONG).show();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getValue(XmlPullParser parser, String value) throws XmlPullParserException, IOException {
        while (parser.getEventType() != XmlPullParser.END_DOCUMENT){
            if(parser.getEventType() == XmlPullParser.START_TAG && parser.getName().equals(value)){
                return parser.nextText();
            }
            parser.next();
        }
        return null;
    }

}
