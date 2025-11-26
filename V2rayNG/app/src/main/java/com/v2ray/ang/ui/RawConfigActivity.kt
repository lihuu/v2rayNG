package com.v2ray.ang.ui

import android.os.Bundle
import android.view.MenuItem
import com.v2ray.ang.databinding.ActivityRawConfigBinding
import com.v2ray.ang.R

class RawConfigActivity : BaseActivity() {
    private lateinit var binding: ActivityRawConfigBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRawConfigBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val config = intent.getStringExtra("config")
        binding.tvConfig.text = config

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.title_raw_config)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}