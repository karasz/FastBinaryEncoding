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

// Fast Binary Encoding FlagsSimple vector final model class
class FinalModelVectorFlagsSimple(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    private val _model = FinalModelFlagsSimple(buffer, offset)

    // Get the allocation size
    fun FBEAllocationSize(values: ArrayList<FlagsSimple>): Long {
        var size: Long = 4
        for (value in values)
            size += _model.FBEAllocationSize(value)
        return size
    }
    fun FBEAllocationSize(values: LinkedList<FlagsSimple>): Long {
        var size: Long = 4
        for (value in values)
            size += _model.FBEAllocationSize(value)
        return size
    }
    fun FBEAllocationSize(values: HashSet<FlagsSimple>): Long {
        var size: Long = 4
        for (value in values)
            size += _model.FBEAllocationSize(value)
        return size
    }

    // Check if the vector is valid
    override fun verify(): Long {
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return Long.MAX_VALUE

        val fbeVectorSize = readInt32(FBEOffset).toLong()

        var size: Long = 4
        _model.FBEOffset = FBEOffset + 4
        var i = fbeVectorSize
        while (i-- > 0) {
            val offset = _model.verify()
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE
            _model.FBEShift(offset)
            size += offset
        }
        return size
    }

    // Get the vector as ArrayList
    fun get(values: ArrayList<FlagsSimple>): Long {
        values.clear()

        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        val fbeVectorSize = readInt32(FBEOffset).toLong()
        if (fbeVectorSize == 0L)
            return 4

        values.ensureCapacity(fbeVectorSize.toInt())

        var size: Long = 4
        val offset = Size()
        _model.FBEOffset = FBEOffset + 4
        for (i in 0 until fbeVectorSize) {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.FBEShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Get the vector as LinkedList
    fun get(values: LinkedList<FlagsSimple>): Long {
        values.clear()

        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        val fbeVectorSize = readInt32(FBEOffset).toLong()
        if (fbeVectorSize == 0L)
            return 4

        var size: Long = 4
        val offset = Size()
        _model.FBEOffset = FBEOffset + 4
        for (i in 0 until fbeVectorSize) {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.FBEShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Get the vector as HashSet
    fun get(values: HashSet<FlagsSimple>): Long {
        values.clear()

        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        val fbeVectorSize = readInt32(FBEOffset).toLong()
        if (fbeVectorSize == 0L)
            return 4

        var size: Long = 4
        val offset = Size()
        _model.FBEOffset = FBEOffset + 4
        for (i in 0 until fbeVectorSize) {
            offset.value = 0
            val value = _model.get(offset)
            values.add(value)
            _model.FBEShift(offset.value)
            size += offset.value
        }
        return size
    }

    // Set the vector as ArrayList
    fun set(values: ArrayList<FlagsSimple>): Long {
        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        write(FBEOffset, values.size)

        var size: Long = 4
        _model.FBEOffset = FBEOffset + 4
        for (value in values) {
            val offset = _model.set(value)
            _model.FBEShift(offset)
            size += offset
        }
        return size
    }

    // Set the vector as LinkedList
    fun set(values: LinkedList<FlagsSimple>): Long {
        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        write(FBEOffset, values.size)

        var size: Long = 4
        _model.FBEOffset = FBEOffset + 4
        for (value in values) {
            val offset = _model.set(value)
            _model.FBEShift(offset)
            size += offset
        }
        return size
    }

    // Set the vector as HashSet
    fun set(values: HashSet<FlagsSimple>): Long {
        assert(_buffer.offset + FBEOffset + 4 <= _buffer.size) { "Model is broken!" }
        if (_buffer.offset + FBEOffset + 4 > _buffer.size)
            return 0

        write(FBEOffset, values.size)

        var size: Long = 4
        _model.FBEOffset = FBEOffset + 4
        for (value in values) {
            val offset = _model.set(value)
            _model.FBEShift(offset)
            size += offset
        }
        return size
    }
}
