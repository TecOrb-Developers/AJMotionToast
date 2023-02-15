package com.motiontoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.core.content.res.ResourcesCompat
import com.motiontoast.databinding.ActivityMainBinding
import com.movingtoast.MovingToast
import com.movingtoast.MovingToastStyle

class MainActivity :AppCompatActivity(), View.OnClickListener, View.OnLongClickListener,
CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.switchCustomColors.setOnCheckedChangeListener(this)
        binding.successBtn.setOnClickListener(this)
        binding.errorBtn.setOnClickListener(this)
        binding.warningBtn.setOnClickListener(this)
        binding.infoBtn.setOnClickListener(this)
        binding.deleteBtn.setOnClickListener(this)
        binding.noInternetBtn.setOnClickListener(this)

        binding.successBtn.setOnLongClickListener(this)
        binding.errorBtn.setOnLongClickListener(this)
        binding.warningBtn.setOnLongClickListener(this)
        binding.infoBtn.setOnLongClickListener(this)
        binding.deleteBtn.setOnLongClickListener(this)
        binding.noInternetBtn.setOnLongClickListener(this)
    }

    private fun setToastColors(newColorsEnabled: Boolean) {
        if (newColorsEnabled) {
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
        } else {
            MovingToast.resetToastColors()
        }
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
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
        }

    }

    override fun onLongClick(v: View?): Boolean {
        when (v!!.id) {
            R.id.successBtn -> {
                MovingToast.createColorToast(
                    this,
                    "Post create 😍",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    MovingToastStyle.SUCCESS,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.errorBtn -> {
                MovingToast.darkToast(
                    this,
                    "",
                    "Profile Update Failed!",
                    MovingToastStyle.ERROR,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.warningBtn -> {
                MovingToast.darkColorToast(
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
                MovingToast.darkToast(
                    this,
                    "",
                    "Dark ui testing here!",
                    MovingToastStyle.INFO,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.deleteBtn -> {
                MovingToast.darkToast(
                    this,
                    "",
                    "Profile Deleted!",
                    MovingToastStyle.DELETE,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
            R.id.noInternetBtn -> {
                MovingToast.darkToast(
                    this,
                    "",
                    "Please turn on internet connection!",
                    MovingToastStyle.NO_INTERNET,
                    MovingToast.GRAVITY_BOTTOM,
                    MovingToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, R.font.helvetica_regular)
                )
            }
        }

        return true
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        setToastColors(isChecked)
    }

}