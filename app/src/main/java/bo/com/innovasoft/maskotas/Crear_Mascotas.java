package bo.com.innovasoft.maskotas;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Dialog;

import android.widget.DatePicker;

import java.util.Calendar;

public class Crear_Mascotas extends AppCompatActivity {

    EditText t1;
    private int mYearIni, mMonthIni, mDayIni, sYearIni,sMonthIni,sDayIni;
    static final int DATE_ID=0;
    Calendar C = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear__mascotas);

        sMonthIni = C.get(Calendar.MONTH);
        sDayIni = C.get(Calendar.DAY_OF_MONTH);
        sYearIni=C.get(Calendar.YEAR);
        t1=(EditText)findViewById(R.id.txtfechanacimiento);
        t1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                showDialog(DATE_ID);
            }
        });
    }

    private void colocar_fecha(){
        t1.setText((mDayIni+1)+"-"+ mMonthIni + "-" + mYearIni + "");
    }
    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;
                    colocar_fecha();

                }
    };
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_ID:
                return new DatePickerDialog(this, mDateSetListener, sYearIni, sMonthIni, sDayIni);


        }


        return null;
    }

}
