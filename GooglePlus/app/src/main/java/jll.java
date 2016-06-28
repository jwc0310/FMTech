import android.content.Context;

public final class jll
  implements inj
{
  private final Context a;
  
  public jll(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void a(gje paramgje, mtu parammtu)
  {
    int i = 1;
    oan localoan = parammtu.a;
    oap localoap = localoan.b;
    int j;
    if ((localoap.b.booleanValue()) || (!efj.b(localoap.e)))
    {
      j = i;
      if (localoan.a != i) {
        break label88;
      }
    }
    for (;;)
    {
      if ((j != 0) && (i == 0)) {
        ((jia)mbb.a(this.a, jia.class)).a(paramgje, localoan.e);
      }
      return;
      j = 0;
      break;
      label88:
      i = 0;
    }
  }
  
  public final boolean a(gjb paramgjb, mtt parammtt)
  {
    jia localjia = (jia)mbb.a(this.a, jia.class);
    if ((!localjia.a(paramgjb)) || (!localjia.b(paramgjb)))
    {
      if (parammtt.a == null) {
        parammtt.a = new oak();
      }
      if (parammtt.a.c == null) {
        parammtt.a.c = new oal();
      }
      parammtt.a.c.a = Boolean.valueOf(true);
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jll
 * JD-Core Version:    0.7.0.1
 */