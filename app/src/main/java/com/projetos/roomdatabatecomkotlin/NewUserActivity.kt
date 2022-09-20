package com.projetos.roomdatabatecomkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projetos.roomdatabatecomkotlin.database.AppDatabase
import com.projetos.roomdatabatecomkotlin.database.daos.UserDao
import com.projetos.roomdatabatecomkotlin.databinding.ActivityNewUserBinding

class NewUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewUserBinding
    private lateinit var database: AppDatabase
    private lateinit var userDao: UserDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityNewUserBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        this.database = AppDatabase.getInstance(this)

        this.userDao = this.database.userDao()
    }

}