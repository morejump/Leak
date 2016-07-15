package com.example.huynh.leak;

/**
 * Created by huynh on 16-Jul-16.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MyViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView nameTextView;
    private Button btnShow;
    private Button btnDel;

    public TextView getAgeTextView() {
        return ageTextView;
    }

    public void setAgeTextView(TextView ageTextView) {
        this.ageTextView = ageTextView;
    }

    public TextView getNameTextView() {
        return nameTextView;
    }

    public void setNameTextView(TextView nameTextView) {
        this.nameTextView = nameTextView;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Button getBtnShow() {
        return btnShow;
    }

    public Button getBtnDel() {
        return btnDel;
    }

    private TextView ageTextView;

    public MyViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image);
        nameTextView = (TextView) itemView.findViewById(R.id.name);
        btnShow = (Button) itemView.findViewById(R.id.show);
        btnDel = (Button) itemView.findViewById(R.id.del);

    }
}

