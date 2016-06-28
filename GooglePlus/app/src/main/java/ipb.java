import android.content.Context;
import android.graphics.RectF;

public class ipb
{
  public final ifj a;
  private ipk b = null;
  
  public ipb(Context paramContext)
  {
    this.a = ((ifj)mbb.a(paramContext, ifj.class));
  }
  
  private final iph a(ipk paramipk, kbb paramkbb)
  {
    iph localiph = (iph)this.a.a(paramipk);
    if (localiph == null) {
      localiph = new iph(this.a, paramipk);
    }
    for (;;)
    {
      this.a.a(localiph, paramkbb);
      return localiph;
      paramipk.b = this.b;
      this.b = paramipk;
    }
  }
  
  public final iph a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3)
  {
    return a(a(paramipf, 0, paramInt1, paramInt2, -1, null, null, paramInt3));
  }
  
  public final iph a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, RectF paramRectF, ioy paramioy, int paramInt5, kbb paramkbb)
  {
    return a(a(paramipf, paramInt1, paramInt2, paramInt3, paramInt4, paramRectF, paramioy, paramInt5), paramkbb);
  }
  
  public final iph a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3, ioy paramioy, int paramInt4, kbb paramkbb)
  {
    return a(a(paramipf, paramInt1, paramInt2, paramInt3, -1, null, null, paramInt4), paramkbb);
  }
  
  public final iph a(ipf paramipf, int paramInt1, int paramInt2, kbb paramkbb)
  {
    return a(paramipf, 0, paramInt1, paramInt2, null, 0, paramkbb);
  }
  
  public final iph a(ipf paramipf, int paramInt1, ioy paramioy, int paramInt2, kbb paramkbb)
  {
    return a(a(paramipf, paramInt1, 0, 0, -1, null, paramioy, paramInt2), paramkbb);
  }
  
  public final iph a(ipf paramipf, int paramInt, kbb paramkbb)
  {
    return a(paramipf, paramInt, null, 0, paramkbb);
  }
  
  public final iph a(ipk paramipk)
  {
    iph localiph1 = (iph)this.a.a(paramipk);
    if (localiph1 == null)
    {
      iph localiph2 = new iph(this.a, paramipk);
      this.a.c(localiph2);
      return localiph2;
    }
    paramipk.b = this.b;
    this.b = paramipk;
    return localiph1;
  }
  
  public final ipk a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, RectF paramRectF, ioy paramioy, int paramInt5)
  {
    ipk localipk;
    if (this.b != null)
    {
      localipk = this.b;
      this.b = this.b.b;
      localipk.b = null;
    }
    for (;;)
    {
      localipk.a(paramInt5, paramipf, paramInt1, paramInt2, paramInt3, paramInt4, paramRectF, paramioy);
      return localipk;
      localipk = new ipk();
    }
  }
  
  public final Object a(ipf paramipf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new ipc(this, null, paramipf, paramInt1, paramInt2, paramInt3, paramInt4).a();
  }
  
  public final String a(ipf paramipf, int paramInt1, int paramInt2)
  {
    ipk localipk = a(paramipf, paramInt1, 0, 0, -1, null, null, 17410);
    return new iph(this.a, localipk).b();
  }
  
  public final iph b(ipf paramipf, int paramInt1, int paramInt2)
  {
    return a(a(paramipf, paramInt1, 0, 0, -1, null, null, paramInt2));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ipb
 * JD-Core Version:    0.7.0.1
 */