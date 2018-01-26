package co.customtoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.customtoast.R;
import com.customtoast.chen.customtoast.CustomToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Context context = MainActivity.this;
    Button mNetworkToast,mSuccessToast,mErrorToast;

    private CustomToast customToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customToast = new CustomToast(this); //pass context as parameter
        customToast.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));
        customToast.setBackground(context.getResources().getColor(R.color.white));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.errorToast:
                customToast.showErrorToast("Some error occurred, please try again");
                break;
            case R.id.networkToast:
                customToast.showNetworkToast();
                break;
            case R.id.succToast:
                customToast.showSuccessToast("Registered successfully");
                break;
        }
    }
}
