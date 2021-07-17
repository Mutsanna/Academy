package com.mutsanna.academy.di

import android.content.Context
import com.mutsanna.academy.data.AcademyRepository
import com.mutsanna.academy.data.source.local.LocalDataSource
import com.mutsanna.academy.data.source.local.room.AcademyDatabase
import com.mutsanna.academy.data.source.remote.RemoteDataSource
import com.mutsanna.academy.utils.AppExecutors
import com.mutsanna.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}