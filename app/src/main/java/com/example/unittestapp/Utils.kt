package com.example.unittestapp

import android.content.Context
import android.content.res.AssetManager
import android.util.Log
import java.io.*

fun getJsonDataFromAsset(context: Context, fileName: String): String? {
    var jsonString: String


    try {
        Log.i("Json reader", "start reading json...")
        jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }

//        Log.i("AssetManager", "start AssetManager...")
////        var reader: InputStream = context.assets.open(fileName)
//        var manager: AssetManager = context.assets
//        var reader: InputStream = manager.open(fileName)
//        jsonString = reader.bufferedReader().use { it.readText() }

    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return null
    }

    return jsonString
}


