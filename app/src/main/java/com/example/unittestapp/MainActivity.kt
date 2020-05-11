package com.example.unittestapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import java.io.FileReader


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        val recipeList: List<Recipe> = getRecipeObjectFromJson()


//        var gson = Gson()
//
//        val fr = FileReader("main/res/raw/data_recipe.json")
//        val recipeList: List<Recipe> = gson.fromJson(fr, Array<Recipe>::class.java).asList()
//        println("list recipe$recipeList")



//        val jsonFileString = getJsonDataFromAsset(applicationContext, "bezkoder.json")
//        Log.i("data", jsonFileString)
//

//        val reader = JsonReader(FileReader("data_recipe"))


//
//        val gson = Gson()
//        val listPersonType = object : TypeToken<List<Recipe>>() {}.type
//
//        var recipes: List<Recipe> = gson.fromJson(FileReader("data_recipe"), listPersonType)
//
//        Log.i("data", (recipes +"aaa").toString())
//        recipes.forEachIndexed { idx, recipes -> Log.i("data", "> Item $idx:\n$recipes") }




//        println("aaa start  as sss s ")



//        !!!!!!!!!"this one works"

//        val jsonFileString = getJsonDataFromAsset(applicationContext, "bezkoder.json")
//        Log.i("data", jsonFileString+"aaa")
//
//        if (jsonFileString ==null)
//        {
//            Log.e("Json return error","the String returned is null")
//        }else{
//            val gson = Gson()
//            val listPersonType = object : TypeToken<List<Person>>() {}.type
//
//            var persons: List<Person> = gson.fromJson(jsonFileString, listPersonType)
//            persons.forEachIndexed { idx, person -> Log.i("data", "> Item $idx:\n$person") }
//        }


        val jsonFileString = getJsonDataFromAsset(applicationContext, "data_recipe.json")

        if (jsonFileString ==null)
        {
            Log.e("Json return error","the String returned is null")
        } else {
            Log.i("data", jsonFileString)
            val gson = Gson()
            val listRecipeType = object : TypeToken<List<Recipe>>() {}.type

            var recipes: List<Recipe> = gson.fromJson(jsonFileString, listRecipeType)
            recipes.forEachIndexed { idx, recipe -> Log.i("data", "> Item $idx:\n$recipe") }
        }






//        try {
//            val fr = FileReader("res/raw/data_recipe.json")
//            val recipeList: List<Recipe> = gson.fromJson(fr, Array<Recipe>::class.java).toList()
//            System.out.println("list recipe$recipeList")
//            print(recipeList)
//
//            var recipe1 = recipeList[1]
//            println(recipe1)
//
//        } catch (e: FileNotFoundException) {
//        }

//        val data = JsonReadUtils.getInstance().get(AppConfig.application!!, R.raw.data_recipe)
//        val type = object : TypeToken<List<Recipe>>(){}.type
//        val listBe: List<Recipe> = Gson().fromJson(data, type)

    }



//    fun getRecipeObjectFromJson(): List<Recipe> {
//
////        var stringReader: StringReader = StringReader(jsonStr)
////        var jsonReader: JsonReader = JsonReader(stringReader)
////
////        val gsonBuilder = GsonBuilder().serializeNulls()
////        gsonBuilder.registerTypeAdapter(Recipe::class.java, WeatherDeserializer())
//
////        val gson = gsonBuilder.create()
//
//
//
//
//        try {
//            val fr = FileReader("res/raw/data_recipe.json")
//            val recipeList: List<Recipe> = gson.fromJson(fr, Array<Recipe>::class.java).toList()
//            return recipeList
//        } catch (e: FileNotFoundException) {
//        }
//
//        return null
//    }
}
