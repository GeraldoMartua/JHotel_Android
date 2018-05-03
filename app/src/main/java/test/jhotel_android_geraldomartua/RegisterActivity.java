package test.jhotel_android_geraldomartua;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText namaInput= (EditText) findViewById(R.id.inputNama);
        final EditText emailInput = (EditText) findViewById(R.id.inputEmail);
        final EditText passInput = (EditText) findViewById(R.id.inputPass);
        final Button registerButton = (Button) findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            final String nama = namaInput.getText().toString();
            final String email = emailInput.getText().toString();
            final String password = passInput.getText().toString();
            public void onClick(View V) {
                Response.Listener<String> responseListener = new Response.Listener<String> () {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            if (jsonResponse != null) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Success")
                                        .create()
                                        .show();
                            }
                    }
                    catch (JSONException e) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                        builder.setMessage("Registration Failed.")
                                .create()
                                .show();
                        }
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(nama,email,password,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this); queue.add(registerRequest);
            }
        });

    }
}
