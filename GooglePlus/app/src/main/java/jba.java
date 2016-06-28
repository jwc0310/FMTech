import android.content.Context;

public final class jba
  implements ilt
{
  private static final String a = jdr.a(jba.class);
  private giz b;
  private izy c;
  private jaq d;
  private jaa e;
  
  jba(Context paramContext)
  {
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.c = ((izy)mbb.a(paramContext, izy.class));
    this.d = ((jaq)mbb.a(paramContext, jaq.class));
    this.e = ((jaa)mbb.a(paramContext, jaa.class));
  }
  
  public final void a(int paramInt)
  {
    gjb localgjb = this.b.a(paramInt);
    boolean bool;
    if ((localgjb.c("logged_in")) && (this.d.d()))
    {
      bool = true;
      if (bool != localgjb.c("guns_notifications_active"))
      {
        if (!bool) {
          break label151;
        }
        String str2 = a;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(paramInt);
        jdr.a(str2, String.format("Account update complete, automatically registering account [%d].", arrayOfObject2));
        this.e.a(paramInt, jaj.b);
        this.c.a(paramInt, izx.a, jan.d);
      }
    }
    for (;;)
    {
      this.c.a(paramInt, false);
      this.b.b(paramInt).b("guns_notifications_active", bool).d();
      return;
      bool = false;
      break;
      label151:
      String str1 = a;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      jdr.a(str1, String.format("Account [%d] is logged out - unregistering.", arrayOfObject1));
      this.e.a(paramInt);
      this.c.c(paramInt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jba
 * JD-Core Version:    0.7.0.1
 */