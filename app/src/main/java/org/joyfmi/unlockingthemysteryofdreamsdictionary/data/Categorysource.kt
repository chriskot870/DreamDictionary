package org.joyfmi.unlockingthemysteryofdreamsdictionary.data

import android.util.Log
import org.joyfmi.unlockingthemysteryofdreamsdictionary.R
import org.joyfmi.unlockingthemysteryofdreamsdictionary.model.DreamCategory

class Categorysource {

    fun loadCategories(): List<DreamCategory> {
        /*
        Log.v("Category1", R.string.Category1.toString())
        Log.v("Category2", R.string.Category2.toString())
        Log.v("Category3", R.string.Category3.toString())

        val catlist = listOf<DreamCategory>(
            DreamCategory(R.string.Category1),
            DreamCategory(R.string.Category2),
            DreamCategory(R.string.Category3)
        )
         */
        val catlist:List<DreamCategory> = listOf(
            DreamCategory("Cat01"),
            DreamCategory("Cat02"),
            DreamCategory("Cat03")
        )

        return catlist
    }
}