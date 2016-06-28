import android.content.Context;

final class cwd
  extends gzf
{
  private final int a;
  
  cwd(Context paramContext, int paramInt)
  {
    super(paramContext, "RegisterGcmTask");
    this.a = paramInt;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    jal localjal = ((jaa)mbb.a(this.e, jaa.class)).a(this.a, jaj.b);
    if (localjal.a == jam.a) {}
    for (int i = 200;; i = 0) {
      return new hae(i, localjal.b, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwd
 * JD-Core Version:    0.7.0.1
 */