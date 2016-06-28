import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class jjd
  implements Parcelable, Cloneable, Comparable<jjd>
{
  public static final Parcelable.Creator<jjd> CREATOR = new jje();
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final boolean e;
  public final boolean f;
  
  jjd(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    boolean bool2;
    if (paramParcel.readInt() != 0)
    {
      bool2 = bool1;
      this.e = bool2;
      if (paramParcel.readInt() == 0) {
        break label70;
      }
    }
    for (;;)
    {
      this.f = bool1;
      return;
      bool2 = false;
      break;
      label70:
      bool1 = false;
    }
  }
  
  public jjd(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, paramString2, paramString3, null, false);
  }
  
  public jjd(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramBoolean, false);
  }
  
  public jjd(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  public static boolean a(jjd paramjjd1, jjd paramjjd2)
  {
    boolean bool;
    if (paramjjd1 == null)
    {
      bool = false;
      if (paramjjd2 == null) {
        bool = true;
      }
    }
    do
    {
      return bool;
      bool = false;
    } while (paramjjd2 == null);
    if ((!TextUtils.isEmpty(paramjjd1.a)) || (!TextUtils.isEmpty(paramjjd2.a))) {
      return TextUtils.equals(paramjjd1.a, paramjjd2.a);
    }
    return TextUtils.equals(paramjjd1.c, paramjjd2.c);
  }
  
  public final boolean a(jjd[] paramArrayOfjjd)
  {
    int i = paramArrayOfjjd.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (a(paramArrayOfjjd[j], this)) {
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
    if ((paramObject instanceof jjd))
    {
      jjd localjjd = (jjd)paramObject;
      if ((TextUtils.equals(this.a, localjjd.a)) && (TextUtils.equals(this.b, localjjd.b)) && (TextUtils.equals(this.c, localjjd.c)) && (TextUtils.equals(this.d, localjjd.d)) && (this.e == localjjd.e) && (this.f == localjjd.f)) {
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
    if (this.f) {
      i *= 31;
    }
    return i;
  }
  
  public final String toString()
  {
    String str1 = this.a;
    String str2 = this.b;
    String str3 = this.c;
    String str4 = this.d;
    boolean bool1 = this.e;
    boolean bool2 = this.f;
    return 99 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + "{PersonData id=" + str1 + " name=" + str2 + " email=" + str3 + " compressed photo url=" + str4 + " inSameVisibilityGroup=" + bool1 + " isPlusMention=" + bool2 + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    int j;
    if (this.e)
    {
      j = i;
      paramParcel.writeInt(j);
      if (!this.f) {
        break label69;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      j = 0;
      break;
      label69:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jjd
 * JD-Core Version:    0.7.0.1
 */