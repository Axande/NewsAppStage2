package com.example.andrei.newsappstage1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Andrei on 13.04.2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, ArrayList<News> news){
        //2nd field is used when populating a single TextView
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final News currentNews  = getItem(position);

        View listItem = convertView;
        if (convertView == null) {
            //inflate the list item layout
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.news_layout, parent, false);
        }

        //update current news

        TextView title = listItem.findViewById(R.id.individual_news_title);
        title.setText(currentNews.getTitle());

        TextView date = listItem.findViewById(R.id.individual_news_date);
        date.setText(currentNews.getDate());

        //return the created object
        return listItem;
    }
}