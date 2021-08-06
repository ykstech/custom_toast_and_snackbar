# custom_toast_and_snackbar
Android library for custom toast and snackbar </br>
Current latest version <b>1.1</b>
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
	        implementation 'com.github.ykstech:custom_toast_and_snackbar:Tag'
	}
  ```
  In place of tag u have to wright the latest version of the library 
  
  > Step 3. Add the code in your java file
  ```java
  customtoast.toast(this,"library created");
  ```
  
