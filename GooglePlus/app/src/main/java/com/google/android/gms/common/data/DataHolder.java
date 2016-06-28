package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ehj;
import ehk;

public final class DataHolder
  implements SafeParcelable
{
  public static final ehk CREATOR = new ehk();
  final int a;
  final String[] b;
  public Bundle c;
  public final CursorWindow[] d;
  final int e;
  public final Bundle f;
  public int g;
  public Object h;
  private int[] i;
  private boolean j = false;
  private boolean k = true;
  
  static
  {
    new ehj(new String[0], null, '\000');
  }
  
  public DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramArrayOfString;
    this.d = paramArrayOfCursorWindow;
    this.e = paramInt2;
    this.f = paramBundle;
  }
  
  public final int a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.g)) {}
    int n;
    for (int m = 1;; m = 0)
    {
      n = 0;
      if (m != 0) {
        break;
      }
      throw new IllegalStateException();
    }
    do
    {
      n++;
      if (n >= this.i.length) {
        break;
      }
    } while (paramInt >= this.i[n]);
    n--;
    if (n == this.i.length) {
      n--;
    }
    return n;
  }
  
  public final void a()
  {
    int m = 0;
    this.c = new Bundle();
    for (int n = 0; n < this.b.length; n++) {
      this.c.putInt(this.b[n], n);
    }
    this.i = new int[this.d.length];
    int i1 = 0;
    while (m < this.d.length)
    {
      this.i[m] = i1;
      int i2 = i1 - this.d[m].getStartPosition();
      i1 += this.d[m].getNumRows() - i2;
      m++;
    }
    this.g = i1;
  }
  
  public final void a(String paramString, int paramInt)
  {
    if ((this.c == null) || (!this.c.containsKey(paramString))) {
      throw new IllegalArgumentException("No such column: " + paramString);
    }
    if (b()) {
      throw new IllegalArgumentException("Buffer is closed.");
    }
    if ((paramInt < 0) || (paramInt >= this.g)) {
      throw new CursorIndexOutOfBoundsException(paramInt, this.g);
    }
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally {}
  }
  
  public final void c()
  {
    try
    {
      if (!this.j)
      {
        this.j = true;
        for (int m = 0; m < this.d.length; m++) {
          this.d[m].close();
        }
      }
      return;
    }
    finally {}
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  /* Error */
  protected final void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 48	com/google/android/gms/common/data/DataHolder:k	Z
    //   4: ifeq +76 -> 80
    //   7: aload_0
    //   8: getfield 54	com/google/android/gms/common/data/DataHolder:d	[Landroid/database/CursorWindow;
    //   11: arraylength
    //   12: ifle +68 -> 80
    //   15: aload_0
    //   16: invokevirtual 109	com/google/android/gms/common/data/DataHolder:b	()Z
    //   19: ifne +61 -> 80
    //   22: aload_0
    //   23: getfield 123	com/google/android/gms/common/data/DataHolder:h	Ljava/lang/Object;
    //   26: ifnonnull +59 -> 85
    //   29: new 92	java/lang/StringBuilder
    //   32: dup
    //   33: ldc 125
    //   35: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload_0
    //   39: invokevirtual 126	java/lang/Object:toString	()Ljava/lang/String;
    //   42: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: astore_3
    //   49: ldc 128
    //   51: new 92	java/lang/StringBuilder
    //   54: dup
    //   55: ldc 130
    //   57: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   60: aload_3
    //   61: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: ldc 132
    //   66: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: invokestatic 137	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   75: pop
    //   76: aload_0
    //   77: invokevirtual 139	com/google/android/gms/common/data/DataHolder:c	()V
    //   80: aload_0
    //   81: invokespecial 141	java/lang/Object:finalize	()V
    //   84: return
    //   85: aload_0
    //   86: getfield 123	com/google/android/gms/common/data/DataHolder:h	Ljava/lang/Object;
    //   89: invokevirtual 126	java/lang/Object:toString	()Ljava/lang/String;
    //   92: astore_2
    //   93: aload_2
    //   94: astore_3
    //   95: goto -46 -> 49
    //   98: astore_1
    //   99: aload_0
    //   100: invokespecial 141	java/lang/Object:finalize	()V
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	DataHolder
    //   98	6	1	localObject1	Object
    //   92	2	2	str	String
    //   48	47	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	49	98	finally
    //   49	80	98	finally
    //   85	93	98	finally
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.b, false);
    int n = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(n);
    efj.a(paramParcel, 2, this.d, paramInt, false);
    int i1 = this.e;
    efj.b(paramParcel, 3, 4);
    paramParcel.writeInt(i1);
    efj.a(paramParcel, 4, this.f, false);
    efj.n(paramParcel, m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder
 * JD-Core Version:    0.7.0.1
 */