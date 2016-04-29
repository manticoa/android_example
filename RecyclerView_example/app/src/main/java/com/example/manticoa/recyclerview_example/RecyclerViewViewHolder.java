package com.example.manticoa.recyclerview_example;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by manticoa on 16. 3. 14..
 */
public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
    ImageView exampleImage;
    TextView exampleText;

    public RecyclerViewViewHolder(View itemView) {
        super(itemView);
        exampleImage = (ImageView)itemView.findViewById(R.id.cardview_image);
        exampleText = (TextView)itemView.findViewById(R.id.cardview_text);
    }
}
