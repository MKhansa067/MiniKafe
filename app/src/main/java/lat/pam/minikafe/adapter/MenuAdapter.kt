package lat.pam.minikafe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import lat.pam.minikafe.R
import lat.pam.minikafe.model.MenuItem
import java.text.NumberFormat
import java.util.Locale

class MenuAdapter(
    private var items: List<MenuItem>,
    private val onItemClick: (MenuItem) -> Unit,
    private val onAddClick: (MenuItem) -> Unit
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivImage: ImageView = itemView.findViewById(R.id.ivMenuItemImage)
        val tvName: TextView = itemView.findViewById(R.id.tvMenuItemName)
        val tvDesc: TextView = itemView.findViewById(R.id.tvMenuItemDesc)
        val tvPrice: TextView = itemView.findViewById(R.id.tvMenuItemPrice)
        val btnAdd: MaterialButton = itemView.findViewById(R.id.btnMenuAdd)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = items[position]
        holder.tvName.text = item.name
        holder.tvDesc.text = item.description

        val formattedPrice = NumberFormat.getCurrencyInstance(Locale("id", "ID")).format(item.price)
            .replace(",00", "")
            .replace("Rp", "Rp ")
        holder.tvPrice.text = formattedPrice

        holder.ivImage.setImageResource(item.imageResId)

        holder.itemView.setOnClickListener { onItemClick(item) }
        holder.btnAdd.setOnClickListener { onAddClick(item) }
    }

    override fun getItemCount(): Int = items.size

    fun updateList(newItems: List<MenuItem>) {
        items = newItems
        notifyDataSetChanged()
    }
}

