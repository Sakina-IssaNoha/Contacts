package com.sakina.contact_recyclerviews

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sakina.contact_recyclerviews.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contactList: List<Contact>):
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var CurrentContact=contactList.get(position)
        holder.binding.tvName.text=CurrentContact.name
        holder.binding.tvPhonenumber.text=CurrentContact.phoneNumber
        holder.binding.tvEmail.text=CurrentContact.email
        holder.binding.tvAddress.text=CurrentContact.address
        Picasso.get().load(CurrentContact.image).resize(200,200).centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24).into(holder.binding.imgContact)

        val context = holder.itemView.context
        holder.binding.imgContact.setOnClickListener {
            Toast.makeText(context,"You have clicked the image",Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener{
            val intent = Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",CurrentContact.name)
            intent.putExtra("ADDRESS",CurrentContact.address)
            intent.putExtra("EMAIL",CurrentContact.email)
            intent.putExtra("PHONENUMBER",CurrentContact.phoneNumber)
            intent.putExtra("IMAGE",CurrentContact.image)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size

    }
}

class ContactViewHolder(val binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root)

