package kz.worldskills.B14

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        // Установка RecyclerView для сообщений чата
        val chatRecyclerView = findViewById<RecyclerView>(R.id.chatRecyclerView)
        chatRecyclerView.layoutManager = LinearLayoutManager(this)

        // Поле для ввода и кнопка отправки
        val messageInput = findViewById<EditText>(R.id.messageInput)
        val sendButton = findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener {
            val message = messageInput.text.toString()
            if (message.isNotEmpty()) {
                // Логика добавления сообщения в список
                addMessageToChat(message)
                messageInput.text.clear()
            }
        }
    }

    private fun addMessageToChat(message: String) {
        // Реализация добавления сообщения в RecyclerView
    }
}