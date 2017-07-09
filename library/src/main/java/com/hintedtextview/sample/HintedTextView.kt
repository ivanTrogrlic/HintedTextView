package com.hintedtextview.sample

import android.content.Context
import android.graphics.Color
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.util.TypedValue.COMPLEX_UNIT_SP
import android.view.View
import android.widget.LinearLayout
import com.hintedtextview.ivan.library.R
import kotlinx.android.synthetic.main.hinted_text_view.view.*

/**Created by ivanTrogrlic on 23/06/2017.*/

class HintedTextView @JvmOverloads constructor(context: Context,
                                               attrs: AttributeSet? = null,
                                               defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.hinted_text_view, this)

        attrs?.let {
            context.obtainStyledAttributes(it, R.styleable.HintedTextView, 0, 0).apply {
                getResourceId(R.styleable.HintedTextView_hinted_label, -1).let {
                    if (it != -1) setLabel(it)
                }
                getResourceId(R.styleable.HintedTextView_hinted_label_color, -1).let {
                    if (it != -1) setLabelColor(it)
                }
                getColor(R.styleable.HintedTextView_hinted_label_color, Color.BLACK).let {
                    label.setTextColor(it)
                }
                getResourceId(R.styleable.HintedTextView_hinted_value, -1).let {
                    if (it != -1) setValue(it)
                }
                getResourceId(R.styleable.HintedTextView_hinted_value_color, -1).let {
                    if (it != -1) setDividerColor(it)
                }
                getColor(R.styleable.HintedTextView_hinted_value_color, Color.BLACK).let {
                    value.setTextColor(it)
                }
                getResourceId(R.styleable.HintedTextView_hinted_divider_color, -1).let {
                    if (it != -1) setValueColor(it)
                }
                getColor(R.styleable.HintedTextView_hinted_divider_color, Color.BLACK).let {
                    value.setTextColor(it)
                }
                resources.getDimensionPixelSize(R.dimen.text_size_subhead_style).let {
                    // minimumHeight = it * 2 // Setting min height for animation to work properly
                }
            }.recycle()
        }
    }

    fun setLabel(@StringRes res: Int) = label.setText(res)

    fun setLabelColor(@ColorInt res: Int) = label.setTextColor(ContextCompat.getColor(context, res))

    fun setValue(@StringRes resId: Int) = setValue(resources.getText(resId))

    fun setValue(text: CharSequence) {
        value.text = text
        value.visibility =View.VISIBLE
    }

    fun setValueColor(@ColorRes res: Int) = value.setTextColor(ContextCompat.getColor(context, res))

    fun setDividerColor(@ColorRes res: Int) = divider.setBackgroundColor(ContextCompat.getColor(context, res))

}
