package zmtec.userinfo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Description:
 * Copyright  : Copyright (c) 2015
 * Company    : 元征科技
 * Author     : peakfa@163.com
 * Date       : 2017/3/22 22:48
 */

public class UserInfoAdapter extends BaseAdapter {
    List<UserInfo> mUserInfos;
    Context context;
    int currentPostion;
    View view;
    private ViewHodler viewHodler;

    public UserInfoAdapter(Context context, List<UserInfo> userInfos) {
        this.context = context;
        this.mUserInfos = userInfos;
    }

    @Override
    public int getCount() {
        return mUserInfos.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        currentPostion = mUserInfos.get(position);
        if (convertView == null) {
            view = View.inflate(context, R.layout.item_userinfo, null);
            viewHodler = new ViewHodler();
            viewHodler.userName = (TextView) view.findViewById(R.id.tv_username);
            viewHodler.date = (TextView) view.findViewById(R.id.tv_date);
            viewHodler.userInfo = (TextView) view.findViewById(R.id.tv_userinfo);
            view.setTag(viewHodler);
        } else {
            view = convertView;
            view.getTag();
        }
        int idInfo = mUserInfos.get(position).getIdInfo();
        if (idInfo == 0) {
            viewHodler.userInfo.setText("会员");
        } else {
            viewHodler.userInfo.setText("非会员");
        }
        viewHodler.userName.setText(mUserInfos.get(position).getName());
        viewHodler.date.setText(mUserInfos.get(position).getDate());
        return view;
    }

    class ViewHodler {
        TextView userName, userInfo, date;
    }
}
