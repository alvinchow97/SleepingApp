package com.example.sleepingapp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UsefulDAO {
    @Insert
    suspend fun insertUseFul(useful: Useful)
    @Query("SELECT * FROM USEFUL")
    suspend fun getAllUseful():LiveData<List<Useful>>
    @Query("SELECT * FROM useful WHERE id = :useful_id")
    suspend fun getAUseful(useful_id:Int)

    @Update
    suspend fun updateUseful(useful: Useful)

    @Delete
    suspend fun deleteUseful(useful: Useful)

}