import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import java.util.Set;

public final class jxz
  implements jxt, jxw, mdp, mfd
{
  private final bp a;
  private final jxu b;
  private final jeo<jxt> c = new jem(this);
  private bk d;
  private jxv e;
  private bk f;
  
  public jxz(bp parambp, mek parammek, jxu paramjxu)
  {
    this.a = parambp;
    this.b = paramjxu;
    this.e = new jxv(this);
    parammek.a(this);
  }
  
  private final void b(bk parambk)
  {
    if (Log.isLoggable("PrimaryFragment", 3)) {
      String.format(Locale.US, "onPrimaryFragmentActivated fragment=%s", new Object[] { parambk });
    }
    this.f = null;
    this.d = parambk;
    this.c.a();
  }
  
  public final jxz a(mbb parammbb)
  {
    parammbb.a(jxt.class, this);
    parammbb.a(jxv.class, this.e);
    return this;
  }
  
  public final void a(bk parambk)
  {
    if (parambk == this.f) {
      b(this.f);
    }
  }
  
  public final mbb aE_()
  {
    return mbb.a(this.a, this.d);
  }
  
  public final jeo<jxt> b()
  {
    return this.c;
  }
  
  public final void b_(Bundle paramBundle)
  {
    c();
  }
  
  public final void c()
  {
    Object localObject1 = this.b.H_();
    Object localObject2 = null;
    if ((localObject2 != localObject1) && (localObject1 != null))
    {
      if ((localObject1 instanceof jxu)) {}
      for (bk localbk1 = ((jxu)localObject1).H_();; localbk1 = null)
      {
        bk localbk2 = localbk1;
        localObject2 = localObject1;
        localObject1 = localbk2;
        break;
      }
    }
    if (localObject2 == this.d) {}
    for (;;)
    {
      return;
      if (this.e.b.contains(localObject2)) {
        b(localObject2);
      }
      while (Log.isLoggable("PrimaryFragment", 3))
      {
        String.format(Locale.US, "invalidate() fragment=%s", new Object[] { localObject2 });
        return;
        this.f = localObject2;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxz
 * JD-Core Version:    0.7.0.1
 */