// automatically generated, do not modify

package flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public class EulerXYZd extends Struct {
  public EulerXYZd __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public double rx() { return bb.getDouble(bb_pos + 0); }
  public double ry() { return bb.getDouble(bb_pos + 8); }
  public double rz() { return bb.getDouble(bb_pos + 16); }

  public static int createEulerXYZd(FlatBufferBuilder builder, double rx, double ry, double rz) {
    builder.prep(8, 24);
    builder.putDouble(rz);
    builder.putDouble(ry);
    builder.putDouble(rx);
    return builder.offset();
  }
};
