package com.marathipetara.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.marathipetara.app.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class GridCategoryAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    Context context;
    List<DemoCategory> demoCategories;
    //internal democategory

    //constructor
    public GridCategoryAdapter(Context context) {
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        demoCategories = new ArrayList<>();

        demoCategories.add(new DemoCategory(R.drawable.img1,"Basics"));
        demoCategories.add(new DemoCategory(R.drawable.img2,"Basics2"));
        demoCategories.add(new DemoCategory(R.drawable.img3,"Basics3"));
        demoCategories.add(new DemoCategory(R.drawable.img4,"Basics4"));
        demoCategories.add(new DemoCategory(R.drawable.img1,"Basics5"));
        demoCategories.add(new DemoCategory(R.drawable.img1,"Basics6"));
    }

    @Override
    public int getCount() {
        return demoCategories.size();
    }

    @Override
    public Object getItem(int position) {
        return demoCategories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null)
        {
            convertView = layoutInflater.inflate(R.layout.item_category_layout,null);
            holder = new ViewHolder();
            holder.circleImageView = convertView.findViewById(R.id.category_image);
            holder.textView = convertView.findViewById(R.id.text_category);
            convertView.setTag(holder);
        }else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    //viewholder
    static class ViewHolder{
        CircleImageView circleImageView;
        TextView textView;
    }
    class DemoCategory{
        int ImageId;
        String imageName;

        public DemoCategory(int imageId, String imageName) {
            ImageId = imageId;
            this.imageName = imageName;
        }
    }


}
