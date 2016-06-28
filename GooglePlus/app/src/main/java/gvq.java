import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class gvq
  implements Parcelable
{
  public static final Parcelable.Creator<gvq> CREATOR = new gvr();
  public final int a;
  public final String b;
  public final long c;
  
  private gvq(int paramInt, String paramString, long paramLong)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramLong;
  }
  
  gvq(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = paramParcel.readLong();
  }
  
  public static gvq a(int paramInt)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      efj.c(bool, "accountId must be valid");
      return new gvq(paramInt, null, -1L);
    }
  }
  
  public static gvq a(int paramInt, String paramString)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0)
    {
      bool2 = bool1;
      efj.c(bool2, "accountId must be valid");
      if (TextUtils.isEmpty(paramString)) {
        break label45;
      }
    }
    for (;;)
    {
      efj.c(bool1, "albumId must be non-empty");
      return new gvq(paramInt, paramString, -1L);
      bool2 = false;
      break;
      label45:
      bool1 = false;
    }
  }
  
  public static gvq a(int paramInt, String paramString, long paramLong)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (paramInt >= 0)
    {
      bool2 = bool1;
      efj.c(bool2, "accountId must be valid");
      if (TextUtils.isEmpty(paramString)) {
        break label68;
      }
      bool3 = bool1;
      label29:
      efj.c(bool3, "albumId must be non-empty");
      if (paramLong <= -1L) {
        break label74;
      }
    }
    for (;;)
    {
      efj.c(bool1, "batchId must be valid");
      return new gvq(paramInt, paramString, paramLong);
      bool2 = false;
      break;
      label68:
      bool3 = false;
      break label29;
      label74:
      bool1 = false;
    }
  }
  
  public final gvs a()
  {
    if (this.c != -1L) {
      return gvs.c;
    }
    if (this.b != null) {
      return gvs.b;
    }
    return gvs.a;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    gvq localgvq;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localgvq = (gvq)paramObject;
      if (this.a != localgvq.a) {
        return false;
      }
      if (this.c != localgvq.c) {
        return false;
      }
      if (this.b == null) {
        break;
      }
    } while (this.b.equals(localgvq.b));
    for (;;)
    {
      return false;
      if (localgvq.b == null) {
        break;
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 31 * this.a;
    if (this.b != null) {}
    for (int j = this.b.hashCode();; j = 0) {
      return 31 * (j + i) + (int)(this.c ^ this.c >>> 32);
    }
  }
  
  public final String toString()
  {
    int i = this.a;
    String str1 = this.b;
    long l = this.c;
    String str2 = String.valueOf(a());
    return 86 + String.valueOf(str1).length() + String.valueOf(str2).length() + "UploadGroup {accountId: " + i + ", albumId: " + str1 + ", batchId: " + l + ", type: " + str2 + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeLong(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvq
 * JD-Core Version:    0.7.0.1
 */