package buu.informatics.s59160625.parking

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160625.parking.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var num = 0
    private lateinit var binding: ActivityMainBinding
    private val car: Car = Car("")
    private val car2: Car = Car("")
    private val car3: Car = Car("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            bt1Button.setOnClickListener {
                num = 1
                showInfo(it)
            }
            bt2Button.setOnClickListener {
                num = 2
                showInfo(it)
            }
            bt3Button.setOnClickListener {
                num = 3
                showInfo(it)
            }
            updateButton.setOnClickListener {
                update(it)
            }
            cancelButton.setOnClickListener {
                cancel(it)
            }
            this.car = this@MainActivity.car
            this.car2 = this@MainActivity.car2
            this.car3 = this@MainActivity.car3
        }
    }

    private fun showInfo(view: View){
        binding.apply {
            carId01_edit.visibility = View.VISIBLE
            brand01_edit.visibility = View.VISIBLE
            fullname_edit.visibility = View.VISIBLE
            updateButton.visibility = View.VISIBLE
            cancelButton.visibility = View.VISIBLE
            if(num == 1){
                carId01Edit.setText(car?.carId)
                brand01Edit.setText(car?.brand)
                fullnameEdit.setText(car?.fullname)
                invalidateAll()
            }else{
                if(num == 2){
                    carId01Edit.setText(car2?.carId)
                    brand01Edit.setText(car2?.brand)
                    fullnameEdit.setText(car2?.fullname)
                    invalidateAll()
                }else{
                    if(num == 3){
                        carId01Edit.setText(car3?.carId)
                        brand01Edit.setText(car3?.brand)
                        fullnameEdit.setText(car3?.fullname)
                        invalidateAll()
                    }
                }
            }
        }
    }

    private fun update(view: View){
        if(num == 1){
            binding.apply {
                car?.carId = binding.carId01Edit.text.toString()
                car?.brand = binding.brand01Edit.text.toString()
                car?.fullname = binding.fullnameEdit.text.toString()
                bt1Button.text = car?.carId
                carId01_edit.visibility = View.GONE
                brand01_edit.visibility =View.GONE
                fullname_edit.visibility = View.GONE
                updateButton.visibility = View.GONE
                cancelButton.visibility = View.GONE
                invalidateAll()
                //Hide the keyboard
                val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
            }
        }else{
            if(num == 2){
                binding.apply {
                    car2?.carId = binding.carId01Edit.text.toString()
                    car2?.brand = binding.brand01Edit.text.toString()
                    car2?.fullname = binding.fullnameEdit.text.toString()
                    bt2Button.text = car2?.carId
                    carId01_edit.visibility = View.GONE
                    brand01_edit.visibility =View.GONE
                    fullname_edit.visibility = View.GONE
                    updateButton.visibility = View.GONE
                    cancelButton.visibility = View.GONE
                    invalidateAll()
                    //Hide the keyboard
                    val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
                }
            }else{
                if(num == 3){
                    binding.apply {
                        car3?.carId = binding.carId01Edit.text.toString()
                        car3?.brand = binding.brand01Edit.text.toString()
                        car3?.fullname = binding.fullnameEdit.text.toString()
                        bt3Button.text = car3?.carId
                        carId01_edit.visibility = View.GONE
                        brand01_edit.visibility =View.GONE
                        fullname_edit.visibility = View.GONE
                        updateButton.visibility = View.GONE
                        cancelButton.visibility = View.GONE
                        invalidateAll()
                        //Hide the keyboard
                        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
                    }
                }
            }
        }
    }

    private  fun cancel(view: View){
        if(num == 1){
            binding.apply {
                car?.carId = ""
                car?.brand = ""
                car?.fullname = ""
                carId01Edit.text = null
                brand01Edit.text = null
                fullnameEdit.text = null
                bt1Button.text = "Free"
                invalidateAll()
            }
        }else{
            if(num == 2){
                binding.apply {
                    car2?.carId = ""
                    car2?.brand = ""
                    car2?.fullname = ""
                    carId01Edit.text = null
                    brand01Edit.text = null
                    fullnameEdit.text = null
                    bt2Button.text = "Free"
                    invalidateAll()
                }
            }else{
                if(num == 3){
                    binding.apply {
                        car3?.carId = ""
                        car3?.brand = ""
                        car3?.fullname = ""
                        carId01Edit.text = null
                        brand01Edit.text = null
                        fullnameEdit.text = null
                        bt3Button.text = "Free"
                        invalidateAll()
                    }
                }
            }
        }
    }
}
