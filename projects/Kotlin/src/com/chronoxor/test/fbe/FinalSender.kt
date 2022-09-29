//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding com.chronoxor.test final sender
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class FinalSender : com.chronoxor.fbe.Sender, IFinalSenderListener
{
    // Imported senders
    val protoSender: com.chronoxor.proto.fbe.FinalSender

    // Sender models accessors

    constructor() : super(true)
    {
        protoSender = com.chronoxor.proto.fbe.FinalSender(buffer)
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, true)
    {
        protoSender = com.chronoxor.proto.fbe.FinalSender(buffer)
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: IFinalSenderListener, obj: Any): Long
    {

        // Try to send using imported senders
        @Suppress("CanBeVal")
        var result: Long
        result = protoSender.sendListener(listener, obj)
        if (result > 0)
            return result

        return 0
    }

}
