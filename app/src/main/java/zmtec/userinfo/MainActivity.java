package zmtec.userinfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    List<UserInfo> mUserInfos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
        UserInfoAdapter userInfoAdapter = new UserInfoAdapter(this, mUserInfos);
        ListView userList = (ListView) findViewById(R.id.lv_userinfo);
        userList.setAdapter(userInfoAdapter);

    }

    private void initDate() {
        for (int i = 0; i <2; i++) {
            UserInfo list1=new UserInfo("zhangsan","1992-03-12",0);
            UserInfo list2=new UserInfo("wangwu","1982-03-12",1);
            UserInfo list3=new UserInfo("lisi","1990-03-12",0);
            mUserInfos.add(list1);
            mUserInfos.add(list2);
            mUserInfos.add(list3);
        }
    }
}
