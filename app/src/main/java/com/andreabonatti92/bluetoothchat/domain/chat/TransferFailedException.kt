package com.andreabonatti92.bluetoothchat.domain.chat

import java.io.IOException

class TransferFailedException : IOException("Reading incoming data failed")