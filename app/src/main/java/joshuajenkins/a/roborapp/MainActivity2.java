package joshuajenkins.a.roborapp;

/**
 * Created by hersh on 4/22/2016.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity2 extends Activity {

    private CheckBox chkIos;
    private CheckBox chkAndroid;
    private CheckBox chkWindows;
    private Button btnDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void addListenerOnChkIos() {

        chkIos = (CheckBox) findViewById(R.id.chkIos);

        chkIos.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity2.this,
                            "Bro, try Android :)", Toast.LENGTH_LONG).show();
                }

            }
        });
    }}
