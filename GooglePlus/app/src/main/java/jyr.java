import android.content.res.Resources;

final class jyr
  implements Runnable
{
  jyr(jyq paramjyq) {}
  
  public final void run()
  {
    Resources localResources = this.a.a.getResources();
    lut locallut = lut.b(localResources.getString(efj.TT), localResources.getString(efj.TS), localResources.getString(aw.eA), null);
    locallut.b(false);
    locallut.a(this.a.a.b.a.d, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyr
 * JD-Core Version:    0.7.0.1
 */