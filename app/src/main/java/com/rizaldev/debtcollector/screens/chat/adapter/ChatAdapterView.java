package com.rizaldev.debtcollector.screens.chat.adapter;

import android.content.Context;
import android.widget.LinearLayout;

import com.rizaldev.debtcollector.R;
import com.rizaldev.debtcollector.screens.chat.core.ChatModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.nlopez.smartadapters.views.BindableLinearLayout;
import io.nlopez.smartadapters.views.BindableRelativeLayout;

/**
 * Created by devel on 18/11/2017.
 */

public class ChatAdapterView extends BindableRelativeLayout<ChatModel> {
    public ChatAdapterView(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.view_chat;
    }

    @BindView(R.id.layoutUser)
    LinearLayout chatUser;
    @BindView(R.id.layoutOther)
    LinearLayout chatOther;

    @Override
    public void bind(ChatModel chatModel) {
        ButterKnife.bind(this);
        chatUser.setVisibility(chatModel.isUser() ? VISIBLE : GONE);
        chatOther.setVisibility(!chatModel.isUser() ? VISIBLE : GONE);
    }
}
