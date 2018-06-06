package bo.com.innovasoft.maskotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        siguiente=(Button)findViewById(R.id.btncrearcuenta);
        siguiente.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                //CODIGO PARA QUE PASE A LA SIGUIENTE PANTALLA Y ASI MISMO NO PUEDA RETORNAR
                Intent siguiente=new Intent(Login.this, Crear_Cuenta.class);
                startActivity(siguiente);
                finish();
            }
        });

    }
}