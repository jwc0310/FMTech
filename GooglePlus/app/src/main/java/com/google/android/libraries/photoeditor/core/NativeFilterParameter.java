package com.google.android.libraries.photoeditor.core;

import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameterCommon;
import efj;
import gem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NativeFilterParameter
  extends FilterParameterCommon
{
  private static final int[] a = new int[0];
  private long g;
  private NativeFilterParameter h;
  
  static
  {
    nativeInitClass();
  }
  
  public NativeFilterParameter()
  {
    int i = getFilterType();
    int[] arrayOfInt = a();
    this.g = nativeCreateDefault(i);
    f();
    int j = arrayOfInt.length;
    for (int k = 0; k < j; k++)
    {
      int m = arrayOfInt[k];
      a(m, d(m));
    }
    if (arrayOfInt.length > 0) {
      setActiveParameterKey(arrayOfInt[0]);
    }
    setActiveParameterKey(b());
  }
  
  private NativeFilterParameter(long paramLong, int[] paramArrayOfInt)
  {
    super(paramArrayOfInt, false);
    this.g = paramLong;
  }
  
  public static NativeFilterParameter a(int paramInt, int[] paramArrayOfInt)
  {
    NativeFilterParameter localNativeFilterParameter = new NativeFilterParameter(nativeCreateDefault(paramInt), paramArrayOfInt);
    for (int k : localNativeFilterParameter.g()) {
      localNativeFilterParameter.a(k, localNativeFilterParameter.d(k));
    }
    localNativeFilterParameter.f();
    return localNativeFilterParameter;
  }
  
  private void a(NativeFilterParameter paramNativeFilterParameter)
  {
    for (;;)
    {
      try
      {
        if (this.h == null)
        {
          i = 1;
          if (i != 0) {
            break;
          }
          throw new IllegalStateException();
        }
      }
      finally {}
      int i = 0;
    }
    this.h = paramNativeFilterParameter;
  }
  
  private void b(NativeFilterParameter paramNativeFilterParameter)
  {
    for (;;)
    {
      try
      {
        if (this.h == paramNativeFilterParameter)
        {
          i = 1;
          if (i != 0) {
            break;
          }
          throw new IllegalStateException();
        }
      }
      finally {}
      int i = 0;
    }
    this.h = null;
  }
  
  private final void c(NativeFilterParameter paramNativeFilterParameter)
  {
    try
    {
      nativeAddSubParameter(this.g, paramNativeFilterParameter.g);
      paramNativeFilterParameter.a(this);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void f()
  {
    setParameterFloat(610, 0.0F);
    setParameterFloat(611, 0.0F);
    setParameterFloat(612, 1.0F);
    setParameterFloat(613, 1.0F);
    setParameterFloat(614, 0.0F);
    setParameterInteger(615, 0);
    setParameterInteger(616, 0);
    setParameterFloat(617, 0.0F);
    setParameterFloat(618, 0.0F);
  }
  
  private int[] g()
  {
    try
    {
      int[] arrayOfInt = nativeGetFloatParameterKeys(this.g);
      return arrayOfInt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private int[] h()
  {
    try
    {
      int[] arrayOfInt = nativeGetBufferParameterKeys(this.g);
      return arrayOfInt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private int[] i()
  {
    try
    {
      int[] arrayOfInt = nativeGetStringParameterKeys(this.g);
      return arrayOfInt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  private static native void nativeActivatePreset(long paramLong, int paramInt1, int paramInt2);
  
  @UsedByNative
  private static native void nativeAddSubParameter(long paramLong1, long paramLong2);
  
  @UsedByNative
  private static native void nativeAppendPointToParameterBuffer(long paramLong, int paramInt, float paramFloat1, float paramFloat2);
  
  @UsedByNative
  private static native long nativeCreateDefault(int paramInt);
  
  @UsedByNative
  private static native void nativeDispose(long paramLong);
  
  @UsedByNative
  private static native int nativeGetActiveKey(long paramLong);
  
  @UsedByNative
  private static native int[] nativeGetBufferParameterKeys(long paramLong);
  
  @UsedByNative
  private static native int nativeGetFilterType(long paramLong);
  
  @UsedByNative
  private static native int[] nativeGetFloatParameterKeys(long paramLong);
  
  @UsedByNative
  private static native byte[] nativeGetParameterBuffer(long paramLong, int paramInt);
  
  @UsedByNative
  private static native float nativeGetParameterFloat(long paramLong, int paramInt);
  
  @UsedByNative
  private static native String nativeGetParameterString(long paramLong, int paramInt);
  
  @UsedByNative
  private static native int[] nativeGetStringParameterKeys(long paramLong);
  
  @UsedByNative
  private static native long[] nativeGetSubParameters(long paramLong);
  
  @UsedByNative
  private static native boolean nativeHasBufferKey(long paramLong, int paramInt);
  
  @UsedByNative
  private static native boolean nativeHasFloatKey(long paramLong, int paramInt);
  
  @UsedByNative
  private static native boolean nativeHasStringKey(long paramLong, int paramInt);
  
  private static native boolean nativeInitClass();
  
  @UsedByNative
  private static native void nativeReleaseSubParameter(long paramLong1, long paramLong2);
  
  @UsedByNative
  private static native void nativeSetActiveKey(long paramLong, int paramInt);
  
  @UsedByNative
  private static native boolean nativeSetParameterBuffer(long paramLong, int paramInt, byte[] paramArrayOfByte);
  
  @UsedByNative
  private static native boolean nativeSetParameterFloat(long paramLong, int paramInt, float paramFloat);
  
  @UsedByNative
  private static native boolean nativeSetParameterString(long paramLong, int paramInt, String paramString);
  
  public final void a(int paramInt1, int paramInt2)
  {
    nativeActivatePreset(this.g, paramInt1, paramInt2);
  }
  
  public final void a(FilterParameter paramFilterParameter)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        if (getFilterType() == paramFilterParameter.getFilterType())
        {
          j = 1;
          if (j != 0) {
            break;
          }
          throw new IllegalStateException();
        }
      }
      finally {}
      int j = 0;
    }
    int[] arrayOfInt = paramFilterParameter.getParameterKeys();
    int k = arrayOfInt.length;
    while (i < k)
    {
      int m = arrayOfInt[i];
      a(m, paramFilterParameter.getParameterValue(m));
      i++;
    }
    if (paramFilterParameter.getActiveParameterKey() != 1000) {
      setActiveParameterKey(paramFilterParameter.getActiveParameterKey());
    }
    int n = paramFilterParameter.e();
    if ((n != 0) && (n != 1)) {
      throw new IllegalArgumentException("coordinate space must either be FILTER_INPUT_IMAGE_SPACE or ORIGINAL_IMAGE_SPACE");
    }
    this.f = n;
    Iterator localIterator1 = getSubParameters().iterator();
    while (localIterator1.hasNext()) {
      b((FilterParameter)localIterator1.next());
    }
    Iterator localIterator2 = paramFilterParameter.getSubParameters().iterator();
    while (localIterator2.hasNext()) {
      addSubParameters(((FilterParameter)localIterator2.next()).c());
    }
  }
  
  /* Error */
  public final boolean a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	com/google/android/libraries/photoeditor/core/NativeFilterParameter:g	J
    //   6: iload_1
    //   7: invokestatic 184	com/google/android/libraries/photoeditor/core/NativeFilterParameter:nativeHasFloatKey	(JI)Z
    //   10: ifne +29 -> 39
    //   13: aload_0
    //   14: getfield 34	com/google/android/libraries/photoeditor/core/NativeFilterParameter:g	J
    //   17: iload_1
    //   18: invokestatic 186	com/google/android/libraries/photoeditor/core/NativeFilterParameter:nativeHasBufferKey	(JI)Z
    //   21: ifne +18 -> 39
    //   24: aload_0
    //   25: getfield 34	com/google/android/libraries/photoeditor/core/NativeFilterParameter:g	J
    //   28: iload_1
    //   29: invokestatic 188	com/google/android/libraries/photoeditor/core/NativeFilterParameter:nativeHasStringKey	(JI)Z
    //   32: istore 4
    //   34: iload 4
    //   36: ifeq +9 -> 45
    //   39: iconst_1
    //   40: istore_3
    //   41: aload_0
    //   42: monitorexit
    //   43: iload_3
    //   44: ireturn
    //   45: iconst_0
    //   46: istore_3
    //   47: goto -6 -> 41
    //   50: astore_2
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	NativeFilterParameter
    //   0	55	1	paramInt	int
    //   50	4	2	localObject	Object
    //   40	7	3	bool1	boolean
    //   32	3	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	34	50	finally
  }
  
  public final boolean a(int paramInt, Object paramObject)
  {
    try
    {
      boolean bool1;
      if ((paramObject instanceof Number))
      {
        boolean bool2 = setParameterFloat(paramInt, ((Number)paramObject).floatValue());
        bool1 = bool2;
      }
      for (;;)
      {
        return bool1;
        if ((paramObject instanceof byte[]))
        {
          bool1 = setParameterBuffer(paramInt, (byte[])paramObject);
        }
        else
        {
          if (!(paramObject instanceof String)) {
            break;
          }
          bool1 = setParameterString(paramInt, (String)paramObject);
        }
      }
      throw new IllegalStateException("Unexpected Parameter Type in setParameterValue");
    }
    finally {}
  }
  
  public int[] a()
  {
    return a;
  }
  
  @UsedByNative
  public void addSubParameters(FilterParameter paramFilterParameter)
  {
    try
    {
      c((NativeFilterParameter)paramFilterParameter);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public void appendPointToParameterBuffer(int paramInt, float paramFloat1, float paramFloat2)
  {
    try
    {
      nativeAppendPointToParameterBuffer(this.g, paramInt, paramFloat1, paramFloat2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public int b()
  {
    return getActiveParameterKey();
  }
  
  public final boolean b(FilterParameter paramFilterParameter)
  {
    NativeFilterParameter localNativeFilterParameter1;
    for (;;)
    {
      try
      {
        localNativeFilterParameter1 = (NativeFilterParameter)paramFilterParameter;
        if (localNativeFilterParameter1 != null)
        {
          i = 1;
          if (i != 0) {
            break;
          }
          throw new IllegalStateException();
        }
      }
      finally {}
      int i = 0;
    }
    NativeFilterParameter localNativeFilterParameter2 = localNativeFilterParameter1.h;
    int j = 0;
    if (localNativeFilterParameter2 == this) {
      j = 1;
    }
    if (j == 0) {
      throw new IllegalStateException();
    }
    nativeReleaseSubParameter(this.g, localNativeFilterParameter1.g);
    localNativeFilterParameter1.b(this);
    return true;
  }
  
  public final FilterParameter c()
  {
    try
    {
      FilterParameter localFilterParameter = efj.Cv.a(getFilterType());
      localFilterParameter.a(this);
      return localFilterParameter;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void finalize()
  {
    if (this.h == null) {
      nativeDispose(this.g);
    }
  }
  
  @UsedByNative
  public int getActiveParameterKey()
  {
    try
    {
      int i = nativeGetActiveKey(this.g);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public int getFilterType()
  {
    try
    {
      int i = nativeGetFilterType(this.g);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public long getHandle()
  {
    try
    {
      long l = this.g;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public byte[] getParameterBuffer(int paramInt)
  {
    try
    {
      if (!nativeHasBufferKey(this.g, paramInt)) {
        throw new IllegalStateException();
      }
    }
    finally {}
    byte[] arrayOfByte = nativeGetParameterBuffer(this.g, paramInt);
    return arrayOfByte;
  }
  
  @UsedByNative
  public float getParameterFloat(int paramInt)
  {
    try
    {
      if (!nativeHasFloatKey(this.g, paramInt))
      {
        int i = getFilterType();
        throw new IllegalArgumentException(58 + "Invalid parameter key, filter=" + i + " key= " + paramInt);
      }
    }
    finally {}
    float f = nativeGetParameterFloat(this.g, paramInt);
    return f;
  }
  
  @UsedByNative
  public int getParameterInteger(int paramInt)
  {
    try
    {
      float f = getParameterFloat(paramInt);
      int i = (int)f;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public int[] getParameterKeys()
  {
    int i = 0;
    try
    {
      int[][] arrayOfInt = new int[3][];
      arrayOfInt[0] = g();
      arrayOfInt[1] = h();
      arrayOfInt[2] = i();
      int[] arrayOfInt1 = new int[arrayOfInt[0].length + arrayOfInt[1].length + arrayOfInt[2].length];
      int j = 0;
      while (i < 3)
      {
        System.arraycopy(arrayOfInt[i], 0, arrayOfInt1, j, arrayOfInt[i].length);
        int k = arrayOfInt[i].length;
        j += k;
        i++;
      }
      return arrayOfInt1;
    }
    finally {}
  }
  
  @UsedByNative
  public String getParameterString(int paramInt)
  {
    try
    {
      if (!nativeHasStringKey(this.g, paramInt)) {
        throw new IllegalStateException();
      }
    }
    finally {}
    String str = nativeGetParameterString(this.g, paramInt);
    return str;
  }
  
  @UsedByNative
  public Object getParameterValue(int paramInt)
  {
    try
    {
      Object localObject2;
      if (nativeHasFloatKey(this.g, paramInt))
      {
        Float localFloat = Float.valueOf(getParameterFloat(paramInt));
        localObject2 = localFloat;
      }
      for (;;)
      {
        return localObject2;
        if (nativeHasBufferKey(this.g, paramInt))
        {
          localObject2 = getParameterBuffer(paramInt);
        }
        else
        {
          if (!nativeHasStringKey(this.g, paramInt)) {
            break;
          }
          localObject2 = getParameterString(paramInt);
        }
      }
      throw new IllegalStateException(33 + "Invalid Parameter Key=" + paramInt);
    }
    finally {}
  }
  
  @UsedByNative
  public List<FilterParameter> getSubParameters()
  {
    ArrayList localArrayList2;
    try
    {
      long[] arrayOfLong = nativeGetSubParameters(this.g);
      ArrayList localArrayList1 = new ArrayList();
      int i = arrayOfLong.length;
      for (int j = 0; j < i; j++)
      {
        long l = arrayOfLong[j];
        NativeFilterParameter localNativeFilterParameter1 = (NativeFilterParameter)efj.Cv.a(nativeGetFilterType(l));
        nativeDispose(localNativeFilterParameter1.g);
        localNativeFilterParameter1.g = l;
        localArrayList1.add(localNativeFilterParameter1);
      }
      localArrayList2 = new ArrayList();
      Iterator localIterator = localArrayList1.iterator();
      while (localIterator.hasNext())
      {
        NativeFilterParameter localNativeFilterParameter2 = (NativeFilterParameter)localIterator.next();
        localNativeFilterParameter2.a(this);
        localArrayList2.add(localNativeFilterParameter2);
      }
    }
    finally {}
    return localArrayList2;
  }
  
  @UsedByNative
  public int getSubParametersCount()
  {
    try
    {
      int i = nativeGetSubParameters(this.g).length;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public void setActiveParameterKey(int paramInt)
  {
    try
    {
      nativeSetActiveKey(this.g, paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public boolean setParameterBuffer(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      boolean bool = nativeSetParameterBuffer(this.g, paramInt, paramArrayOfByte);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  @UsedByNative
  public boolean setParameterFloat(int paramInt, float paramFloat)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 34	com/google/android/libraries/photoeditor/core/NativeFilterParameter:g	J
    //   6: iload_1
    //   7: fload_2
    //   8: invokestatic 318	com/google/android/libraries/photoeditor/core/NativeFilterParameter:nativeSetParameterFloat	(JIF)Z
    //   11: istore 4
    //   13: iload 4
    //   15: ifne +11 -> 26
    //   18: iconst_0
    //   19: istore 5
    //   21: aload_0
    //   22: monitorexit
    //   23: iload 5
    //   25: ireturn
    //   26: aload_0
    //   27: getfield 321	com/google/android/libraries/photoeditor/core/NativeFilterParameter:e	Ljava/util/List;
    //   30: ifnull +29 -> 59
    //   33: aload_0
    //   34: getfield 321	com/google/android/libraries/photoeditor/core/NativeFilterParameter:e	Ljava/util/List;
    //   37: iload_1
    //   38: invokestatic 326	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   41: invokeinterface 329 2 0
    //   46: ifeq +13 -> 59
    //   49: aload_0
    //   50: getfield 34	com/google/android/libraries/photoeditor/core/NativeFilterParameter:g	J
    //   53: iload_1
    //   54: fload_2
    //   55: f2i
    //   56: invokestatic 126	com/google/android/libraries/photoeditor/core/NativeFilterParameter:nativeActivatePreset	(JII)V
    //   59: iconst_1
    //   60: istore 5
    //   62: goto -41 -> 21
    //   65: astore_3
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_3
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	NativeFilterParameter
    //   0	70	1	paramInt	int
    //   0	70	2	paramFloat	float
    //   65	4	3	localObject	Object
    //   11	3	4	bool1	boolean
    //   19	42	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	13	65	finally
    //   26	59	65	finally
  }
  
  @UsedByNative
  public boolean setParameterInteger(int paramInt1, int paramInt2)
  {
    float f = paramInt2;
    try
    {
      boolean bool = setParameterFloat(paramInt1, f);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public boolean setParameterString(int paramInt, String paramString)
  {
    try
    {
      boolean bool = nativeSetParameterString(this.g, paramInt, paramString);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.core.NativeFilterParameter
 * JD-Core Version:    0.7.0.1
 */