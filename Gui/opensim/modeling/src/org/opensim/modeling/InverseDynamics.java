/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InverseDynamics extends Analysis {
  private transient long swigCPtr;

  public InverseDynamics(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.InverseDynamics_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseDynamics obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_InverseDynamics(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static InverseDynamics safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InverseDynamics_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new InverseDynamics(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.InverseDynamics_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.InverseDynamics_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InverseDynamics_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InverseDynamics(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.InverseDynamics_getConcreteClassName(swigCPtr, this);
  }

  public InverseDynamics(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_InverseDynamics__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public InverseDynamics() {
    this(opensimActuatorsAnalysesToolsJNI.new_InverseDynamics__SWIG_1(), true);
  }

  public InverseDynamics(InverseDynamics aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_InverseDynamics__SWIG_2(InverseDynamics.getCPtr(aObject), aObject), true);
  }

  public void setStorageCapacityIncrements(int aIncrement) {
    opensimActuatorsAnalysesToolsJNI.InverseDynamics_setStorageCapacityIncrements(swigCPtr, this, aIncrement);
  }

  public Storage getStorage() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.InverseDynamics_getStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public boolean getUseModelForceSet() {
    return opensimActuatorsAnalysesToolsJNI.InverseDynamics_getUseModelForceSet(swigCPtr, this);
  }

  public void setUseModelForceSet(boolean aUseModelForceSet) {
    opensimActuatorsAnalysesToolsJNI.InverseDynamics_setUseModelForceSet(swigCPtr, this, aUseModelForceSet);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.InverseDynamics_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.InverseDynamics_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.InverseDynamics_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.InverseDynamics_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.InverseDynamics_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
