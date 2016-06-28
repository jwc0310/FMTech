import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;
import java.util.EnumMap;

public final class bdb
  extends bcv
{
  public static final Parcelable.Creator<bdb> CREATOR = new bdc();
  final String a;
  private giz b;
  
  protected bdb(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readString();
  }
  
  protected bdb(bcw parambcw)
  {
    super(parambcw);
    this.a = ((bdd)parambcw).a;
  }
  
  public final boolean D()
  {
    return true;
  }
  
  public final boolean K()
  {
    return (super.K()) && (this.a != null);
  }
  
  public final boolean M()
  {
    if (this.e != -1) {}
    for (String str1 = this.b.a(this.e).b("gaia_id");; str1 = null)
    {
      String str2 = this.m;
      if ((str1 == null) || (str2 == null) || (!TextUtils.equals(str1, str2))) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public final int R()
  {
    Integer localInteger;
    if ((this.k != null) && (this.k.a != null))
    {
      localInteger = this.k.a.b;
      if (localInteger != null) {}
    }
    else
    {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public final int S()
  {
    Integer localInteger;
    if ((this.k != null) && (this.k.a != null))
    {
      localInteger = this.k.a.c;
      if (localInteger != null) {}
    }
    else
    {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public final bcw U()
  {
    return new bdd();
  }
  
  public final Intent a(Context paramContext, int paramInt)
  {
    if (!this.F.c()) {}
    for (boolean bool = true;; bool = false) {
      return a(paramContext, paramInt, e(), bool);
    }
  }
  
  public final void a(Context paramContext)
  {
    super.a(paramContext);
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final Intent b(Context paramContext)
  {
    return a(paramContext, GooglePhotosImageProvider.a(paramContext, ((ipf)this.f.get(bcx.a)).c, ipm.a, jrw.c, jrw.c, 288), "image/jpeg");
  }
  
  public final jpx c()
  {
    if ((this.l == null) || (this.a == null)) {
      return null;
    }
    return (jpu)this.l.a(new jpy(this.a), new jpw((ipf)this.f.get(bcx.a)));
  }
  
  public final jpx d()
  {
    String str1 = this.d.getString("view_id");
    if (this.a == null) {}
    for (String str2 = str1;; str2 = this.a) {
      return new jpu(str1, str2, (ipf)this.f.get(bcx.a), this.C, this.z, this.A, null);
    }
  }
  
  public final boolean v()
  {
    return (super.v()) && ((0x8000000 & this.A) != 0L);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdb
 * JD-Core Version:    0.7.0.1
 */