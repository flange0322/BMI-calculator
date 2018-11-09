package example.tw.bmisimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText length_Edittext;
    EditText weight_Edittext;
    Button cal_button;
    TextView output_Textview;
    TextView output_range_Textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void calClick(View view){
        String length = length_Edittext.getText().toString();
        String weight = weight_Edittext.getText().toString();
        BMI_Data BMIC = new BMI_Cal();
        try {
            BMIC.setMember(length,weight);
            rangeJudge rj = new rangeJudge();
            rj.setBMI(BMIC.getBMI());
            output_Textview.setText(Double.toString(BMIC.getBMI()));
            output_range_Textview.setText(rj.getString());
        }
        catch(NullException e){
            output_Textview.setText(e.getMessage());
            output_range_Textview.setText("");
        }
        catch (Length_NO_ZERO e) {
            output_Textview.setText(e.getMessage());
            output_range_Textview.setText("");
        }
    }

    void init(){
        length_Edittext = (EditText) findViewById(R.id.Length_Edittext);
        weight_Edittext = (EditText)findViewById(R.id.Weight_Edittext);
        cal_button = (Button) findViewById(R.id.button_Cal);
        output_Textview = (TextView) findViewById(R.id.Output_Textview);
        output_range_Textview = (TextView) findViewById(R.id.range_Textview);
    }

    public void NextPage(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
