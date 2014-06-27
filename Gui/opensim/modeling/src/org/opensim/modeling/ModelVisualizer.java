/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelVisualizer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ModelVisualizer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelVisualizer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public void show(State state) {
    opensimModelJNI.ModelVisualizer_show(swigCPtr, this, State.getCPtr(state), state);
  }

  public SWIGTYPE_p_SimTK__Visualizer__InputSilo getInputSilo() {
    return new SWIGTYPE_p_SimTK__Visualizer__InputSilo(opensimModelJNI.ModelVisualizer_getInputSilo(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Visualizer__InputSilo updInputSilo() {
    return new SWIGTYPE_p_SimTK__Visualizer__InputSilo(opensimModelJNI.ModelVisualizer_updInputSilo(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Visualizer getSimbodyVisualizer() {
    return new SWIGTYPE_p_SimTK__Visualizer(opensimModelJNI.ModelVisualizer_getSimbodyVisualizer(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Visualizer updSimbodyVisualizer() {
    return new SWIGTYPE_p_SimTK__Visualizer(opensimModelJNI.ModelVisualizer_updSimbodyVisualizer(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__DefaultGeometry getGeometryDecorationGenerator() {
    long cPtr = opensimModelJNI.ModelVisualizer_getGeometryDecorationGenerator(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__DefaultGeometry(cPtr, false);
  }

  public Model getModel() {
    return new Model(opensimModelJNI.ModelVisualizer_getModel(swigCPtr, this), false);
  }

  public Model updModel() {
    return new Model(opensimModelJNI.ModelVisualizer_updModel(swigCPtr, this), false);
  }

  public boolean findGeometryFile(String geoFile, SWIGTYPE_p_bool isAbsolute, SWIGTYPE_p_SimTK__Array_T_std__string_unsigned_int_t attempts) {
    return opensimModelJNI.ModelVisualizer_findGeometryFile(swigCPtr, this, geoFile, SWIGTYPE_p_bool.getCPtr(isAbsolute), SWIGTYPE_p_SimTK__Array_T_std__string_unsigned_int_t.getCPtr(attempts));
  }

}
