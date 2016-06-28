import android.content.Context;

public final class kcg
{
  public final String a;
  public final String b;
  public final boolean c;
  public final kbo d;
  public final boolean e;
  public final kbx f;
  
  @Deprecated
  public kcg(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, null, false, null);
  }
  
  @Deprecated
  public kcg(Context paramContext, int paramInt, kbo paramkbo)
  {
    this(paramContext, paramInt, paramkbo, false, null);
  }
  
  private kcg(Context paramContext, int paramInt, kbo paramkbo, boolean paramBoolean, kbx paramkbx)
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
      this.d = paramkbo;
      this.e = paramBoolean;
      this.f = paramkbx;
      this.c = false;
      return;
    }
  }
  
  @Deprecated
  public kcg(Context paramContext, int paramInt, kck paramkck) {}
  
  @Deprecated
  public kcg(Context paramContext, int paramInt, boolean paramBoolean, kbx paramkbx)
  {
    this(paramContext, paramInt, null, paramBoolean, paramkbx);
  }
  
  @Deprecated
  public kcg(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null, false, null, false);
  }
  
  @Deprecated
  public kcg(String paramString1, String paramString2, kbo paramkbo, boolean paramBoolean, kbx paramkbx)
  {
    this(paramString1, paramString2, null, paramBoolean, null, false);
  }
  
  @Deprecated
  private kcg(String paramString1, String paramString2, kbo paramkbo, boolean paramBoolean1, kbx paramkbx, boolean paramBoolean2)
  {
    this.a = ((String)efj.e(paramString1, "accountName"));
    this.b = paramString2;
    this.d = paramkbo;
    this.e = paramBoolean1;
    this.f = paramkbx;
    this.c = false;
  }
  
  kcg(kch paramkch)
  {
    this.a = paramkch.a;
    this.b = paramkch.b;
    this.d = paramkch.d;
    this.e = paramkch.e;
    this.f = paramkch.f;
    if ((paramkch.c) && (paramkch.b != null)) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcg
 * JD-Core Version:    0.7.0.1
 */