package com.example.labtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(Args:Array<String>){
    println("Muhammad Nawaz")
    println("K18SW06")
    sort()
}
fun sort(){
    var name="MUHAMMAD NAWAZ"
    println()
    println("The Name Which I'm Going to Sort according to Alphabetical Order is: "+name)
    var arr= name.toCharArray();
    for(i in 0..13){
       for(j in i+1..13){
           if(arr[i]>arr[j]){
               var temp=arr[i]
               arr[i]=arr[j]
               arr[j]=temp
           } } }
    println()
    println("Below Is Given The Sorted version of My Name according to Alphabetical Order(ascending)")
    for(i in 0..13){
        print(arr[i])
    } }
