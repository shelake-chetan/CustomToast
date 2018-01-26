package com.customtoast.chen.customtoast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.chen.customtoast.R;

/**
 * Created by chetan on 18-12-2017.
 */
public class CustomToast {
    private Context context;
    private int backColor;
    private int textColor;

    public CustomToast(Context context) {
        this.backColor = context.getResources().getColor(R.color.colorAccent);
        this.textColor = context.getResources().getColor(R.color.white);
        this.context = context;
    }

    public void setBackground(int backColor)
    {
        this.backColor = backColor;
    }
    public void setTextColor(int textColor)
    {
        this.textColor = textColor;
    }
    public void showErrorToast(String text) {

        if (context != null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            LinearLayout linearLayout = (LinearLayout)toastRoot.findViewById(R.id.whole_layout);
            linearLayout.setBackgroundColor(backColor);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.toast_Tv);
            toastText.setText(text);
            toastText.setTextColor(textColor);
            ImageView toastImage =(ImageView) toastRoot.findViewById(R.id.toast_Iv);
            toastImage.setImageResource(R.drawable.icn_error);
            TextView toastSuccessTv = (TextView) toastRoot.findViewById(R.id.toast_successTv);
            toastSuccessTv.setText("Error");
            toastSuccessTv.setTextColor(textColor);
            Toast toast = new Toast(context);
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
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            LinearLayout linearLayout = (LinearLayout)toastRoot.findViewById(R.id.whole_layout);
            linearLayout.setBackgroundColor(backColor);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.toast_Tv);
            toastText.setText(text);
            toastText.setTextColor(textColor);
            ImageView toastImage = (ImageView) toastRoot.findViewById(R.id.toast_Iv);
            toastImage.setImageResource(R.drawable.icn_success);
            TextView toastSuccessTv = (TextView) toastRoot.findViewById(R.id.toast_successTv);
            toastSuccessTv.setText("Success");
            toastSuccessTv.setTextColor(textColor);
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
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            LinearLayout linearLayout = (LinearLayout)toastRoot.findViewById(R.id.whole_layout);
            linearLayout.setBackgroundColor(backColor);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.toast_Tv);
            toastText.setText("No network available");
            toastText.setTextColor(textColor);
            ImageView toastImage = (ImageView) toastRoot.findViewById(R.id.toast_Iv);
            toastImage.setImageResource(R.drawable.icn_error);
            TextView toastSuccessTv = (TextView) toastRoot.findViewById(R.id.toast_successTv);
            toastSuccessTv.setText("Error");
            toastSuccessTv.setTextColor(textColor);
            Toast toast = new Toast(context);
            toast.setView(toastRoot);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL| Gravity.FILL_HORIZONTAL,
                    0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }

    }




}
