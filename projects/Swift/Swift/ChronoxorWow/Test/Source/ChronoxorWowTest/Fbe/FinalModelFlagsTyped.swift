// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

import ChronoxorWowFbe

// Fast Binary Encoding FlagsTyped final model
public class FinalModelFlagsTyped: FinalModel {

    public var _buffer: Buffer
    public var _offset: Int

    // Final size
    public let fbeSize: Int = 8

    public init(buffer: Buffer = Buffer(), offset: Int = 0) {
        _buffer = buffer
        _offset = offset
    }

    // Get the allocation size
    public func fbeAllocationSize(value: FlagsTyped) -> Int { fbeSize }

    public func verify() -> Int  {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> FlagsTyped {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return FlagsTyped()
        }

        size.value = fbeSize
        return FlagsTyped(value: readUInt64(offset: fbeOffset))
    }

    // Set the value
    public func set(value: FlagsTyped) throws -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: value.raw)
        return fbeSize
    }
}
