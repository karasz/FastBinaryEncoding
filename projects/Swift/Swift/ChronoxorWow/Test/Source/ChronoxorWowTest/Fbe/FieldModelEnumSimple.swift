// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

import ChronoxorWowFbe

// Fast Binary Encoding EnumSimple field model
public class FieldModelEnumSimple: FieldModel {

    public var _buffer: Buffer = Buffer()
    public var _offset: Int = 0

    public var fbeSize: Int = 4

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    // Get the value
    public func get(defaults: EnumSimple = EnumSimple()) -> EnumSimple {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return defaults
        }

        return EnumSimple(value: readInt32(offset: fbeOffset))
    }

    // Set the value
    public func set(value: EnumSimple) throws {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size) {
            assertionFailure("Model is broken!")
            return
        }

        write(offset: fbeOffset, value: value.raw)
    }
}
