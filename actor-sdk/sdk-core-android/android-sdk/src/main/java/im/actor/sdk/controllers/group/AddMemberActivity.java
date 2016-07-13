package im.actor.sdk.controllers.group;

import android.os.Bundle;

import im.actor.sdk.R;
import im.actor.sdk.controllers.activity.BaseFragmentActivity;

public class AddMemberActivity extends BaseFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            showFragment(AddMemberFragment.create(getIntent().getIntExtra("GROUP_ID", 0)), false, false);
        }
    }
}
