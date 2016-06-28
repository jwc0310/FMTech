final class gsg
  implements Runnable
{
  gsg(gsf paramgsf) {}
  
  public final void run()
  {
    if ((this.a.f != null) && (this.a.f.i()))
    {
      this.a.f.a(false);
      this.a.f = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gsg
 * JD-Core Version:    0.7.0.1
 */