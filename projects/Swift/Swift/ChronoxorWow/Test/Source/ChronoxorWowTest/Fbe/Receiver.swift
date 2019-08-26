// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

import Foundation
import ChronoxorWowFbe
import ChronoxorWowProto

// Fast Binary Encoding ChronoxorWowTest receiver
open class Receiver : ChronoxorWowFbe.ReceiverProtocol {
    // Imported receivers
    let ProtoReceiver: ChronoxorWowProto.Receiver?

    // Receiver values accessors
    private var StructSimpleValue: ChronoxorWowTest.StructSimple
    private var StructOptionalValue: ChronoxorWowTest.StructOptional
    private var StructNestedValue: ChronoxorWowTest.StructNested
    private var StructBytesValue: ChronoxorWowTest.StructBytes
    private var StructArrayValue: ChronoxorWowTest.StructArray
    private var StructVectorValue: ChronoxorWowTest.StructVector
    private var StructListValue: ChronoxorWowTest.StructList
    private var StructSetValue: ChronoxorWowTest.StructSet
    private var StructMapValue: ChronoxorWowTest.StructMap
    private var StructHashValue: ChronoxorWowTest.StructHash
    private var StructHashExValue: ChronoxorWowTest.StructHashEx
    private var StructEmptyValue: ChronoxorWowTest.StructEmpty

    // Receiver models accessors
    private var StructSimpleModel: StructSimpleModel
    private var StructOptionalModel: StructOptionalModel
    private var StructNestedModel: StructNestedModel
    private var StructBytesModel: StructBytesModel
    private var StructArrayModel: StructArrayModel
    private var StructVectorModel: StructVectorModel
    private var StructListModel: StructListModel
    private var StructSetModel: StructSetModel
    private var StructMapModel: StructMapModel
    private var StructHashModel: StructHashModel
    private var StructHashExModel: StructHashExModel
    private var StructEmptyModel: StructEmptyModel

    public var buffer: Buffer = Buffer()
    public var logging: Bool = false
    public var final: Bool = false

    public init() {
        ProtoReceiver = ChronoxorWowProto.Receiver(buffer: buffer)
        StructSimpleValue = ChronoxorWowTest.StructSimple()
        StructSimpleModel = ChronoxorWowTest.StructSimpleModel()
        StructOptionalValue = ChronoxorWowTest.StructOptional()
        StructOptionalModel = ChronoxorWowTest.StructOptionalModel()
        StructNestedValue = ChronoxorWowTest.StructNested()
        StructNestedModel = ChronoxorWowTest.StructNestedModel()
        StructBytesValue = ChronoxorWowTest.StructBytes()
        StructBytesModel = ChronoxorWowTest.StructBytesModel()
        StructArrayValue = ChronoxorWowTest.StructArray()
        StructArrayModel = ChronoxorWowTest.StructArrayModel()
        StructVectorValue = ChronoxorWowTest.StructVector()
        StructVectorModel = ChronoxorWowTest.StructVectorModel()
        StructListValue = ChronoxorWowTest.StructList()
        StructListModel = ChronoxorWowTest.StructListModel()
        StructSetValue = ChronoxorWowTest.StructSet()
        StructSetModel = ChronoxorWowTest.StructSetModel()
        StructMapValue = ChronoxorWowTest.StructMap()
        StructMapModel = ChronoxorWowTest.StructMapModel()
        StructHashValue = ChronoxorWowTest.StructHash()
        StructHashModel = ChronoxorWowTest.StructHashModel()
        StructHashExValue = ChronoxorWowTest.StructHashEx()
        StructHashExModel = ChronoxorWowTest.StructHashExModel()
        StructEmptyValue = ChronoxorWowTest.StructEmpty()
        StructEmptyModel = ChronoxorWowTest.StructEmptyModel()
        build(final: false)
    }

    public init(buffer: ChronoxorWowFbe.Buffer) {
        ProtoReceiver = ChronoxorWowProto.Receiver(buffer: buffer)
        StructSimpleValue = ChronoxorWowTest.StructSimple()
        StructSimpleModel = ChronoxorWowTest.StructSimpleModel()
        StructOptionalValue = ChronoxorWowTest.StructOptional()
        StructOptionalModel = ChronoxorWowTest.StructOptionalModel()
        StructNestedValue = ChronoxorWowTest.StructNested()
        StructNestedModel = ChronoxorWowTest.StructNestedModel()
        StructBytesValue = ChronoxorWowTest.StructBytes()
        StructBytesModel = ChronoxorWowTest.StructBytesModel()
        StructArrayValue = ChronoxorWowTest.StructArray()
        StructArrayModel = ChronoxorWowTest.StructArrayModel()
        StructVectorValue = ChronoxorWowTest.StructVector()
        StructVectorModel = ChronoxorWowTest.StructVectorModel()
        StructListValue = ChronoxorWowTest.StructList()
        StructListModel = ChronoxorWowTest.StructListModel()
        StructSetValue = ChronoxorWowTest.StructSet()
        StructSetModel = ChronoxorWowTest.StructSetModel()
        StructMapValue = ChronoxorWowTest.StructMap()
        StructMapModel = ChronoxorWowTest.StructMapModel()
        StructHashValue = ChronoxorWowTest.StructHash()
        StructHashModel = ChronoxorWowTest.StructHashModel()
        StructHashExValue = ChronoxorWowTest.StructHashEx()
        StructHashExModel = ChronoxorWowTest.StructHashExModel()
        StructEmptyValue = ChronoxorWowTest.StructEmpty()
        StructEmptyModel = ChronoxorWowTest.StructEmptyModel()
        build(with: buffer, final: false)
    }

