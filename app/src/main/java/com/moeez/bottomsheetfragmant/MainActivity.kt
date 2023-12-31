package com.moeez.bottomsheetfragmant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moeez.bottomsheetfragmant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.bottomSheetContainer?.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, "BSDialogFragment")
        }

    }
}