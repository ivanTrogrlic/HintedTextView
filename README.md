# HintedTextView

HintedTextView is a small animated TextView with a hint. Similar behaviour as TextEditLayout. 

![aa3dix](http://i.makeagif.com/media/7-11-2017/aa3dix.gif)

Download
--------

#### Gradle:

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
    
dependencies {
	  compile 'com.github.ivanTrogrlic:HintedTextView:v1.0'
}
```


#### Maven:

```xml
<dependency>
	 <groupId>com.github.ivanTrogrlic</groupId>
	 <artifactId>HintedTextView</artifactId>
	 <version>v1.0</version>
</dependency>
```

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


License
-------

    Copyright 2017 Ivan Trogrlić

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

