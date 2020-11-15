package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColorId;

    public WordAdapter(Context context, ArrayList<Word> wordArrayList, int backgroundColorId) {
        super(context, 0, wordArrayList);
        mBackgroundColorId = backgroundColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        final Word currentWordObject = getItem(position);

        // Find the ImageView in the list_item_layout.xml layout with the ID image_view
        ImageView image_view = (ImageView) listItemView.findViewById(R.id.image_view);

        if (currentWordObject.hasImageResource()) {
            // Set the ImageView to the image resource id specified in the current word
            image_view.setImageResource(currentWordObject.getImageResourceId());

            //Make sure that the view is visible
            image_view.setVisibility(View.VISIBLE);
        } else {
            image_view.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item_layout.xml layout with the ID miwok_text_view
        TextView miwok_text_view = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the current Word object and
        // set this text on the miwok_text_view
        miwok_text_view.setText(currentWordObject.getMiwokTranslation());

        // Find the TextView in the list_item_layout.xml layout with the ID default_text_view
        TextView default_text_view = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the current Word object and
        // set this text on the miwok_text_view
        default_text_view.setText(currentWordObject.getDefaultTranslation());

        int color = ContextCompat.getColor(getContext(), mBackgroundColorId);
        listItemView.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