    public func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        return onReceiveListener(listener: self as! ReceiverListener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorWowTest.StructSimpleModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructSimpleModel.attach(buffer: buffer, offset: offset)
            assert(StructSimpleModel.verify(), "Test.StructSimple validation failed!")
            let deserialized = StructSimpleModel.deserialize(value: &StructSimpleValue)
            assert(deserialized > 0, "Test.StructSimple deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructSimpleValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructSimpleValue)
            return true
        case ChronoxorWowTest.StructOptionalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructOptionalModel.attach(buffer: buffer, offset: offset)
            assert(StructOptionalModel.verify(), "Test.StructOptional validation failed!")
            let deserialized = StructOptionalModel.deserialize(value: &StructOptionalValue)
            assert(deserialized > 0, "Test.StructOptional deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructOptionalValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructOptionalValue)
            return true
        case ChronoxorWowTest.StructNestedModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructNestedModel.attach(buffer: buffer, offset: offset)
            assert(StructNestedModel.verify(), "Test.StructNested validation failed!")
            let deserialized = StructNestedModel.deserialize(value: &StructNestedValue)
            assert(deserialized > 0, "Test.StructNested deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructNestedValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructNestedValue)
            return true
        case ChronoxorWowTest.StructBytesModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructBytesModel.attach(buffer: buffer, offset: offset)
            assert(StructBytesModel.verify(), "Test.StructBytes validation failed!")
            let deserialized = StructBytesModel.deserialize(value: &StructBytesValue)
            assert(deserialized > 0, "Test.StructBytes deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructBytesValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructBytesValue)
            return true
        case ChronoxorWowTest.StructArrayModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructArrayModel.attach(buffer: buffer, offset: offset)
            assert(StructArrayModel.verify(), "Test.StructArray validation failed!")
            let deserialized = StructArrayModel.deserialize(value: &StructArrayValue)
            assert(deserialized > 0, "Test.StructArray deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructArrayValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructArrayValue)
            return true
        case ChronoxorWowTest.StructVectorModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructVectorModel.attach(buffer: buffer, offset: offset)
            assert(StructVectorModel.verify(), "Test.StructVector validation failed!")
            let deserialized = StructVectorModel.deserialize(value: &StructVectorValue)
            assert(deserialized > 0, "Test.StructVector deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructVectorValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructVectorValue)
            return true
        case ChronoxorWowTest.StructListModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructListModel.attach(buffer: buffer, offset: offset)
            assert(StructListModel.verify(), "Test.StructList validation failed!")
            let deserialized = StructListModel.deserialize(value: &StructListValue)
            assert(deserialized > 0, "Test.StructList deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructListValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructListValue)
            return true
        case ChronoxorWowTest.StructSetModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructSetModel.attach(buffer: buffer, offset: offset)
            assert(StructSetModel.verify(), "Test.StructSet validation failed!")
            let deserialized = StructSetModel.deserialize(value: &StructSetValue)
            assert(deserialized > 0, "Test.StructSet deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructSetValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructSetValue)
            return true
        case ChronoxorWowTest.StructMapModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructMapModel.attach(buffer: buffer, offset: offset)
            assert(StructMapModel.verify(), "Test.StructMap validation failed!")
            let deserialized = StructMapModel.deserialize(value: &StructMapValue)
            assert(deserialized > 0, "Test.StructMap deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructMapValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructMapValue)
            return true
        case ChronoxorWowTest.StructHashModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructHashModel.attach(buffer: buffer, offset: offset)
            assert(StructHashModel.verify(), "Test.StructHash validation failed!")
            let deserialized = StructHashModel.deserialize(value: &StructHashValue)
            assert(deserialized > 0, "Test.StructHash deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructHashValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructHashValue)
            return true
        case ChronoxorWowTest.StructHashExModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructHashExModel.attach(buffer: buffer, offset: offset)
            assert(StructHashExModel.verify(), "Test.StructHashEx validation failed!")
            let deserialized = StructHashExModel.deserialize(value: &StructHashExValue)
            assert(deserialized > 0, "Test.StructHashEx deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructHashExValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructHashExValue)
            return true
        case ChronoxorWowTest.StructEmptyModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            StructEmptyModel.attach(buffer: buffer, offset: offset)
            assert(StructEmptyModel.verify(), "Test.StructEmpty validation failed!")
            let deserialized = StructEmptyModel.deserialize(value: &StructEmptyValue)
            assert(deserialized > 0, "Test.StructEmpty deserialization failed!")

            // Log the value
            if (logging)
            {
                let message = StructEmptyValue.description
                onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: StructEmptyValue)
            return true
        default: break
        }

        if let ProtoReceiver = ProtoReceiver, ProtoReceiver.onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size) {
            return true
        }

        return false
    }
}
