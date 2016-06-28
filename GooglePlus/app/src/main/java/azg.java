import android.content.Context;

final class azg
  extends gzf
{
  azg(azd paramazd, Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  protected final hae a()
  {
    mbf localmbf = this.a.bn;
    int i = this.a.a;
    synchronized (brx.a)
    {
      blu localblu;
      if (!brx.b)
      {
        ((giz)mbb.a(localmbf, giz.class)).a(i).b("gaia_id");
        localblu = new blu(localmbf, new kcg(localmbf, i), i, 1, null);
        localblu.i();
        if (!localblu.n()) {
          brx.b = true;
        }
      }
      else
      {
        azd.b = false;
        azd.c = true;
        return new hae(true);
      }
      localblu.c("EsPhotosFeatures");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azg
 * JD-Core Version:    0.7.0.1
 */