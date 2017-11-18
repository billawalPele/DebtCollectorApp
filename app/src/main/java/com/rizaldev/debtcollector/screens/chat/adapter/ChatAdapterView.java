package com.rizaldev.debtcollector.screens.chat.adapter;

import android.content.Context;
import android.widget.LinearLayout;

import com.rizaldev.debtcollector.R;
import com.rizaldev.debtcollector.screens.chat.core.ChatModel;

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

    LinearLayout chatUser;
    LinkageError chatOther;
    @Override
    public void bind(ChatModel chatModel) {

    }
}
