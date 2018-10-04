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

// Fast Binary Encoding OptionalEnumSimple array final model class
class FinalModelArrayOptionalEnumSimple(buffer: Buffer, offset: Long, private val _size: Long) : FinalModel(buffer, offset)
{
    private val _model = FinalModelOptionalEnumSimple(buffer, offset)

    // Get the allocation size
    fun FBEAllocationSize(values: Array<EnumSimple?>): Long {
        var size: Long = 0
        var i: Long = 0
        while (i < values.size && i < _size) {
            size += _model.FBEAllocationSize(values[i.toInt()])
            i++
        }
        return size
    }
    fun FBEAllocationSize(values: ArrayList<EnumSimple?>): Long {
        var size: Long = 0
        var i: Long = 0
        while (i < values.size && i < _size) {
            size += _model.FBEAllocationSize(values[i.toInt()])
            i++
        }
        return size
    }

    // Check if the array is valid
    override fun verify(): Long {
        if (_buffer.offset + FBEOffset > _buffer.size)
            return Long.MAX_VALUE

        var size: Long = 0
        _model.FBEOffset = FBEOffset
        var i = _size
        while (i-- > 0) {
            val offset = _model.verify()
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _model.FBEShift(offset)
            size += offset
        }
        return size
    }

    // Get the array
    fun get(size: Size): Array<EnumSimple?> {
        val values = arrayOfNulls<EnumSimple?>(_size.toInt())

        assert(_buffer.offset + FBEOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset > _buffer.size) {
            size.value = 0
            return values
        }

        size.value = 0
        val offset = Size()
        _model.FBEOffset = FBEOffset
        for (i in 0 until _size) {
            offset.value = 0
            values[i.toInt()] = _model.get(offset)
            _model.FBEShift(offset.value)
            size.value += offset.value
        }
        return values
    }

    // Get the array
    fun get(values: Array<EnumSimple?>): Long {
        assert(_buffer.offset + FBEOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset > _buffer.size)
            return 0

        var size: Long = 0
        val offset = Size()
        _model.FBEOffset = FBEOffset
        var i: Long = 0
        while (i < values.size && i < _size) {
            offset.value = 0
            values[i.toInt()] = _model.get(offset)
            _model.FBEShift(offset.value)
            size += offset.value
            i++
        }
        return size
    }

    // Get the array as ArrayList
    fun get(values: ArrayList<EnumSimple?>): Long {
        values.clear()

        assert(_buffer.offset + FBEOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset > _buffer.size)
            return 0

        values.ensureCapacity(_size.toInt())

        var size: Long = 0
        val offset = Size()
        _model.FBEOffset = FBEOffset
        var i = _size
        while (i-- > 0) {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.FBEShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Set the array
    fun set(values: Array<EnumSimple?>): Long {
        assert(_buffer.offset + FBEOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset > _buffer.size)
            return 0

        var size: Long = 0
        _model.FBEOffset = FBEOffset
        var i: Long = 0
        while (i < values.size && i < _size) {
            val offset = _model.set(values[i.toInt()])
            _model.FBEShift(offset)
            size += offset
            i++
        }
        return size
    }

    // Set the array as List
    fun set(values: ArrayList<EnumSimple?>): Long {
        assert(_buffer.offset + FBEOffset <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset > _buffer.size)
            return 0

        var size: Long = 0
        _model.FBEOffset = FBEOffset
        var i: Long = 0
        while (i < values.size && i < _size) {
            val offset = _model.set(values[i.toInt()])
            _model.FBEShift(offset)
            size += offset
            i++
        }
        return size
    }
}
