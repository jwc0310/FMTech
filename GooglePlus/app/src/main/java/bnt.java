import android.content.Context;

public final class bnt
  extends gzf
{
  private final int a;
  private final String b;
  private final long c;
  private final Context d;
  
  public bnt(Context paramContext, int paramInt, String paramString, long paramLong)
  {
    super(paramContext, "NotificationsReportAbuseTask");
    this.a = paramInt;
    this.b = paramString;
    this.c = paramLong;
    this.d = paramContext;
  }
  
  private final String a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      return this.e.getString(aau.sh);
    }
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.sj);
  }
  
  protected final hae a()
  {
    int i = this.a;
    int k;
    int j;
    String str1;
    Exception localException1;
    if (((jaq)mbb.a(this.d, jaq.class)).d())
    {
      izy localizy = (izy)mbb.a(this.d, izy.class);
      mmw localmmw = new mmw();
      localmmw.a = 1;
      localmmw.c = 0;
      if (!((giz)mbb.a(this.d, giz.class)).c(i)) {
        break label245;
      }
      jal localjal = localizy.a(i, this.b, localmmw);
      if (localjal.a == jam.a)
      {
        k = 200;
        Exception localException2 = localjal.b;
        jam localjam1 = localjal.a;
        jam localjam2 = jam.a;
        boolean bool = false;
        if (localjam1 == localjam2) {
          bool = true;
        }
        String str2 = a(bool);
        j = k;
        str1 = str2;
        localException1 = localException2;
      }
    }
    for (;;)
    {
      return new hae(j, localException1, str1);
      k = 0;
      break;
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      bkn localbkn = new bkn(this.e, i, this.b, this.c);
      localbkn.i();
      j = localbkn.o;
      localException1 = localbkn.q;
      str1 = a(localbkn.n());
      continue;
      label245:
      str1 = "";
      localException1 = null;
      j = 0;
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.sk);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnt
 * JD-Core Version:    0.7.0.1
 */