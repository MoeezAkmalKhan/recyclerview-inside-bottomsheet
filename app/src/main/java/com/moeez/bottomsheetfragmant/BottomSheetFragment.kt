package com.moeez.bottomsheetfragmant

import android.content.Context
import android.content.SharedPreferences
import android.graphics.drawable.Drawable
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream
import java.nio.charset.StandardCharsets
import java.util.Locale


class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var mContext: Context
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: BottomSheetAdapter
    private val mCountryList: ArrayList<DataItemModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
        mContext = requireContext()

        mCountryList.add(DataItemModel("America", R.drawable.united_states))
        mCountryList.add(DataItemModel("Canada", R.drawable.canada))
        mCountryList.add(DataItemModel("France", R.drawable.france))
        mCountryList.add(DataItemModel("Germany", R.drawable.germany))
        mCountryList.add(DataItemModel("Russia", R.drawable.russia))

        recyclerView = view.findViewById(R.id.bottomSheet_recyclerview) // Replace with your RecyclerView ID
        adapter = BottomSheetAdapter(mCountryList)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter


        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}