final class jlw
  implements Runnable
{
  jlw(jlv paramjlv) {}
  
  public final void run()
  {
    jlu localjlu = this.a.a;
    if (localjlu.e)
    {
      localjlu.e = false;
      localjlu.b.a(localjlu);
      return;
    }
    localjlu.b.Q_();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlw
 * JD-Core Version:    0.7.0.1
 */