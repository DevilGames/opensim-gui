/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayStorage {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayStorage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayStorage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ArrayStorage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayStorage(int aCapacity) {
    this(opensimCommonJNI.new_ArrayStorage__SWIG_0(aCapacity), true);
  }

  public ArrayStorage() {
    this(opensimCommonJNI.new_ArrayStorage__SWIG_1(), true);
  }

  public ArrayStorage(ArrayStorage aArray) {
    this(opensimCommonJNI.new_ArrayStorage__SWIG_2(ArrayStorage.getCPtr(aArray), aArray), true);
  }

  public void clearAndDestroy() {
    opensimCommonJNI.ArrayStorage_clearAndDestroy(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimCommonJNI.ArrayStorage_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimCommonJNI.ArrayStorage_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimCommonJNI.ArrayStorage_size(swigCPtr, this);
  }

  public int getIndex(SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type aObject, int aStartIndex) {
    return opensimCommonJNI.ArrayStorage_getIndex__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type.getCPtr(aObject), aStartIndex);
  }

  public int getIndex(SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type aObject) {
    return opensimCommonJNI.ArrayStorage_getIndex__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type.getCPtr(aObject));
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimCommonJNI.ArrayStorage_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimCommonJNI.ArrayStorage_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public boolean append(Storage aObject) {
    return opensimCommonJNI.ArrayStorage_append__SWIG_0(swigCPtr, this, Storage.getCPtr(aObject), aObject);
  }

  public boolean append(ArrayStorage aArray) {
    return opensimCommonJNI.ArrayStorage_append__SWIG_1(swigCPtr, this, ArrayStorage.getCPtr(aArray), aArray);
  }

  public boolean insert(int aIndex, Storage aObject) {
    return opensimCommonJNI.ArrayStorage_insert(swigCPtr, this, aIndex, Storage.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimCommonJNI.ArrayStorage_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type aObject) {
    return opensimCommonJNI.ArrayStorage_remove__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type.getCPtr(aObject));
  }

  public boolean set(int aIndex, Storage aObject) {
    return opensimCommonJNI.ArrayStorage_set(swigCPtr, this, aIndex, Storage.getCPtr(aObject), aObject);
  }

  public Storage get(int aIndex) {
    long cPtr = opensimCommonJNI.ArrayStorage_get__SWIG_0(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage get(String aName) {
    long cPtr = opensimCommonJNI.ArrayStorage_get__SWIG_1(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getLast() {
    long cPtr = opensimCommonJNI.ArrayStorage_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type aObject, boolean aFindFirst, int aLo, int aHi) {
    return opensimCommonJNI.ArrayStorage_searchBinary__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type.getCPtr(aObject), aFindFirst, aLo, aHi);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type aObject, boolean aFindFirst, int aLo) {
    return opensimCommonJNI.ArrayStorage_searchBinary__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type.getCPtr(aObject), aFindFirst, aLo);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type aObject, boolean aFindFirst) {
    return opensimCommonJNI.ArrayStorage_searchBinary__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type.getCPtr(aObject), aFindFirst);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type aObject) {
    return opensimCommonJNI.ArrayStorage_searchBinary__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__Storage_t__type.getCPtr(aObject));
  }

}
