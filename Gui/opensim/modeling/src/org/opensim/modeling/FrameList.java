/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FrameList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public FrameList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(FrameList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_FrameList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FrameList(Component root, ComponentFilter f) {
    this(opensimModelSimulationJNI.new_FrameList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public FrameList(Component root) {
    this(opensimModelSimulationJNI.new_FrameList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public FrameIterator begin() {
    return new FrameIterator(opensimModelSimulationJNI.FrameList_begin(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimModelSimulationJNI.FrameList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

  public FrameIterator end() {
    return new FrameIterator(opensimModelSimulationJNI.FrameList_end(swigCPtr, this), true);
  }

}
