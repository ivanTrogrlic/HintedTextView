package com.hintedtextview.sample

import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_view)

        hinted_text.setOnClickListener {
            TimePickerDialog(this,
                    OnTimeSetListener { _, hour, minute ->
                        hinted_text.setValue("$hour:$minute")
                    }, 0, 0, true).show()
        }

    }
}
