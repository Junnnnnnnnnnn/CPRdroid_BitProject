package com.itdot.a.cprdroid;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AgeListAdapter extends BaseAdapter {


    Context context;
    ArrayList<AgeList> AgeArrayList = new ArrayList<AgeList>();

    public AgeListAdapter(){
    }

    @Override
    public int getCount() {
        return this.AgeArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.AgeArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.cpr_agelist,parent,false);
        }

        TextView TargetScreen = (TextView) convertView.findViewById(R.id.TargetScreen);
        TextView AgeScreen = (TextView) convertView.findViewById(R.id.AgeScreen);
        ImageView TargetIcon = (ImageView) convertView.findViewById(R.id.TargetIcon);

        AgeList AgeListItem = AgeArrayList.get(position);

        TargetScreen.setText(AgeListItem.getTargetScreen());
        AgeScreen.setText(AgeListItem.getAgeScreen());
        TargetIcon.setImageDrawable(AgeListItem.getTargetIcon());

        return convertView;
    }

    public void add(String target, String age, Drawable targeticon){
        AgeList info = new AgeList(target,age,targeticon);
        AgeArrayList.add(info);
    }

}
