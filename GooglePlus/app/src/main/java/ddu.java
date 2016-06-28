import com.google.android.apps.plus.phone.PanoramaViewerActivity;

public final class ddu
  implements Runnable
{
  public ddu(PanoramaViewerActivity paramPanoramaViewerActivity) {}
  
  public final void run()
  {
    PanoramaViewerActivity localPanoramaViewerActivity = this.a;
    if ((!localPanoramaViewerActivity.isFinishing()) && (localPanoramaViewerActivity.d.q != 1))
    {
      bz localbz = localPanoramaViewerActivity.b.a.d;
      if (localbz.a("progress") == null) {
        coo.a(null, localPanoramaViewerActivity.getString(aau.jo)).a(localbz, "progress");
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddu
 * JD-Core Version:    0.7.0.1
 */