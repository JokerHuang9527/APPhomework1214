package com.example.homework1214

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.example.homework1214.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //為按鈕設定監聽器
        findViewById<Button>(R.id.btn_start).setOnClickListener {
            //使用 startService()方法啟動 Service
            startService(Intent(this, MyService::class.java))
            Toast.makeText(this, "啟動 Service", Toast.LENGTH_SHORT).show()
            //關閉 Activity
            finish()
        }
    }
}