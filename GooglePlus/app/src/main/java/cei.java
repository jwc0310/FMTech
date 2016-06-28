import android.database.DataSetObserver;

final class cei
  extends DataSetObserver
{
  cei(ceg paramceg) {}
  
  public final void onChanged()
  {
    cv localcv = this.a.k();
    if (!this.a.aj)
    {
      localcv.b(1, null, this.a.b);
      this.a.aj = true;
    }
    if (!this.a.ak)
    {
      this.a.ak = true;
      localcv.b(2, null, this.a.a);
    }
    if (!this.a.al)
    {
      localcv.b(3, null, this.a.c);
      this.a.al = true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cei
 * JD-Core Version:    0.7.0.1
 */