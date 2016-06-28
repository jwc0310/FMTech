import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class lhp
  implements Parcelable, Cloneable, Comparable<lhp>
{
  public static final Parcelable.Creator<lhp> CREATOR = new lhq();
  public String a;
  public String b;
  public String c;
  public String d;
  public boolean e;
  
  lhp(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.e = bool;
      return;
    }
  }
  
  public lhp(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramBoolean;
  }
  
  public final boolean a(lhp[] paramArrayOflhp)
  {
    int i = paramArrayOflhp.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        lhp locallhp = paramArrayOflhp[j];
        if ((TextUtils.equals(locallhp.a, this.a)) && (TextUtils.equals(locallhp.c, this.c))) {
          bool = true;
        }
      }
      else
      {
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
    if ((paramObject instanceof lhp))
    {
      lhp locallhp = (lhp)paramObject;
      if ((TextUtils.equals(this.a, locallhp.a)) && (TextUtils.equals(this.b, locallhp.b)) && (TextUtils.equals(this.c, locallhp.c)) && (TextUtils.equals(this.d, locallhp.d)) && (this.e == locallhp.e)) {
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
    if (this.c != null) {
      i = i * 31 + this.c.hashCode();
    }
    if (this.d != null) {
      i = i * 31 + this.d.hashCode();
    }
    if (this.e) {
      i *= 31;
    }
    return i;
  }
  
  public final String toString()
  {
    String str1 = this.b;
    String str2 = this.d;
    boolean bool = this.e;
    return 51 + String.valueOf(str1).length() + String.valueOf(str2).length() + "{SquareStreamData name=" + str1 + " stream=" + str2 + " isRestricted=" + bool + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    if (this.e) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhp
 * JD-Core Version:    0.7.0.1
 */