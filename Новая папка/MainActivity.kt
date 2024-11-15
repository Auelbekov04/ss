package kz.worldskills.B14

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Установка RecyclerView для истории
        val historyRecyclerView = findViewById<RecyclerView>(R.id.historyRecyclerView)
        historyRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Установка RecyclerView для категорий
        val categoryRecyclerView = findViewById<RecyclerView>(R.id.categoryRecyclerView)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this)

        // Переход на экран чата
        findViewById<Button>(R.id.chatButton).setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
    }
}