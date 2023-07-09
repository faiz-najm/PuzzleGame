package com.vsgaa.puzzlegame

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.vsgaa.puzzlegame.databinding.ListItemBinding
import org.d3if3155.helloworld.model.Kotak

class MainAdapter() :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    private val data = mutableListOf<Kotak>()

    fun updateData(newData: List<Kotak>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    class ViewHolder(
        private val binding: ListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(kotak: Kotak) = with(binding) {
            latinTextView.text = kotak.huruf

            root.setOnClickListener {
                val message = root.context.getString(R.string.message)
                Toast.makeText(root.context, message, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


}

