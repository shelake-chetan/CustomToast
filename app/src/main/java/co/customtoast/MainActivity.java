package co.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.customtoast.R;
import com.customtoast.chen.customtoast.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomToast customToast = new CustomToast(this);
        customToast.showErrorToast("Error occured");
    }
}
