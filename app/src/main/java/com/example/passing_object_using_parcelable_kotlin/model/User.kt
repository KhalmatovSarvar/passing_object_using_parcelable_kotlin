package com.example.passing_object_using_parcelable_kotlin.model

import android.os.Parcel
import android.os.Parcelable

class User() :Parcelable {
    var name:String = "Sarvar"
    var age:Int = 21
    var gender:Char = 'M'



    constructor(parcel: Parcel) : this() {
        name = parcel.readString().toString()
        age = parcel.readInt()
        gender = parcel.readInt().toChar()
    }

    constructor(name: String, age: Int, gender: Char) : this() {
        this.name = name
        this.age = age
        this.gender = gender
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
        parcel.writeInt(gender.toInt())
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "User(name='$name', age=$age, gender=$gender)"
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

}