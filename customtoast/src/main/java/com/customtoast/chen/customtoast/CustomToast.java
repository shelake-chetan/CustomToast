package com.customtoast.chen.customtoast;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.chen.customtoast.R;

/**
 * Created by chetan on 18-12-2017.
 */
public class CustomToast {
    Context context;

    public CustomToast(Context context) {
        this.context = context;
    }

    public void showErrorToast(String text) {

        if (context != null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();

            // Call toast.xml file for toast layout
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.toast_Tv);
            toastText.setText(text);
            ImageView toastImage =(ImageView) toastRoot.findViewById(R.id.toast_Iv);
            toastImage.setImageResource(R.drawable.icn_error);
            TextView toastSuccessTv = (TextView) toastRoot.findViewById(R.id.toast_successTv);
            toastSuccessTv.setText("Error");
            Toast toast = new Toast(context);

            // Set layout to toast
            toast.setView(toastRoot);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL| Gravity.FILL_HORIZONTAL,
                    0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void showSuccessToast(String text) {

        if (context != null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();

            // Call toast.xml file for toast layout
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.toast_Tv);
            toastText.setText(text);
            ImageView toastImage = (ImageView) toastRoot.findViewById(R.id.toast_Iv);
            toastImage.setImageResource(R.drawable.icn_success);
            TextView toastSuccessTv = (TextView) toastRoot.findViewById(R.id.toast_successTv);
            toastSuccessTv.setText("Success");
            Toast toast = new Toast(context);
            toast.setView(toastRoot);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL | Gravity.FILL_HORIZONTAL,
                    0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void showNetworkToast() {


        if (context != null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();

            // Call toast.xml file for toast layout
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.toast_Tv);
            toastText.setText("No network available");
            ImageView toastImage = (ImageView) toastRoot.findViewById(R.id.toast_Iv);
            toastImage.setImageResource(R.drawable.icn_error);
            TextView toastSuccessTv = (TextView) toastRoot.findViewById(R.id.toast_successTv);
            toastSuccessTv.setText("Error");
            Toast toast = new Toast(context);

            // Set layout to toast
            toast.setView(toastRoot);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL| Gravity.FILL_HORIZONTAL,
                    0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }

    }




}
