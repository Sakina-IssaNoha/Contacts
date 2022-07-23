package com.sakina.contact_recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.sakina.contact_recyclerviews.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        var phoneNumber = intent.extras?.getString("PHONENUMBER")
        var email = intent.extras?.getString("EMAIL")
        var image = binding.imgPerson

        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,address,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,phoneNumber,Toast.LENGTH_SHORT)
        Toast.makeText(this,email,Toast.LENGTH_SHORT)

        binding.tvName1.text= name
        binding.tvNumber.text = phoneNumber
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)

    }

}