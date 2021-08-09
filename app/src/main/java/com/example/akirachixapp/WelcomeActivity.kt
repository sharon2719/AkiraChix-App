package com.example.akirachixapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    lateinit var btnStudent:Button
    lateinit var  btnTrainer:Button
    lateinit var btnAdmin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        castView2()
        onClick()
    }
    fun castView2(){
        btnStudent=findViewById(R.id.btnStudent)
        btnTrainer=findViewById(R.id.btnTrainer)
        btnAdmin=findViewById(R.id.btnAdmin)
    }

    fun onClick(){
        btnStudent.setOnClickListener {
            var studentForm=Intent(baseContext,StudentLoginActivity::class.java)
            startActivity(studentForm)

        }
        btnTrainer.setOnClickListener {
            var trainerForm=Intent(baseContext,TrainerLoginActivity::class.java)
            startActivity(trainerForm)

        }
        btnAdmin.setOnClickListener {
            var adminForm=Intent(baseContext,AdminLoginActivity::class.java)
            startActivity(adminForm)

        }
    }

}
