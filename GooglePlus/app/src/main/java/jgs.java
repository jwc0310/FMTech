import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class jgs
  implements Parcelable, Cloneable, Comparable<jgs>
{
  public static final Parcelable.Creator<jgs> CREATOR = new jgt();
  public String a;
  public String b;
  public int c;
  public int d;
  
  jgs(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
  }
  
  public jgs(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    this.a = paramString1;
    this.c = paramInt1;
    this.b = paramString2;
    this.d = paramInt2;
  }
  
  public jgs(jgs paramjgs)
  {
    this.a = paramjgs.a;
    this.c = paramjgs.c;
    this.b = paramjgs.b;
    this.d = paramjgs.d;
  }
  
  public final boolean a(jgs[] paramArrayOfjgs)
  {
    int i = paramArrayOfjgs.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfjgs[j].a.equals(this.a)) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof jgs))
    {
      jgs localjgs = (jgs)paramObject;
      if ((TextUtils.equals(this.a, localjgs.a)) && (TextUtils.equals(this.b, localjgs.b)) && (this.c == localjgs.c) && (this.d == localjgs.d)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = 17;
    if (this.a != null) {
      i = 527 + this.a.hashCode();
    }
    if (this.b != null) {
      i = i * 31 + this.b.hashCode();
    }
    return 31 * (i * 31 + this.c) + this.d;
  }
  
  public final String toString()
  {
    String str1 = this.a;
    String str2 = this.b;
    int i = this.c;
    int j = this.d;
    return 56 + String.valueOf(str1).length() + String.valueOf(str2).length() + "{CircleData id=" + str1 + " name=" + str2 + " type=" + i + " size=" + j + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jgs
 * JD-Core Version:    0.7.0.1
 */