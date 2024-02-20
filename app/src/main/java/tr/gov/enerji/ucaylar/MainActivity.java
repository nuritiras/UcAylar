package tr.gov.enerji.ucaylar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textSevap=findViewById(R.id.textSevap);
        Ramazan ibadet=new Ramazan();
        ibadet.namaz=40;
        ibadet.oruc=10;
        ibadet.kuran=600;
        ibadet.salavat=20;
        ibadet.zekat=100;
        ibadet.teheccud=5;
        textSevap.setText("Sevap:"+ibadet.ibadetHesapla());
    }
}