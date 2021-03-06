// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class KUKAiiwaMonitorConfiguration extends Table {
  public static KUKAiiwaMonitorConfiguration getRootAsKUKAiiwaMonitorConfiguration(ByteBuffer _bb) { return getRootAsKUKAiiwaMonitorConfiguration(_bb, new KUKAiiwaMonitorConfiguration()); }
  public static KUKAiiwaMonitorConfiguration getRootAsKUKAiiwaMonitorConfiguration(ByteBuffer _bb, KUKAiiwaMonitorConfiguration obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public KUKAiiwaMonitorConfiguration __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String hardwareVersion() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer hardwareVersionAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public double torqueSensorLimits(int j) { int o = __offset(6); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int torqueSensorLimitsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer torqueSensorLimitsAsByteBuffer() { return __vector_as_bytebuffer(6, 8); }
  public boolean isReadyToMove() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean isMastered() { int o = __offset(10); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  /**
   * set kuka tablet "processData" panel UI config strings
   */
  public ProcessData processData(int j) { return processData(new ProcessData(), j); }
  public ProcessData processData(ProcessData obj, int j) { int o = __offset(12); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int processDataLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }

  public static int createKUKAiiwaMonitorConfiguration(FlatBufferBuilder builder,
      int hardwareVersionOffset,
      int torqueSensorLimitsOffset,
      boolean isReadyToMove,
      boolean isMastered,
      int processDataOffset) {
    builder.startObject(5);
    KUKAiiwaMonitorConfiguration.addProcessData(builder, processDataOffset);
    KUKAiiwaMonitorConfiguration.addTorqueSensorLimits(builder, torqueSensorLimitsOffset);
    KUKAiiwaMonitorConfiguration.addHardwareVersion(builder, hardwareVersionOffset);
    KUKAiiwaMonitorConfiguration.addIsMastered(builder, isMastered);
    KUKAiiwaMonitorConfiguration.addIsReadyToMove(builder, isReadyToMove);
    return KUKAiiwaMonitorConfiguration.endKUKAiiwaMonitorConfiguration(builder);
  }

  public static void startKUKAiiwaMonitorConfiguration(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addHardwareVersion(FlatBufferBuilder builder, int hardwareVersionOffset) { builder.addOffset(0, hardwareVersionOffset, 0); }
  public static void addTorqueSensorLimits(FlatBufferBuilder builder, int torqueSensorLimitsOffset) { builder.addOffset(1, torqueSensorLimitsOffset, 0); }
  public static int createTorqueSensorLimitsVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startTorqueSensorLimitsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addIsReadyToMove(FlatBufferBuilder builder, boolean isReadyToMove) { builder.addBoolean(2, isReadyToMove, false); }
  public static void addIsMastered(FlatBufferBuilder builder, boolean isMastered) { builder.addBoolean(3, isMastered, false); }
  public static void addProcessData(FlatBufferBuilder builder, int processDataOffset) { builder.addOffset(4, processDataOffset, 0); }
  public static int createProcessDataVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startProcessDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endKUKAiiwaMonitorConfiguration(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

