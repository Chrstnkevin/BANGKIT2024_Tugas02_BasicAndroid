package com.example.tugas02basicandroid

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Place (
    var name: String = "",
    var description: String ="",
    var photo: Int = 0,
    var benefit: String =""

) : Parcelable