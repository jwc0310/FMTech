final class cbk
  implements Runnable
{
  cbk(cbj paramcbj) {}
  
  public final void run()
  {
    if (this.a.c != null) {
      this.a.c.notifyDataSetChanged();
    }
    this.a.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbk
 * JD-Core Version:    0.7.0.1
 */