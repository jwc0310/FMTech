final class hwj
  implements Runnable
{
  hwj(hwi paramhwi) {}
  
  public final void run()
  {
    bj localbj = (bj)this.a.a.b.a.d.a("editor_dialog_tag");
    if (localbj != null)
    {
      localbj.a(true);
      if (this.a.b != null) {
        this.a.b.a();
      }
    }
    this.a.c = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwj
 * JD-Core Version:    0.7.0.1
 */