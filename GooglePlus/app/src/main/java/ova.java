public final class ova
  implements Runnable
{
  public ova(pid parampid, pic parampic) {}
  
  public final void run()
  {
    if (this.a.isCancelled()) {
      this.b.cancel(true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ova
 * JD-Core Version:    0.7.0.1
 */