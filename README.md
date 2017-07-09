# HintedTextView

I had a requirement for a TextView with a hint, something similar to the TextInputLayout but not exactly.
So I decided to create a small lib around it. 

// TODO push it to jitpack and add a gif 

## Usage
It has a very simple API, all you have to do is add the HintedTextView to your xml file and set wanted properties for it. 

```
    <com.hintedtextview.sample.HintedTextView
        android:id="@+id/hinted_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp"
        app:hinted_divider_color="@color/colorPrimary"
        app:hinted_label="@string/text_label"
        app:hinted_label_color="@color/colorText"
        app:hinted_value_color="@color/colorPrimary" />
```

... and then in your code, if you want to set the value for example, just use the setValue public method.

```
hinted_text.setValue("$hour:$minute")
```
