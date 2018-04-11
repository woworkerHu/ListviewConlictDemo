package piaoyouji.com.listviewconlictdemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by K4170 on 2018-04-11.
 */

public class MyAdatper extends BaseAdapter {
    String[] strings;
    int[] ints;

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Button button = null;
        ImageView imageView = null;
        TextView textView = null;
        int itemViewType = getItemViewType(position);
        if (convertView == null) {
            if (itemViewType == 0) {
                convertView = View.inflate(parent.getContext(), R.layout.list_item1, null);
                button = convertView.findViewById(R.id.button);
                imageView = convertView.findViewById(R.id.image_view);
                viewholder viewholder = new viewholder();
                viewholder.setButton(button);
                viewholder.setImageView(imageView);
                convertView.setTag(viewholder);
            } else {
                convertView = View.inflate(parent.getContext(), R.layout.list_item2, null);
                textView = convertView.findViewById(R.id.text);
                imageView = convertView.findViewById(R.id.image_view);
                viewholder viewholder = new viewholder();
                viewholder.setTextView(textView);
                viewholder.setImageView(imageView);
                convertView.setTag(viewholder);
            }
        }
        viewholder viewholder = (viewholder) convertView.getTag();
        imageView = viewholder.imageView;
        Random random = new Random();
        ColorDrawable colorDrawable = new ColorDrawable(Color.argb(255, ints[random.nextInt(ints.length - 1)], ints[random.nextInt(ints.length - 1)], ints[random.nextInt(ints.length - 1)]));
        imageView.setImageDrawable(colorDrawable);

        if (position % 2 == 1) {
            if (textView != null) {
                textView.setText(strings[position]);
            }
        }
        return convertView;
    }


    class viewholder {
        TextView textView;
        ImageView imageView;
        Button button;

        public void setTextView(TextView textView) {
            this.textView = textView;
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return imageView;
        }

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public Button getButton() {
            return button;
        }

        public void setButton(Button button) {
            this.button = button;
        }
    }
}
