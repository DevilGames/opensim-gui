/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FileAdapter extends DataAdapter {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.FileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_FileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static StdMapStringAbstractDataTable readFile(String fileName) {
    return new StdMapStringAbstractDataTable(opensimCommonJNI.FileAdapter_readFile(fileName), true);
  }

  public static void writeFile(SWIGTYPE_p_std__mapT_std__string_OpenSim__AbstractDataTable_const_p_t tables, String fileName) {
    opensimCommonJNI.FileAdapter_writeFile(SWIGTYPE_p_std__mapT_std__string_OpenSim__AbstractDataTable_const_p_t.getCPtr(tables), fileName);
  }

  public static String findExtension(String filename) {
    return opensimCommonJNI.FileAdapter_findExtension(filename);
  }

  public static StdVectorString getNextLine(SWIGTYPE_p_std__istream stream, String delims) {
    return new StdVectorString(opensimCommonJNI.FileAdapter_getNextLine(SWIGTYPE_p_std__istream.getCPtr(stream), delims), true);
  }

}
