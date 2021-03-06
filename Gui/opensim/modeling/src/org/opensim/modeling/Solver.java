/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Solver extends OpenSimObject {
  private transient long swigCPtr;

  public Solver(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Solver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Solver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Solver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Solver safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Solver_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Solver(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Solver_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Solver_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Solver_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Solver(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Solver_getConcreteClassName(swigCPtr, this);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.Solver_getModel(swigCPtr, this), false);
  }

}
