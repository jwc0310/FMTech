import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class lgu
  implements Parcelable, hrt
{
  public static final Parcelable.Creator<lgu> CREATOR = new lgv();
  public final lhp a;
  public final String b;
  final boolean c;
  
  lgu(Parcel paramParcel)
  {
    this.a = ((lhp)paramParcel.readParcelable(lgu.class.getClassLoader()));
    this.b = paramParcel.readString();
    if (paramParcel.readInt() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
  
  public lgu(lgw paramlgw)
  {
    this.a = paramlgw.a;
    this.b = paramlgw.b;
    this.c = paramlgw.c;
  }
  
  public static lgw a()
  {
    return new lgw();
  }
  
  public final String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return this.a.a;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof lgu))
    {
      lgu locallgu = (lgu)paramObject;
      if ((TextUtils.equals(this.b, locallgu.b)) && (this.a.equals(locallgu.a)) && (this.c == locallgu.c)) {
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
    int j = i * 31;
    if (this.c) {}
    for (int k = 1231;; k = 1237) {
      return k + j;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (jr.a().d)
    {
      if (!TextUtils.isEmpty(this.a.d))
      {
        localStringBuilder.append('(');
        localStringBuilder.append(this.a.d);
        localStringBuilder.append(')');
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(this.a.b);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append(this.a.b);
      if (!TextUtils.isEmpty(this.a.d))
      {
        localStringBuilder.append(' ');
        localStringBuilder.append('(');
        localStringBuilder.append(this.a.d);
        localStringBuilder.append(')');
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
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
 * Qualified Name:     lgu
 * JD-Core Version:    0.7.0.1
 */