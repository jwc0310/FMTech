import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class knw
  implements Parcelable
{
  public static final Parcelable.Creator<knw> CREATOR = new knx();
  public final String a;
  public final String b;
  public final String c;
  
  public knw(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  private knw(String paramString1, String paramString2, String paramString3)
  {
    if ((TextUtils.isEmpty(paramString2)) && (TextUtils.isEmpty(paramString3))) {
      throw new IllegalArgumentException("At least one of url or deepLinkId is required.");
    }
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  public static knw a(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    String str1;
    String str2;
    String str3;
    do
    {
      return null;
      str1 = paramBundle.getString("label");
      str2 = paramBundle.getString("url");
      str3 = paramBundle.getString("deepLinkId");
    } while ((TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3)));
    return new knw(str1, str2, str3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    knw localknw;
    do
    {
      return true;
      if (!(paramObject instanceof knw)) {
        return false;
      }
      localknw = (knw)paramObject;
    } while ((TextUtils.equals(this.a, localknw.a)) && (TextUtils.equals(this.b, localknw.b)) && (TextUtils.equals(this.c, localknw.c)));
    return false;
  }
  
  public final int hashCode()
  {
    int i;
    int k;
    label27:
    int m;
    int n;
    if (this.a == null)
    {
      i = 0;
      int j = 31 * (i + 527);
      if (this.b != null) {
        break label66;
      }
      k = 0;
      m = 31 * (k + j);
      String str = this.c;
      n = 0;
      if (str != null) {
        break label77;
      }
    }
    for (;;)
    {
      return m + n;
      i = this.a.hashCode();
      break;
      label66:
      k = this.b.hashCode();
      break label27;
      label77:
      n = this.c.hashCode();
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knw
 * JD-Core Version:    0.7.0.1
 */