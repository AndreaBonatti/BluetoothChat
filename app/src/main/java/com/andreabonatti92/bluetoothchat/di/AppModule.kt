package com.andreabonatti92.bluetoothchat.di

import android.content.Context
import com.andreabonatti92.bluetoothchat.data.chat.AndroidBluetoothController
import com.andreabonatti92.bluetoothchat.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context): BluetoothController {
        return AndroidBluetoothController(context = context)
    }
}