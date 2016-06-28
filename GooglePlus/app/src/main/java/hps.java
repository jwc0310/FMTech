import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class hps
  implements Parcelable, Cloneable, Comparable<hps>
{
  public static final Parcelable.Creator<hps> CREATOR = new hpt();
  public final String a;
  public final String b;
  public final boolean c;
  
  hps(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
  
  public hps(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean;
  }
  
  public final boolean a(hps[] paramArrayOfhps)
  {
    int i = paramArrayOfhps.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (TextUtils.equals(paramArrayOfhps[j].a, this.a)) {
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
    if ((paramObject instanceof hps))
    {
      hps localhps = (hps)paramObject;
      if ((TextUtils.equals(this.a, localhps.a)) && (TextUtils.equals(this.b, localhps.b)) && (this.c == localhps.c)) {
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
    if (this.c) {
      i *= 31;
    }
    return i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    if (this.c) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hps
 * JD-Core Version:    0.7.0.1
 */