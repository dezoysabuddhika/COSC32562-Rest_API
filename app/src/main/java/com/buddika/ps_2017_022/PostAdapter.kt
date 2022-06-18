package com.buddika.ps_2017_022

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val post:MutableList<Post>): RecyclerView.Adapter<PostViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.post,parent,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(post[position])
    }

    override fun getItemCount(): Int {
        return post.size
    }

}
class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val tId: TextView =itemView.findViewById(R.id.tId)
    private val tTitle: TextView =itemView.findViewById(R.id.tTitle)


    fun bindView(post: Post){
        tId.text=post.id
        tTitle.text=post.title

    }
}