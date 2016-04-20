/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimestampLessThanEqualToPrevious extends InvalidTimestamp {
  private transient long swigCPtr;

  public TimestampLessThanEqualToPrevious(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TimestampLessThanEqualToPrevious_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TimestampLessThanEqualToPrevious obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_TimestampLessThanEqualToPrevious(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimestampLessThanEqualToPrevious(String file, long line, String func, long rowIndex, double new_timestamp, double prev_timestamp) {
    this(opensimModelCommonJNI.new_TimestampLessThanEqualToPrevious(file, line, func, rowIndex, new_timestamp, prev_timestamp), true);
  }

}
