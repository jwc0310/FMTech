import android.content.Context;

public final class bnj
  extends gzf
{
  private int a;
  
  public bnj(Context paramContext, int paramInt)
  {
    super(paramContext, "GetTrashPhotosTask");
    this.a = paramInt;
  }
  
  protected final hae a()
  {
    try
    {
      efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
      hae localhae = new hae(bvf.a(this.e, this.a));
      return localhae;
    }
    catch (Exception localException) {}
    return new hae(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnj
 * JD-Core Version:    0.7.0.1
 */