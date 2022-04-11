//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding com.chronoxor.test final client
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class FinalClient : com.chronoxor.fbe.Client, IFinalClientListener
{
    // Imported clients
    val protoClient: com.chronoxor.proto.fbe.FinalClient

    // Client sender models accessors

    // Client receiver values accessors

    // Client receiver models accessors

    constructor() : super(true)
    {
        protoClient = com.chronoxor.proto.fbe.FinalClient(sendBuffer, receiveBuffer)
    }

    constructor(sendBuffer: com.chronoxor.fbe.Buffer, receiveBuffer: com.chronoxor.fbe.Buffer) : super(sendBuffer, receiveBuffer, true)
    {
        protoClient = com.chronoxor.proto.fbe.FinalClient(sendBuffer, receiveBuffer)
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: IFinalClientListener, obj: Any): Long
    {

        // Try to send using imported clients
        @Suppress("CanBeVal")
        var result: Long
        result = protoClient.sendListener(listener, obj)
        if (result > 0)
            return result

        return 0
    }


    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IFinalClientListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {

        if (protoClient.onReceiveListener(listener, type, buffer, offset, size))
            return true

        return false
    }
}
