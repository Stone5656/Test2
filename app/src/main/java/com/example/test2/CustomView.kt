package com.example.test2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.test2.R

class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

    private var imageButton: ImageButton
    private var textView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_view, this, true)
        imageButton = findViewById(R.id.custom_image_button)
        textView = findViewById(R.id.custom_text)

        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.CustomView, 0, 0)
            val buttonImage = typedArray.getResourceId(R.styleable.CustomView_buttonImage, R.drawable.spring_ryuanji)
            val textViewText = typedArray.getString(R.styleable.CustomView_textViewText)

            imageButton.setImageDrawable(ContextCompat.getDrawable(context, buttonImage))
            textView.text = textViewText ?: context.getString(R.string.default_text)

            typedArray.recycle()
        }
    }

    fun setButtonImage(resourceId: Int) {
        imageButton.setImageResource(resourceId)
    }

    fun setTextViewText(text: String) {
        textView.text = text
    }

    fun setTextViewTextById(stringResId: Int) {
        textView.setText(stringResId)
    }
}
