package com.example.exercise3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton: Button = findViewById(R.id.buttonCalculate)

        calculateButton.setOnClickListener {
            val ageSpinner: Spinner = findViewById(R.id.spinnerAge)
            val age = ageSpinner.selectedItem.toString()
            val genderID: Int = radioGroupGender.checkedRadioButtonId
            val genderSelected: RadioButton = findViewById(genderID)
            val gender = genderSelected.text.toString()
            val smoker: CheckBox = findViewById(R.id.checkBoxSmoker)

            if (age == "Less than 17") {
                if (gender == "Male" || gender == "Female") {
                    if (!smoker.isChecked || smoker.isChecked) {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM60\nTotal Payment: RM60\n"
                    }
                }
            } else if (age == "17 to 25") {
                if (gender == "Female") {
                    if (smoker.isChecked) {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM70\nExtra Payment for Smoker: RM 100\nTotal Payment: RM170\n"
                    } else {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM70\nTotal Payment: RM70\n"
                    }
                } else {
                    if (gender == "Male") {
                        if (smoker.isChecked) {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM70\nExtra Payment for Male: RM 50\nExtra Payment for Smoker: RM 100\nTotal Payment: RM220\n"
                        } else {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM70\nExtra Payment for Male: RM 50\nTotal Payment: RM120\n"
                        }
                    }
                }
            } else if (age == "26 to 30") {
                if (gender == "Female") {
                    if (smoker.isChecked) {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM90\nExtra Payment for Smoker: RM 150\nTotal Payment: RM240\n"
                    } else {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM90\nTotal Payment: RM90\n"
                    }
                } else {
                    if (gender == "Male") {
                        if (smoker.isChecked) {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM90\nExtra Payment for Male: RM 100\nExtra Payment for Smoker: RM 150\nTotal Payment: RM340\n"
                        } else {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM90\nExtra Payment for Male: RM 100\nTotal Payment: RM190\n"
                        }
                    }
                }
            } else if (age == "31 to 40") {
                if (gender == "Female") {
                    if (smoker.isChecked) {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM120\nExtra Payment for Smoker: RM 200\nTotal Payment: RM320\n"
                    } else {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM120\nTotal Payment: RM120\n"
                    }
                } else {
                    if (gender == "Male") {
                        if (smoker.isChecked) {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM120\nExtra Payment for Male: RM 150\nExtra Payment for Smoker: RM 200\nTotal Payment: RM470\n"
                        } else {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM120\nExtra Payment for Male: RM 150\nTotal Payment: RM270\n"
                        }
                    }
                }
            } else if (age == "41 to 55") {
                if (gender == "Female") {
                    if (smoker.isChecked) {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM150\nExtra Payment for Smoker: RM 250\nTotal Payment: RM400\n"
                    } else {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM150\nTotal Payment: RM150\n"
                    }
                } else {
                    if (gender == "Male") {
                        if (smoker.isChecked) {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nExtra Payment for Smoker: RM 250\nTotal Payment: RM600\n"
                        } else {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nTotal Payment: RM350\n"
                        }
                    }
                }
            } else if (age == "More than 55") {
                if (gender == "Female") {
                    if (smoker.isChecked) {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM150\nExtra Payment for Smoker: RM 300\nTotal Payment: RM450\n"
                    } else {
                        textViewPremium.text =
                            "Insurance Premium :\nPrice: RM150\nTotal Payment: RM150\n"
                    }
                } else {
                    if (gender == "Male") {
                        if (smoker.isChecked) {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nExtra Payment for Smoker: RM 300\nTotal Payment: RM650\n"
                        } else {
                            textViewPremium.text =
                                "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nTotal Payment: RM350\n"
                        }
                    }
                }
            }

        }

        val resetButton: Button = findViewById(R.id.buttonReset)

        resetButton.setOnClickListener {
            spinnerAge.setSelection(0)
            radioGroupGender.clearCheck()
            checkBoxSmoker.isChecked = false
            textViewPremium.text = "Insurance Premium :"
        }
    }
}
