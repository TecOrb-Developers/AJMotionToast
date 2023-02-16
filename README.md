# AJMotionToast

# Screen Shot
![This is an image](https://s4.aconvert.com/convert/p3r68-cdx67/ayic2-yb8ka.jpg)
![This is an image](https://s4.aconvert.com/convert/p3r68-cdx67/a3agx-3tnyn.jpg)
![This is an image](https://s4.aconvert.com/convert/p3r68-cdx67/aicii-57905.jpg)

### How to Use

Step 1. Add it in your root build.gradle at the end of repositories:
```allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```
```
Step 2. Add the dependency
dependencies {
	     implementation 'com.github.TecOrb-Developers:AJWheelPicker:v1.0.0'
	} 
```      


Step 3 .

~~~  
   R.id.successBtn -> {
                MovingToast.createToast(
                    this,
                    "Profile saved",
                    "Lorem Ipsum is simply dummy this is very simple text Lorem Ipsum is simply dummy this is very simple text Lorem Ipsum is simply dummy this is very simple text",
                    MovingToastStyle.SUCCESS,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.errorBtn -> {
                MovingToast.createToast(
                    this,
                    "Profile failed",
                    "Profile Update Failed due to this reason",
                    MovingToastStyle.ERROR,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.warningBtn -> {

                MovingToast.createToast(
                    this,
                    "",
                    "Please Fill All The Details!",
                    MovingToastStyle.WARNING,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.infoBtn -> {
                MovingToast.createColorToast(
                    this,
                    "",
                    "Color Toast testing here!",
                    MovingToastStyle.INFO,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.deleteBtn -> {
                MovingToast.createToast(
                    this, "Profile Deleted!",
                    "",
                    MovingToastStyle.DELETE,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.noInternetBtn -> {
                MovingToast.createToast(
                    this, "Please turn on internet connection!",
                    "",
                    MovingToastStyle.NO_INTERNET,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
  
  ~~~
  
  Step 4. Feature
  
  ```
   MovingToast.setSuccessColor(R.color.custom_success_color)
            MovingToast.setErrorColor(R.color.custom_error_color)
            MovingToast.setDeleteColor(R.color.custom_delete_color)
            MovingToast.setWarningColor(R.color.custom_warning_color)
            MovingToast.setInfoColor(R.color.custom_info_color)
            MovingToast.setSuccessBackgroundColor(R.color.success_bg_color)
            MovingToast.setErrorBackgroundColor(R.color.error_bg_color)
            MovingToast.setDeleteBackgroundColor(R.color.delete_bg_color)
            MovingToast.setWarningBackgroundColor(R.color.warning_bg_color)
            MovingToast.setInfoBackgroundColor(R.color.info_bg_color)
  ```
