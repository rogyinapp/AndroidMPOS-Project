package androidmpos.inapp.com.androidmpos;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

    private EditText  et_username=null;
    private EditText et_password=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_username = (EditText)findViewById(R.id.username);
        et_password = (EditText)findViewById(R.id.password);
    }

    public void login(View view) {

    }


}
