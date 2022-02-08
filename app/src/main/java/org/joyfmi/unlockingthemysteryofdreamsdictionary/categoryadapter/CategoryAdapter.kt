package org.joyfmi.unlockingthemysteryofdreamsdictionary.categoryadapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.joyfmi.unlockingthemysteryofdreamsdictionary.R
import org.joyfmi.unlockingthemysteryofdreamsdictionary.model.DreamCategory

/*
 * Adapter for the Category RecyclerView in Main Activity Displays DreamCategory data object
 */
class CategoryAdapter(
    private val context: Context,
    private val dataset: List<DreamCategory>
    ) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    /*
     * Provide a reference to the views for each category item
     * Each data item is just an DreamCategory object.
     */
    class CategoryViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.category_title)
        }
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {
        Log.v("getItemCount", dataset.size.toString())
        return dataset.size
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_category, parent, false)

        Log.v("CreateViewHolder", "Called")

        return CategoryViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        Log.v("Position", position.toString())
        Log.v("Position", dataset.size.toString())
        val category = dataset[position]
        holder.textView.text = category.name

    }
}