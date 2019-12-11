package www.pickens.whatscool.truegardenboutique.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_products.*
import kotlinx.android.synthetic.main.product_list_item.*
import www.pickens.whatscool.truegardenboutique.Adapter.ProductsAdapter
import www.pickens.whatscool.truegardenboutique.R
import www.pickens.whatscool.truegardenboutique.Services.DataService
import www.pickens.whatscool.truegardenboutique.Util.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    lateinit var  adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)



        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

       // adapter= ProductsAdapter(this,DataService.getProducts(categoryType))

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            spanCount = 4
        }
        val screeningSize = resources.configuration.screenWidthDp
        if (screeningSize >720)
        {
           spanCount =3
        }




        val layoutManager = GridLayoutManager(this,  spanCount)


        productListView.adapter = adapter
       productListView.layoutManager = layoutManager

        //productListView.setHasFixedSize(true)

//        product_list_item
//
//
//    }
//
//    object product_list_item {

    }


}
