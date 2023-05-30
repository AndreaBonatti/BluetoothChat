package com.andreabonatti92.bluetoothchat.domain.chat

// We use the alias to avoid confusion with the BluetoothDevice class from android
typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    val name: String?,
    val address: String
)
