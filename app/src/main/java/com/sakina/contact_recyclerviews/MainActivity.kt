package com.sakina.contact_recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sakina.contact_recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact=Contact("Andy","andy@gmail.com","074568065","Karen","https://i.pinimg.com/236x/1b/c9/99/1bc999a5e68d18eda9c96d930c22d455.jpg")
        var contact1=Contact("Ali","ali@gmail.com","0734216789","Muthaiga","https://i.pinimg.com/236x/8a/fa/78/8afa78d27a15f327523094a519018c26.jpg")
        var contact2=Contact("Andy","andy@gmail.com","074568065","Karen","https://i.pinimg.com/236x/d4/37/76/d43776bfa9caa9dc63a63a18c022688e.jpg")
        var contact3=Contact("Serah","serah@gmail.com","076578023","Kabiria","https://i.pinimg.com/236x/c8/12/93/c81293e676f18e2dd479bcb366fa16ff.jpg")
        var contact4=Contact("Sandy","sandy@gmail.com","075678902","Runda","https://i.pinimg.com/236x/0a/9c/3f/0a9c3f69385041e1526a2c39ec96570e.jpg")
        var contact5=Contact("Serah","serah@gmail.com","076578023","Kabiria","https://i.pinimg.com/236x/cf/8b/04/cf8b049bfd6472d20877c23fd0a08b8e.jpg")
        var contact6=Contact("Sandy","sandy@gmail.com","075678902","Runda","https://i.pinimg.com/236x/b1/67/f8/b167f8b7981a2968ab7adb12d1f9f20e.jpg")
        var contactList= listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6)
        var contactsAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter
    }
}