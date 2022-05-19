package com.example.perpustakaan.room.user

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity
@Parcelize
data class User(
    @PrimaryKey(autoGenerate = true)
    val id : Int?,
    @ColumnInfo(name = "username")
    var name : String,
    @ColumnInfo(name = "email")
    var email : String,
    @ColumnInfo(name = "password")
    var password : String
) : Parcelable
