package com.example.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomsheetdialog.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupModalButtons()
    }

    private fun setupModalButtons() {
        binding.apply {
            btnModal.setOnClickListener {
                val modal = BottomSheetDialogFragment()
                supportFragmentManager.let { modal.show(it, BottomSheetDialogFragment.TAG) }
            }

            btnFullscreenModal.setOnClickListener {
                val full = BottomSheetFullScreenFragment()
                supportFragmentManager.let { full.show(it, "") }

            }
        }
    }
}