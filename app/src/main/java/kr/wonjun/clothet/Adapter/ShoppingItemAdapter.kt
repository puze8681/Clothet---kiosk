package kr.wonjun.clothet.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.item_shopping.view.*
import kr.wonjun.clothet.Data.ShoppingItemData
import kr.wonjun.clothet.R

/**
 * Created by parktaejun on 2017. 9. 1..
 */
class ShoppingItemAdapter(private val context : Context, private var items : ArrayList<ShoppingItemData>): RecyclerView.Adapter<ShoppingItemAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(position, context)
        holder?.itemView?.setOnClickListener {
            itemClick?.onItemClick(holder.itemView, position)
        }    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder
            = ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_shopping, null), context)

    override fun getItemCount(): Int = items.size

    class ViewHolder(itemView: View, private val context : Context) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int, context: Context) {
            val params: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            val margin = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10f, context.resources.displayMetrics).toInt()
            if (position % 2 == 0)
                params.marginEnd = margin
            else
                params.marginStart = margin
            itemView.layoutParams = params
            itemView.cody_img.setImageResource(R.drawable.ic_register_logo)
            itemView.cody_text.text = "코디" + position
        }
    }
    var itemClick: ItemClick? = null

    interface ItemClick {
        fun onItemClick(view: View?, position: Int)
    }
}