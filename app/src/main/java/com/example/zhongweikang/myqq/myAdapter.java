package com.example.zhongweikang.myqq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zhongweikang on 2017/1/18.
 */

public class myAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> list;
    public myAdapter(Context context,ArrayList<String > list){
        this.context=context;
        this.list=list;
    }
    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView= LayoutInflater.from(context).inflate(R.layout.item,null);
            viewHolder=new ViewHolder();
            viewHolder.itemText= (TextView) convertView.findViewById(R.id.item_textview);
            convertView.setTag(viewHolder);
        }
        viewHolder= (ViewHolder) convertView.getTag();
        viewHolder.itemText.setText(list.get(position));
        return convertView;
    }
    public static  class ViewHolder{
        TextView itemText;
    }
}
