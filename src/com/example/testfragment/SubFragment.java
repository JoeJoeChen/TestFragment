package com.example.testfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SubFragment extends Fragment
{

    private String text;
    private TextView tv = null;

    public SubFragment(String text)
    {
        super();
        this.text = text;
    }

    /**
     * ���Ǵ˺�������ͨ��inflater inflate�����õ�view��󷵻�
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.page_content, container, false);
        tv = (TextView) v.findViewById(R.id.page_content_tv);
        tv.setText(text);
        return v;
    }
}