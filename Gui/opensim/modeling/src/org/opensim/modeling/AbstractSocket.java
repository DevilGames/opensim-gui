/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractSocket {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public AbstractSocket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractSocket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_AbstractSocket(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AbstractSocket clone() {
    long cPtr = opensimCommonJNI.AbstractSocket_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractSocket(cPtr, true);
  }

  public String getName() {
    return opensimCommonJNI.AbstractSocket_getName(swigCPtr, this);
  }

  public Stage getConnectAtStage() {
    return new Stage(opensimCommonJNI.AbstractSocket_getConnectAtStage(swigCPtr, this), true);
  }

  public boolean isListSocket() {
    return opensimCommonJNI.AbstractSocket_isListSocket(swigCPtr, this);
  }

  public long getNumConnectees() {
    return opensimCommonJNI.AbstractSocket_getNumConnectees(swigCPtr, this);
  }

  public boolean isConnected() {
    return opensimCommonJNI.AbstractSocket_isConnected(swigCPtr, this);
  }

  public String getConnecteeTypeName() {
    return opensimCommonJNI.AbstractSocket_getConnecteeTypeName(swigCPtr, this);
  }

  public OpenSimObject getConnecteeAsObject() {
    return new OpenSimObject(opensimCommonJNI.AbstractSocket_getConnecteeAsObject(swigCPtr, this), false);
  }

  public void connect(OpenSimObject connectee) {
    opensimCommonJNI.AbstractSocket_connect(swigCPtr, this, OpenSimObject.getCPtr(connectee), connectee);
  }

  public void findAndConnect(Component root) {
    opensimCommonJNI.AbstractSocket_findAndConnect(swigCPtr, this, Component.getCPtr(root), root);
  }

  public void disconnect() {
    opensimCommonJNI.AbstractSocket_disconnect(swigCPtr, this);
  }

  public void setConnecteeName(String name) {
    opensimCommonJNI.AbstractSocket_setConnecteeName__SWIG_0(swigCPtr, this, name);
  }

  public void setConnecteeName(String name, long ix) {
    opensimCommonJNI.AbstractSocket_setConnecteeName__SWIG_1(swigCPtr, this, name, ix);
  }

  public String getConnecteeName() {
    return opensimCommonJNI.AbstractSocket_getConnecteeName__SWIG_0(swigCPtr, this);
  }

  public String getConnecteeName(long ix) {
    return opensimCommonJNI.AbstractSocket_getConnecteeName__SWIG_1(swigCPtr, this, ix);
  }

  public void appendConnecteeName(String name) {
    opensimCommonJNI.AbstractSocket_appendConnecteeName(swigCPtr, this, name);
  }

}
