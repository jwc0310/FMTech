package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import edz;
import efj;
import ejf;
import eyq;
import java.util.Arrays;
import java.util.List;
import x;

public class LogEventParcelable
  implements SafeParcelable
{
  public static final edz CREATOR = new edz();
  public final int a;
  public PlayLoggerContext b;
  public byte[] c;
  public int[] d;
  public final eyq e;
  public final x f;
  public final x g;
  
  public LogEventParcelable(int paramInt, PlayLoggerContext paramPlayLoggerContext, byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    this.a = paramInt;
    this.b = paramPlayLoggerContext;
    this.c = paramArrayOfByte;
    this.d = paramArrayOfInt;
    this.e = null;
    this.f = null;
    this.g = null;
  }
  
  public LogEventParcelable(PlayLoggerContext paramPlayLoggerContext, eyq parameyq, x paramx1, x paramx2, int[] paramArrayOfInt)
  {
    this.a = 1;
    this.b = paramPlayLoggerContext;
    this.e = parameyq;
    this.f = paramx1;
    this.g = paramx2;
    this.d = paramArrayOfInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    LogEventParcelable localLogEventParcelable;
    do
    {
      return true;
      if (!(paramObject instanceof LogEventParcelable)) {
        break;
      }
      localLogEventParcelable = (LogEventParcelable)paramObject;
    } while ((this.a == localLogEventParcelable.a) && (efj.a(this.b, localLogEventParcelable.b)) && (Arrays.equals(this.c, localLogEventParcelable.c)) && (Arrays.equals(this.d, localLogEventParcelable.d)) && (efj.a(this.e, localLogEventParcelable.e)) && (efj.a(this.f, localLogEventParcelable.f)) && (efj.a(this.g, localLogEventParcelable.g)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = this.f;
    arrayOfObject[6] = this.g;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LogEventParcelable[");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", ");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", ");
    String str1;
    String str2;
    if (this.c == null)
    {
      str1 = null;
      localStringBuilder.append(str1);
      localStringBuilder.append(", ");
      int[] arrayOfInt = this.d;
      str2 = null;
      if (arrayOfInt != null) {
        break label163;
      }
    }
    for (;;)
    {
      localStringBuilder.append(str2);
      localStringBuilder.append(", ");
      localStringBuilder.append(this.e);
      localStringBuilder.append(", ");
      localStringBuilder.append(this.f);
      localStringBuilder.append(", ");
      localStringBuilder.append(this.g);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      str1 = new String(this.c);
      break;
      label163:
      ejf localejf = new ejf(", ");
      int[][] arrayOfInt1 = new int[1][];
      arrayOfInt1[0] = this.d;
      List localList = Arrays.asList(arrayOfInt1);
      str2 = localejf.a(new StringBuilder(), localList).toString();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, paramInt, false);
    efj.a(paramParcel, 3, this.c, false);
    efj.a(paramParcel, 4, this.d, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.clearcut.LogEventParcelable
 * JD-Core Version:    0.7.0.1
 */