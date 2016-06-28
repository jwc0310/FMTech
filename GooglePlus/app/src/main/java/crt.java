import android.content.Context;

public final class crt
  implements hat
{
  private static final mfl a = new mfl("debug.plus.skiplastoncheck", "FALSE");
  private final Context b;
  
  public crt(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    ((hba)mbb.a(paramContext, hba.class)).a(paramInt, paramString);
  }
  
  private final boolean a(int paramInt)
  {
    try
    {
      if (!hbj.k(this.b, paramInt))
      {
        new StringBuilder(60).append("Don't have entries for AB, skip check. account = ").append(paramInt);
        throw new cru(this);
      }
    }
    catch (hbk localhbk)
    {
      throw new cru(this);
    }
    boolean bool = hbj.a(this.b, paramInt, 1400544000000L);
    new StringBuilder(70).append("Has old unuploaded tracked photos. account = ").append(paramInt).append(" value = ").append(bool);
    if (!bool)
    {
      ojl localojl = new ojl();
      localojl.l = Boolean.valueOf(true);
      String str = ((giz)mbb.a(this.b, giz.class)).a(paramInt).b("gaia_id");
      jru localjru = new jru(this.b, new kcg(this.b, paramInt, true, null), str, localojl);
      localjru.i();
      if (localjru.n())
      {
        new StringBuilder(47).append("Server RPC had an error for account ").append(paramInt);
        throw new cru(this);
      }
      bool = localjru.a.l.booleanValue();
      new StringBuilder(60).append("The server reminder setting for account ").append(paramInt).append(" is ").append(bool);
    }
    return bool;
  }
  
  public final void a()
  {
    hba localhba = (hba)mbb.a(this.b, hba.class);
    int i = localhba.d();
    if (i == -1) {}
    do
    {
      long l;
      do
      {
        do
        {
          return;
        } while (!((hyi)mbb.a(this.b, hyi.class)).b(bwb.C, i));
        if (!a.a.equalsIgnoreCase("FALSE")) {
          break;
        }
        l = localhba.c(i).a("auto_backup_last_turned_on_at", 0L);
        new StringBuilder(62).append("The last time this user turned on ab was: ").append(l);
      } while (l > 0L);
    } while (localhba.c(i).b("auto_backup_reminder_completed_type") != null);
    try
    {
      boolean bool = a(i);
      if (bool)
      {
        efj.a(this.b, i, false);
        hcw.c(this.b, i);
        return;
      }
      hcw.d(this.b, i);
      localhba.a(i, "auto_backup_general_reminder");
      return;
    }
    catch (cru localcru) {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     crt
 * JD-Core Version:    0.7.0.1
 */