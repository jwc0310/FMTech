import android.content.Context;

public final class bom
  extends gzf
{
  private final int a;
  
  public bom(Context paramContext, int paramInt)
  {
    super(paramContext, "UnregisterGcmTask");
    this.a = paramInt;
  }
  
  public final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    jal localjal = ((jaa)mbb.a(this.e, jaa.class)).a(this.a);
    if (localjal.a == jam.a) {}
    for (int i = 200;; i = 0) {
      return new hae(i, localjal.b, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bom
 * JD-Core Version:    0.7.0.1
 */