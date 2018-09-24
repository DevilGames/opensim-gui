/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetAnalysis extends OpenSimObject {
  private transient long swigCPtr;

  public SetAnalysis(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetAnalysis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetAnalysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetAnalysis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetAnalysis safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetAnalysis_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetAnalysis(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetAnalysis_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetAnalysis_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetAnalysis_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetAnalysis(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetAnalysis_getConcreteClassName(swigCPtr, this);
  }

  public SetAnalysis() {
    this(opensimSimulationJNI.new_SetAnalysis__SWIG_0(), true);
  }

  public SetAnalysis(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetAnalysis__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetAnalysis(String aFileName) {
    this(opensimSimulationJNI.new_SetAnalysis__SWIG_2(aFileName), true);
  }

  public SetAnalysis(SetAnalysis aSet) {
    this(opensimSimulationJNI.new_SetAnalysis__SWIG_3(SetAnalysis.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetAnalysis_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetAnalysis_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetAnalysis_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetAnalysis_getSize(swigCPtr, this);
  }

  public int getIndex(Analysis aObject, int aStartIndex) {
    return opensimSimulationJNI.SetAnalysis_getIndex__SWIG_0(swigCPtr, this, Analysis.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Analysis aObject) {
    return opensimSimulationJNI.SetAnalysis_getIndex__SWIG_1(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetAnalysis_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetAnalysis_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetAnalysis_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Analysis aObject) {
    return opensimSimulationJNI.SetAnalysis_adoptAndAppend(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Analysis aObject) {
    return opensimSimulationJNI.SetAnalysis_cloneAndAppend(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Analysis aObject) {
    return opensimSimulationJNI.SetAnalysis_insert(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetAnalysis_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Analysis aObject) {
    return opensimSimulationJNI.SetAnalysis_remove__SWIG_1(swigCPtr, this, Analysis.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetAnalysis_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Analysis aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetAnalysis_set__SWIG_0(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Analysis aObject) {
    return opensimSimulationJNI.SetAnalysis_set__SWIG_1(swigCPtr, this, aIndex, Analysis.getCPtr(aObject), aObject);
  }

  public Analysis get(int aIndex) {
    return new Analysis(opensimSimulationJNI.SetAnalysis_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Analysis get(String aName) {
    return new Analysis(opensimSimulationJNI.SetAnalysis_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetAnalysis_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetAnalysis_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetAnalysis_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetAnalysis_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetAnalysis_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetAnalysis_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetAnalysis_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetAnalysis_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetAnalysis_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetAnalysis_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
