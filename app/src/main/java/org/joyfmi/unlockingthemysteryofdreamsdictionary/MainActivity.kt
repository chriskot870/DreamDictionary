package org.joyfmi.unlockingthemysteryofdreamsdictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import org.joyfmi.unlockingthemysteryofdreamsdictionary.categoryadapter.CategoryAdapter
import org.joyfmi.unlockingthemysteryofdreamsdictionary.data.Categorysource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
         * Initialize data
         */
        val myDataset = Categorysource().loadCategories()

        val catRecyclerView = findViewById<RecyclerView>(R.id.category_view)
        catRecyclerView.adapter = CategoryAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        catRecyclerView.setHasFixedSize(true)

    }
}