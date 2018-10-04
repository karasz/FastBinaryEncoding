// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding String->FlagsSimple map final model class
class FinalModelMapStringFlagsSimple(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    private val _modelKey = FinalModelString(buffer, offset)
    private val _modelValue = FinalModelFlagsSimple(buffer, offset)

    // Get the allocation size
    fun FBEAllocationSize(values: TreeMap<String, FlagsSimple>): Long {
        var size: Long = 4
        for ((key, value1) in values) {
            size += _modelKey.FBEAllocationSize(key)
            size += _modelValue.FBEAllocationSize(value1)
        }
        return size
    }
    fun FBEAllocationSize(values: HashMap<String, FlagsSimple>): Long {
        var size: Long = 4
        for ((key, value1) in values) {
            size += _modelKey.FBEAllocationSize(key)
            size += _modelValue.FBEAllocationSize(value1)
        }
        return size
    }

    // Check if the map is valid
    override fun verify(): Long {
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return Long.MAX_VALUE

        val fbeMapSize = readInt32(FBEOffset).toLong()

        var size: Long = 4
        _modelKey.FBEOffset = FBEOffset + 4
        _modelValue.FBEOffset = FBEOffset + 4
        var i = fbeMapSize
        while (i-- > 0) {
            val offsetKey = _modelKey.verify()
            if (offsetKey == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _modelKey.FBEShift(offsetKey)
            _modelValue.FBEShift(offsetKey)
            size += offsetKey
            val offsetValue = _modelValue.verify()
            if (offsetValue == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _modelKey.FBEShift(offsetValue)
            _modelValue.FBEShift(offsetValue)
            size += offsetValue
        }
        return size
    }

    // Get the map as TreeMap
    fun get(values: TreeMap<String, FlagsSimple>): Long {
        values.clear()

        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        val fbeMapSize = readInt32(FBEOffset).toLong()
        if (fbeMapSize == 0L)
            return 4

        var size: Long = 4
        val offset = Size()
        _modelKey.FBEOffset = FBEOffset + 4
        _modelValue.FBEOffset = FBEOffset + 4
        var i = fbeMapSize
        while (i-- > 0) {
            offset.value = 0
            val key = _modelKey.get(offset)
            _modelKey.FBEShift(offset.value)
            _modelValue.FBEShift(offset.value)
            size += offset.value
            offset.value = 0
            val value = _modelValue.get(offset)
            _modelKey.FBEShift(offset.value)
            _modelValue.FBEShift(offset.value)
            size += offset.value
            values[key] = value
        }
        return size
    }

    // Get the map as HashMap
    fun get(values: HashMap<String, FlagsSimple>): Long {
        values.clear()

        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        val fbeMapSize = readInt32(FBEOffset).toLong()
        if (fbeMapSize == 0L)
            return 4

        var size: Long = 4
        val offset = Size()
        _modelKey.FBEOffset = FBEOffset + 4
        _modelValue.FBEOffset = FBEOffset + 4
        var i = fbeMapSize
        while (i-- > 0) {
            offset.value = 0
            val key = _modelKey.get(offset)
            _modelKey.FBEShift(offset.value)
            _modelValue.FBEShift(offset.value)
            size += offset.value
            offset.value = 0
            val value = _modelValue.get(offset)
            _modelKey.FBEShift(offset.value)
            _modelValue.FBEShift(offset.value)
            size += offset.value

            values[key] = value
        }
        return size
    }

    // Set the map as TreeMap
    fun set(values: TreeMap<String, FlagsSimple>): Long {
        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        write(FBEOffset, values.size)

        var size: Long = 4
        _modelKey.FBEOffset = FBEOffset + 4
        _modelValue.FBEOffset = FBEOffset + 4
        for ((key, value1) in values) {
            val offsetKey = _modelKey.set(key)
            _modelKey.FBEShift(offsetKey)
            _modelValue.FBEShift(offsetKey)
            val offsetValue = _modelValue.set(value1)
            _modelKey.FBEShift(offsetValue)
            _modelValue.FBEShift(offsetValue)
            size += offsetKey + offsetValue
        }
        return size
    }

    // Set the vector as HashMap
    fun set(values: HashMap<String, FlagsSimple>): Long {
        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        write(FBEOffset, values.size)

        var size: Long = 4
        _modelKey.FBEOffset = FBEOffset + 4
        _modelValue.FBEOffset = FBEOffset + 4
        for ((key, value1) in values) {
            val offsetKey = _modelKey.set(key)
            _modelKey.FBEShift(offsetKey)
            _modelValue.FBEShift(offsetKey)
            val offsetValue = _modelValue.set(value1)
            _modelKey.FBEShift(offsetValue)
            _modelValue.FBEShift(offsetValue)
            size += offsetKey + offsetValue
        }
        return size
    }
}
