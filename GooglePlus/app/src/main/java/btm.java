import android.database.Cursor;

final class btm
  implements btx
{
  private ojf a = null;
  
  btm(btl parambtl, int paramInt, Cursor paramCursor) {}
  
  public final int a()
  {
    return this.d.k.a;
  }
  
  public final String b()
  {
    return mar.a(g());
  }
  
  public final int c()
  {
    return this.b;
  }
  
  public final String d()
  {
    return this.c.getString(0);
  }
  
  public final String e()
  {
    return this.c.getString(4);
  }
  
  public final Long f()
  {
    return Long.valueOf(this.c.getLong(2));
  }
  
  public final ojf g()
  {
    if (this.a == null) {
      this.a = btl.a(this.c.getBlob(3));
    }
    return this.a;
  }
  
  public final int h()
  {
    return this.c.getInt(1);
  }
  
  public final boolean i()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btm
 * JD-Core Version:    0.7.0.1
 */