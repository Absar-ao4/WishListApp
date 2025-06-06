package com.absar.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long=0L,
    @ColumnInfo(name = "wish-title")
    val title: String="",
    @ColumnInfo(name = "wish-desc")
    val description:String=""
)


object DummyWish{
    val wishList= listOf(
        Wish(title = "Google Watch 2 ",
            description = "An android watch"),
        Wish(title = "Frooti",
            description = "Mango juice"),
        Wish(title = "A Sci-Fi Book",
            description = "Book"),
        Wish(title = "PS5 Plus",
            description = "Gta6 khelna hai")
    )
}