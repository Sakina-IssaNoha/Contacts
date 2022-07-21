package com.sakina.contact_recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
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
    }

    override fun getItemCount(): Int {
        return contactList.size

    }
}

class ContactViewHolder(val binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root)

