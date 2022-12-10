package com.example.gridlayoutlesson

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.gridlayoutlesson.databinding.Item01Binding

class AdapterClass( private val list :ArrayList<ModelClass>, private val context: Context)
    :RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val binding = Item01Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderClass(binding)
     }
    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        holder.bind()
    }
    override fun getItemCount(): Int {
        return  list.size
    }

    inner  class ViewHolderClass (val binding: Item01Binding):RecyclerView.ViewHolder(binding.root){
       fun bind(){
           binding.apply {
               val itemka =list[adapterPosition]
               binding.textView.text=itemka.name
              // binding.imageView.setImageResource()
               binding.imageView.setImageResource(R.drawable.logo03)
//               binding.imageView.setImageResource(R.drawable.logo04)
           }
       }
    }
}