package com.andreabonatti92.bluetoothchat.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.andreabonatti92.bluetoothchat.domain.chat.BluetoothDeviceDomain

// we suppress the warning because we do the required control outside of this file
/// but android is not smart enough to understand that
@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}