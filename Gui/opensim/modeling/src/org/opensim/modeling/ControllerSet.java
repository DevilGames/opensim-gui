/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ControllerSet extends ModelComponentSetControllers {
  private transient long swigCPtr;

  public ControllerSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ControllerSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ControllerSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ControllerSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ControllerSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ControllerSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ControllerSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ControllerSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ControllerSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ControllerSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ControllerSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ControllerSet_getConcreteClassName(swigCPtr, this);
  }

  public ControllerSet() {
    this(opensimSimulationJNI.new_ControllerSet__SWIG_0(), true);
  }

  public ControllerSet(Model model) {
    this(opensimSimulationJNI.new_ControllerSet__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ControllerSet(ControllerSet aControllerSet) {
    this(opensimSimulationJNI.new_ControllerSet__SWIG_2(ControllerSet.getCPtr(aControllerSet), aControllerSet), true);
  }

  public ControllerSet(Model model, String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_ControllerSet__SWIG_3(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public ControllerSet(Model model, String aFileName) {
    this(opensimSimulationJNI.new_ControllerSet__SWIG_4(Model.getCPtr(model), model, aFileName), true);
  }

  public void copyData(ControllerSet aAbsControllerSet) {
    opensimSimulationJNI.ControllerSet_copyData(swigCPtr, this, ControllerSet.getCPtr(aAbsControllerSet), aAbsControllerSet);
  }

  public void constructStorage() {
    opensimSimulationJNI.ControllerSet_constructStorage(swigCPtr, this);
  }

  public void storeControls(State s, int step) {
    opensimSimulationJNI.ControllerSet_storeControls(swigCPtr, this, State.getCPtr(s), s, step);
  }

  public void printControlStorage(String fileName) {
    opensimSimulationJNI.ControllerSet_printControlStorage(swigCPtr, this, fileName);
  }

  public TimeSeriesTable getControlTable() {
    return new TimeSeriesTable(opensimSimulationJNI.ControllerSet_getControlTable(swigCPtr, this), true);
  }

  public void setActuators(SetActuators actuators) {
    opensimSimulationJNI.ControllerSet_setActuators(swigCPtr, this, SetActuators.getCPtr(actuators), actuators);
  }

  public void setDesiredStates(Storage yStore) {
    opensimSimulationJNI.ControllerSet_setDesiredStates(swigCPtr, this, Storage.getCPtr(yStore), yStore);
  }

  public void computeControls(State s, Vector controls) {
    opensimSimulationJNI.ControllerSet_computeControls(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(controls), controls);
  }

  public void printInfo() {
    opensimSimulationJNI.ControllerSet_printInfo(swigCPtr, this);
  }

}
