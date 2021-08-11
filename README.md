# custom_toast_and_snackbar

Android library for custom toast and snackbar &nbsp; &nbsp;
[![](https://jitpack.io/v/ykstech/custom_toast_and_snackbar.svg)](https://jitpack.io/#ykstech/custom_toast_and_snackbar)</br>
Current latest version <b>1.3</b>
> Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
> Step 2. Add the dependency
```gradle
  dependencies {
	        implementation 'com.github.ykstech:custom_toast_and_snackbar:1.3'
	}
  ```
  In place of tag u have to wright the latest version of the library 
  
  > Step 3. Add this code in your oncreate, this is required to pass activity only once
  ```java
  new customtoast(this);
  ```
  > For simple toast
  ```java
      //simple taost//
        customtoast.toast(this,"simple toast");
  ```
  > For custom default toast
  ```java
   //custom default toast//
        customtoast.customtoast(getApplicationContext(), "custom toast");
       
  ```
  <img src="https://user-images.githubusercontent.com/85982995/128543861-9a37debe-7743-4179-b3c4-440ae63adb38.png" width="250" height="400"></img>
  <img src="https://user-images.githubusercontent.com/85982995/128550148-9dee376b-a727-47ec-8475-b382964517ef.png" width="250" height="400"></img>
  <img src="https://user-images.githubusercontent.com/85982995/128550868-d7b68028-545e-4807-bd6a-2826569119ed.png"  width="250" height="400"></img>
  > For custom toast with 16 properties u can add or remove as per your requirement.
  ```java
   //total 16 properties//
        //custom toast with bg image, icon image,bg color,text color,card elevation,elevation,
	//radius,textsize, position of toast (x,y)offset,icon gravity//
          customtoast.seticon(R.drawable.new1);
          customtoast.setbgcolor("#FF0000");
          customtoast.setbg(R.drawable.toast);
          customtoast.setcardelevation(5);
          customtoast.setelevation(5);
          customtoast.setradius(10);
          customtoast.settextcolor("#ffffff");
          customtoast.settextsize(20);
          customtoast.settextstyle(Typeface.BOLD_ITALIC);
          customtoast.setxoffset(0);
          customtoast.setyoffset(300);
          customtoast.seticongravity(Gravity.CENTER);
          customtoast.settextgravity(Gravity.CENTER);
          customtoast.seticonmargin(5,5,0,5);
          customtoast.settextmargin(5,5,15,5);
          customtoast.setduration(Toast.LENGTH_LONG);

        customtoast.customtoast(getApplicationContext(), "custom toast with bg");
	///// u have to define attributes for each new toast otherwise it sets to default toast///

  ```
  <i>For more detailed application of this go through the app src file</i> 
  
  # LICENSE
  
  Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

  
  
  
