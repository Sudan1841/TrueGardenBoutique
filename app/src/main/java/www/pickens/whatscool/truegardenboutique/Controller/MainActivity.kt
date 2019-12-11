package www.pickens.whatscool.truegardenboutique.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import www.pickens.whatscool.truegardenboutique.Adapter.CategoryRecycleAdapter
import www.pickens.whatscool.truegardenboutique.R
import www.pickens.whatscool.truegardenboutique.Services.DataService
import www.pickens.whatscool.truegardenboutique.Util.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    lateinit var  adapter:CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryRecycleAdapter(this, DataService.Categories){
                category ->
            val productsIntent = Intent(this, ProductsActivity::class.java)
            productsIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productsIntent)
        }

        catogoryListview.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        catogoryListview.layoutManager = layoutManager

        catogoryListview.setHasFixedSize(true)




    }
}
