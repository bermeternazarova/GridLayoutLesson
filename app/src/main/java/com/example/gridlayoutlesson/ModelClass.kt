package com.example.gridlayoutlesson

data class ModelClass(var name :String?=null,var image:Int?=null){
    override fun toString(): String {
        return "$name"
    }
}
