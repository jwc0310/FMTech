import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.EnumMap;

public final class bcq
  extends bcv
{
  public static final Parcelable.Creator<bcq> CREATOR = new bcr();
  private final bcu G;
  private final bcp H;
  private final bcp I;
  final long a;
  final int b;
  final int c;
  
  protected bcq(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readLong();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    if (this.d == null)
    {
      this.G = null;
      this.I = null;
      this.H = null;
      return;
    }
    this.G = bcu.a(this.d, (ipf)this.f.get(bcx.a));
    this.I = a(this.G);
    this.H = b(this.G);
  }
  
  protected bcq(bcw parambcw)
  {
    super(parambcw);
    this.G = bcu.a(parambcw.d, (ipf)parambcw.f.get(bcx.a));
    if ((parambcw instanceof bct))
    {
      bct localbct = (bct)parambcw;
      this.a = localbct.a;
      this.b = localbct.b;
      this.c = localbct.c;
      if (Log.isLoggable("OneUpProxyAllPhotos", 3))
      {
        String str = String.valueOf(this.G.name());
        if (str.length() == 0) {
          break label148;
        }
        "Creating proxy with type: ".concat(str);
      }
    }
    for (;;)
    {
      this.I = a(this.G);
      this.H = b(this.G);
      return;
      this.a = -1L;
      this.b = 0;
      this.c = 0;
      break;
      label148:
      new String("Creating proxy with type: ");
    }
  }
  
  private final bcp V()
  {
    if (this.H != null) {
      return this.H;
    }
    return this.I;
  }
  
  private final bcp a(bcu parambcu)
  {
    switch (bcs.a[parambcu.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("Unknown ProxyType");
    case 1: 
    case 2: 
      bda localbda = new bda();
      localbda.a(this);
      localbda.b = this.b;
      localbda.c = this.c;
      return localbda.a();
    }
    return null;
  }
  
  private final bcp b(bcu parambcu)
  {
    switch (bcs.a[parambcu.ordinal()])
    {
    default: 
      throw new IllegalArgumentException("Unknown ProxyType");
    case 2: 
    case 3: 
      return new bdd().a(this).a();
    }
    return null;
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final boolean B()
  {
    return V().B();
  }
  
  public final boolean D()
  {
    return this.H != null;
  }
  
  public final boolean K()
  {
    boolean bool1 = this.F.c();
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.d.getBoolean("selected_only", false);
      bool2 = false;
      if (!bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final boolean L()
  {
    return c(e());
  }
  
  public final boolean M()
  {
    return true;
  }
  
  public final boolean O()
  {
    boolean bool = super.O();
    if ((!bool) && (this.I != null)) {
      bool = this.I.O();
    }
    return bool;
  }
  
  public final int R()
  {
    return V().R();
  }
  
  public final int S()
  {
    return V().S();
  }
  
  public final bcw U()
  {
    return new bct();
  }
  
  public final Intent a(Context paramContext, int paramInt)
  {
    if (V() == this.H)
    {
      boolean bool1 = this.F.c();
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      return a(paramContext, paramInt, e(), bool2);
    }
    return a(paramContext, paramInt, e(), false);
  }
  
  public final Intent b(Context paramContext)
  {
    return V().b(paramContext);
  }
  
  public final jpx c()
  {
    return (jpx)this.E.b.a(bpt.a, new bpu(this.a));
  }
  
  public final Intent d(Context paramContext)
  {
    if ((!super.O()) && (this.I != null)) {
      return this.I.d(paramContext);
    }
    return super.d(paramContext);
  }
  
  public final jpx d()
  {
    return new bpr(this.a, (ipf)this.f.get(bcx.a), this.C, f(), this.z);
  }
  
  public final boolean v()
  {
    return V().v();
  }
  
  public final boolean w()
  {
    return false;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
  }
  
  public final boolean x()
  {
    return false;
  }
  
  public final boolean y()
  {
    return V().y();
  }
  
  public final boolean z()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bcq
 * JD-Core Version:    0.7.0.1
 */