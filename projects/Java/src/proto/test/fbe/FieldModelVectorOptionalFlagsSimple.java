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

// Fast Binary Encoding OptionalFlagsSimple vector field model class
public final class FieldModelVectorOptionalFlagsSimple extends FieldModel
{
    private final FieldModelOptionalFlagsSimple _model;

    public FieldModelVectorOptionalFlagsSimple(Buffer buffer, long offset)
    {
        super(buffer, offset);
        _model = new FieldModelOptionalFlagsSimple(buffer, offset);
    }

    // Get the field size
    @Override
    public long FBESize() { return 4; }
    // Get the field extra size
    @Override
    public long FBEExtra()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeVectorOffset = readInt32(FBEOffset());
        if ((fbeVectorOffset == 0) || ((_buffer.getOffset() + fbeVectorOffset + 4) > _buffer.getSize()))
            return 0;

        int fbeVectorSize = readInt32(fbeVectorOffset);

        long fbeResult = 4;
        _model.FBEOffset(fbeVectorOffset + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            fbeResult += _model.FBESize() + _model.FBEExtra();
            _model.FBEShift(_model.FBESize());
        }
        return fbeResult;
    }

    // Get the vector offset
    public long getOffset()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeVectorOffset = readInt32(FBEOffset());
        return fbeVectorOffset;
    }

    // Get the vector size
    public long getSize()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return 0;

        int fbeVectorOffset = readInt32(FBEOffset());
        if ((fbeVectorOffset == 0) || ((_buffer.getOffset() + fbeVectorOffset + 4) > _buffer.getSize()))
            return 0;

        int fbeVectorSize = readInt32(fbeVectorOffset);
        return fbeVectorSize;
    }

    // Vector index operator
    public FieldModelOptionalFlagsSimple getItem(long index)
    {
        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";

        int fbeVectorOffset = readInt32(FBEOffset());
        assert ((fbeVectorOffset > 0) && ((_buffer.getOffset() + fbeVectorOffset + 4) <= _buffer.getSize())) : "Model is broken!";

        int fbeVectorSize = readInt32(fbeVectorOffset);
        assert (index < fbeVectorSize) : "Index is out of bounds!";

        _model.FBEOffset(fbeVectorOffset + 4);
        _model.FBEShift(index * _model.FBESize());
        return _model;
    }

    // Resize the vector and get its first model
    public FieldModelOptionalFlagsSimple resize(long size)
    {
        int fbeVectorSize = (int)(size * _model.FBESize());
        int fbeVectorOffset = (int)(_buffer.allocate(4 + fbeVectorSize) - _buffer.getOffset());
        assert ((fbeVectorOffset > 0) && ((_buffer.getOffset() + fbeVectorOffset + 4) <= _buffer.getSize())) : "Model is broken!";

        write(FBEOffset(), fbeVectorOffset);
        write(fbeVectorOffset, (int)size);
        write(fbeVectorOffset + 4, (byte)0, fbeVectorSize);

        _model.FBEOffset(fbeVectorOffset + 4);
        return _model;
    }

    // Check if the vector is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return true;

        int fbeVectorOffset = readInt32(FBEOffset());
        if (fbeVectorOffset == 0)
            return true;

        if ((_buffer.getOffset() + fbeVectorOffset + 4) > _buffer.getSize())
            return false;

        int fbeVectorSize = readInt32(fbeVectorOffset);

        _model.FBEOffset(fbeVectorOffset + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            if (!_model.verify())
                return false;
            _model.FBEShift(_model.FBESize());
        }

        return true;
    }

    // Get the vector as ArrayList
    public void get(ArrayList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeVectorSize = getSize();
        if (fbeVectorSize == 0)
            return;

        values.ensureCapacity((int)fbeVectorSize);

        var fbeModel = getItem(0);
        for (long i = fbeVectorSize; i-- > 0;)
        {
            FlagsSimple value = fbeModel.get();
            values.add(value);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Get the vector as LinkedList
    public void get(LinkedList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeVectorSize = getSize();
        if (fbeVectorSize == 0)
            return;

        var fbeModel = getItem(0);
        for (long i = fbeVectorSize; i-- > 0;)
        {
            FlagsSimple value = fbeModel.get();
            values.add(value);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Get the vector as HashSet
    public void get(HashSet<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        long fbeVectorSize = getSize();
        if (fbeVectorSize == 0)
            return;

        var fbeModel = getItem(0);
        for (long i = fbeVectorSize; i-- > 0;)
        {
            FlagsSimple value = fbeModel.get();
            values.add(value);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Set the vector as ArrayList
    public void set(ArrayList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values)
        {
            fbeModel.set(value);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Set the vector as LinkedList
    public void set(LinkedList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values)
        {
            fbeModel.set(value);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }

    // Set the vector as HashSet
    public void set(HashSet<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + FBEOffset() + FBESize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + FBEOffset() + FBESize()) > _buffer.getSize())
            return;

        var fbeModel = resize(values.size());
        for (var value : values)
        {
            fbeModel.set(value);
            fbeModel.FBEShift(fbeModel.FBESize());
        }
    }
}
