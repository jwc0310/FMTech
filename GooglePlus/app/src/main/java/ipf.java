import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class ipf
  implements Parcelable
{
  public static final Parcelable.Creator<ipf> CREATOR = new ipg();
  public final String a;
  public final ipn b;
  public final String c;
  public final Uri d;
  public final ipm e;
  final int f;
  public final String g;
  
  ipf(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.c = paramParcel.readString();
    String str = paramParcel.readString();
    if (str != null) {}
    for (this.d = Uri.parse(str);; this.d = null)
    {
      this.e = ipm.a(paramParcel.readInt());
      this.g = paramParcel.readString();
      this.b = ((ipn)ipn.CREATOR.createFromParcel(paramParcel));
      this.f = paramParcel.readInt();
      return;
    }
  }
  
  private ipf(String paramString1, String paramString2, int paramInt, long paramLong, String paramString3, Uri paramUri, ipm paramipm, String paramString4)
  {
    this.b = new ipn(paramString2, paramLong);
    this.f = paramInt;
    this.a = paramString1;
    this.c = paramString3;
    this.d = paramUri;
    this.e = paramipm;
    this.g = paramString4;
    int j;
    if (this.c != null)
    {
      j = i;
      if (j != 0) {
        return;
      }
      if (this.d == null) {
        break label99;
      }
    }
    for (;;)
    {
      if (i != 0) {
        return;
      }
      throw new IllegalArgumentException("MediaRef has neither url nor local uri!");
      j = 0;
      break;
      label99:
      i = 0;
    }
  }
  
  public static ipf a(Context paramContext, Uri paramUri, ipm paramipm)
  {
    return a(paramContext, null, null, 0L, null, paramUri, paramipm, null);
  }
  
  public static ipf a(Context paramContext, Uri paramUri, ipm paramipm, String paramString)
  {
    return a(paramContext, null, null, 0L, null, paramUri, paramipm, paramString);
  }
  
  @Deprecated
  public static ipf a(Context paramContext, String paramString1, long paramLong, String paramString2, Uri paramUri, ipm paramipm)
  {
    return a(paramContext, null, paramString1, paramLong, paramString2, paramUri, paramipm, null);
  }
  
  public static ipf a(Context paramContext, String paramString1, long paramLong, String paramString2, Uri paramUri, ipm paramipm, String paramString3)
  {
    return a(paramContext, null, paramString1, paramLong, paramString2, paramUri, paramipm, paramString3);
  }
  
  public static ipf a(Context paramContext, String paramString, ipm paramipm)
  {
    return a(paramContext, null, null, 0L, paramString, null, paramipm, null);
  }
  
  @Deprecated
  public static ipf a(Context paramContext, String paramString1, String paramString2, long paramLong, String paramString3, Uri paramUri, ipm paramipm)
  {
    return a(paramContext, paramString1, paramString2, paramLong, paramString3, paramUri, paramipm, null);
  }
  
  private static ipf a(Context paramContext, String paramString1, String paramString2, long paramLong, String paramString3, Uri paramUri, ipm paramipm, String paramString4)
  {
    if ((paramUri != null) && (paramipm == ipm.a))
    {
      String str1 = paramUri.toString();
      if (!jrp.a(paramContext, jrr.a).b(str1))
      {
        String str2 = paramUri.toString();
        if (!jrp.a(paramContext, jrr.b).b(str2)) {
          break label111;
        }
      }
    }
    label111:
    for (ipm localipm = ipm.c;; localipm = paramipm)
    {
      int i = -1;
      git localgit = (git)mbb.b(paramContext, git.class);
      if (localgit != null) {
        i = localgit.c();
      }
      return new ipf(paramString1, paramString2, i, paramLong, paramString3, paramUri, localipm, paramString4);
    }
  }
  
  @Deprecated
  public static ipf a(Context paramContext, String paramString1, String paramString2, Uri paramUri, ipm paramipm)
  {
    return a(paramContext, paramString1, null, 0L, paramString2, paramUri, paramipm, null);
  }
  
  public static ipf a(Context paramContext, String paramString1, String paramString2, Uri paramUri, ipm paramipm, String paramString3)
  {
    return a(paramContext, paramString1, null, 0L, paramString2, paramUri, paramipm, paramString3);
  }
  
  public static ipf a(Context paramContext, String paramString1, String paramString2, ipm paramipm)
  {
    return a(paramContext, paramString1, null, 0L, paramString2, null, paramipm, null);
  }
  
  private static boolean a(Uri paramUri1, Uri paramUri2)
  {
    if ((paramUri1 != null) && (paramUri2 != null)) {
      return paramUri1.equals(paramUri2);
    }
    return (paramUri1 == null) && (paramUri2 == null);
  }
  
  public final boolean a()
  {
    return this.b.a != 0L;
  }
  
  public final boolean a(ipf paramipf)
  {
    if (paramipf == null) {}
    while ((!TextUtils.equals(this.g, paramipf.g)) || (!TextUtils.equals(this.c, paramipf.c))) {
      return false;
    }
    return a(this.d, paramipf.d);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ipf localipf;
    do
    {
      return true;
      if (!(paramObject instanceof ipf)) {
        break;
      }
      localipf = (ipf)paramObject;
      if (this.b.a != localipf.b.a) {
        return false;
      }
      if (!TextUtils.equals(this.c, localipf.c)) {
        return false;
      }
      if (!TextUtils.equals(this.g, localipf.g)) {
        return false;
      }
      if (!a(this.d, localipf.d)) {
        return false;
      }
    } while (this.e == localipf.e);
    return false;
    return false;
  }
  
  public int hashCode()
  {
    int i = 31 * (31 + (int)(this.b.a ^ this.b.a >>> 32));
    int j;
    int m;
    label52:
    int i1;
    label71:
    int i2;
    int i3;
    if (this.c == null)
    {
      j = 0;
      int k = 31 * (j + i);
      if (this.g != null) {
        break label112;
      }
      m = 0;
      int n = 31 * (m + k);
      if (this.d != null) {
        break label124;
      }
      i1 = 0;
      i2 = 31 * (i1 + n);
      ipm localipm = this.e;
      i3 = 0;
      if (localipm != null) {
        break label136;
      }
    }
    for (;;)
    {
      return i2 + i3;
      j = this.c.hashCode();
      break;
      label112:
      m = this.g.hashCode();
      break label52;
      label124:
      i1 = this.d.hashCode();
      break label71;
      label136:
      i3 = this.e.hashCode();
    }
  }
  
  public String toString()
  {
    String str1 = String.valueOf(getClass().getSimpleName());
    String str2 = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
    String str3 = String.valueOf(this.b);
    String str4 = this.a;
    String str5 = this.c;
    if (this.d != null) {}
    for (String str6 = String.valueOf(this.d);; str6 = null)
    {
      String str7 = String.valueOf(str6);
      String str8 = String.valueOf(this.e);
      String str9 = this.g;
      return 25 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length() + str1 + "@" + str2 + "[" + str3 + ", ti-" + str4 + ", u-" + str5 + ", l-" + str7 + ", ty-" + str8 + ", s-" + str9 + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.c);
    if (this.d != null) {
      paramParcel.writeString(this.d.toString());
    }
    for (;;)
    {
      paramParcel.writeInt(this.e.e);
      paramParcel.writeString(this.g);
      this.b.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.f);
      return;
      paramParcel.writeString(null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ipf
 * JD-Core Version:    0.7.0.1
 */