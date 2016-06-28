import android.content.Context;

public final class kch
{
  public String a;
  public String b;
  public boolean c;
  public kbo d;
  public boolean e;
  public kbx f;
  
  public final kcg a()
  {
    if (this.a != null) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Authenticated request requires account name");
      efj.d(true, "Unauthenticated request should not specify account name");
      return new kcg(this);
    }
  }
  
  public final kch a(Context paramContext, int paramInt)
  {
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    if (localgjb != null) {}
    for (boolean bool = true;; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      efj.b(bool, "Account id %s not found", arrayOfObject);
      this.a = localgjb.b("account_name");
      this.b = localgjb.b("effective_gaia_id");
      return this;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kch
 * JD-Core Version:    0.7.0.1
 */