import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.plus.phone.VideoViewActivity;
import java.util.EnumMap;

public final class bcy
  extends bcv
{
  public static final Parcelable.Creator<bcy> CREATOR = new bcz();
  final String a;
  final int b;
  final int c;
  
  protected bcy(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
  }
  
  protected bcy(bcw parambcw)
  {
    super(parambcw);
    bda localbda = (bda)parambcw;
    this.a = localbda.a;
    this.b = localbda.b;
    this.c = localbda.c;
  }
  
  public final boolean C()
  {
    return true;
  }
  
  public final boolean D()
  {
    return false;
  }
  
  public final boolean K()
  {
    return (super.K()) && (this.a != null);
  }
  
  public final boolean M()
  {
    return true;
  }
  
  public final boolean O()
  {
    if (this.f.containsKey(bcx.a)) {
      return ((ipf)this.f.get(bcx.a)).d != null;
    }
    return super.O();
  }
  
  public final int R()
  {
    return this.b;
  }
  
  public final int S()
  {
    return this.c;
  }
  
  public final bcw U()
  {
    return new bda();
  }
  
  public final Intent a(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, e(), false);
  }
  
  public final Intent b(Context paramContext)
  {
    return a(paramContext, ((ipf)this.f.get(bcx.a)).d, "image/*");
  }
  
  public final jpx c()
  {
    if ((this.l == null) || (this.a == null)) {
      return null;
    }
    return (jpu)this.l.a(new jpy(this.a), new jpw((ipf)this.f.get(bcx.a)));
  }
  
  public final Intent d(Context paramContext)
  {
    if (this.f.containsKey(bcx.a))
    {
      Uri localUri = ((ipf)this.f.get(bcx.a)).d;
      Intent localIntent = new Intent(paramContext, VideoViewActivity.class);
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setData(localUri);
      return localIntent;
    }
    return super.d(paramContext);
  }
  
  public final jpx d()
  {
    return new jpu(this.d.getString("view_id"), this.a, (ipf)this.f.get(bcx.a), this.C, this.z, this.A, null);
  }
  
  public final boolean u()
  {
    return (super.u()) && (this.a != null);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bcy
 * JD-Core Version:    0.7.0.1
 */