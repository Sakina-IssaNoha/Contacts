package com.sakina.contact_recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        getExtras()
    }
    fun getExtras(){
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,address,Toast.LENGTH_SHORT).show()
    }
}