/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetProbes extends ModelComponent {
  private transient long swigCPtr;

  public SetProbes(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetProbes_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetProbes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetProbes(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetProbes safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetProbes_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetProbes(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetProbes_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetProbes_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetProbes_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetProbes(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetProbes_getConcreteClassName(swigCPtr, this);
  }

  public SetProbes() {
    this(opensimSimulationJNI.new_SetProbes__SWIG_0(), true);
  }

  public SetProbes(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetProbes__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetProbes(String aFileName) {
    this(opensimSimulationJNI.new_SetProbes__SWIG_2(aFileName), true);
  }

  public SetProbes(SetProbes aSet) {
    this(opensimSimulationJNI.new_SetProbes__SWIG_3(SetProbes.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetProbes_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetProbes_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetProbes_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetProbes_getSize(swigCPtr, this);
  }

  public int getIndex(Probe aObject, int aStartIndex) {
    return opensimSimulationJNI.SetProbes_getIndex__SWIG_0(swigCPtr, this, Probe.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Probe aObject) {
    return opensimSimulationJNI.SetProbes_getIndex__SWIG_1(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetProbes_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetProbes_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetProbes_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Probe aObject) {
    return opensimSimulationJNI.SetProbes_adoptAndAppend(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Probe aObject) {
    return opensimSimulationJNI.SetProbes_cloneAndAppend(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Probe aObject) {
    return opensimSimulationJNI.SetProbes_insert(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetProbes_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Probe aObject) {
    return opensimSimulationJNI.SetProbes_remove__SWIG_1(swigCPtr, this, Probe.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetProbes_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Probe aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetProbes_set__SWIG_0(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Probe aObject) {
    return opensimSimulationJNI.SetProbes_set__SWIG_1(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject);
  }

  public Probe get(int aIndex) {
    return new Probe(opensimSimulationJNI.SetProbes_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Probe get(String aName) {
    return new Probe(opensimSimulationJNI.SetProbes_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetProbes_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetProbes_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetProbes_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetProbes_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetProbes_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetProbes_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetProbes_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetProbes_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetProbes_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetProbes_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
