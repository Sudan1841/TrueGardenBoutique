package www.pickens.whatscool.truegardenboutique.Adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product_list_item.view.*
import www.pickens.whatscool.truegardenboutique.Model.Product
import www.pickens.whatscool.truegardenboutique.R

class ProductsAdapter(val context: Context, val products: List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun getItemCount(): Int
    {
        return products.count()
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder
    {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)


        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }




    override fun onBindViewHolder(holder: ProductHolder, position: Int)
    {
        holder?.bindProduct(products[position], context)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner  class  ProductHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {

        val  productImage = itemView.findViewById<ImageView>(R.id.productimage)
        val  productName = itemView.findViewById<TextView>(R.id.ProducttextName)
        val  productPrice = itemView.findViewById<TextView>(R.id.productPrices)

        fun bindProduct(product:Product, context: Context)
        {
            val  resourceId = context.resources.getIdentifier(product.image,"drawable", context.packageName )
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price

        }




    }
}