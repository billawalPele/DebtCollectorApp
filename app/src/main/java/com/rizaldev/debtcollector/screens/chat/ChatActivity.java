package com.rizaldev.debtcollector.screens.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rizaldev.debtcollector.R;
import com.rizaldev.debtcollector.screens.chat.adapter.ChatAdapterView;
import com.rizaldev.debtcollector.screens.chat.core.ChatModel;
import com.rizaldev.debtcollector.screens.chat.core.ChatView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.nlopez.smartadapters.SmartAdapter;

public class ChatActivity extends AppCompatActivity {
@BindView(R.id.recycler)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<ChatModel> chatModels = new ArrayList<>();
        chatModels.add(new ChatModel(false,"Hilmi","Miaw","Htttp xxx","1098","12"));
        chatModels.add(new ChatModel(true,"Hilmi","Miaw","Htttp xxx","1098","12"));
        SmartAdapter.items(chatModels)
                .map(ChatModel.class, ChatAdapterView.class).into(recyclerView);
    }
}
