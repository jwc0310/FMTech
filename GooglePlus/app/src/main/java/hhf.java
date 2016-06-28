import android.database.Cursor;
import android.graphics.Color;

public class hhf
{
  public final String a;
  public final Cursor b;
  public final boolean c;
  
  public hhf(Cursor paramCursor, String paramString)
  {
    this.b = paramCursor;
    this.a = paramString;
    this.c = false;
  }
  
  public hhf(boolean paramBoolean)
  {
    this.b = null;
    this.a = null;
    this.c = true;
  }
  
  public int a()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.getCount();
  }
  
  public Cursor a(int paramInt)
  {
    return a(paramInt, paramInt + 1);
  }
  
  public Cursor a(int paramInt1, int paramInt2)
  {
    hqr localhqr = new hqr(hoi.a);
    int i = Math.max(0, paramInt1);
    int j = Math.min(paramInt2, a());
    while (i < j)
    {
      Object[] arrayOfObject = new Object[hoi.a.length];
      qpk localqpk = efj.a(this.b, i).a;
      arrayOfObject[localhqr.getColumnIndexOrThrow("cxn_id")] = localqpk.a;
      arrayOfObject[localhqr.getColumnIndexOrThrow("cxn_name")] = localqpk.b;
      arrayOfObject[localhqr.getColumnIndexOrThrow("cover_photo_url")] = localqpk.c;
      if ((localqpk.d != null) && (localqpk.d.a != null) && (localqpk.d.a.length > 0))
      {
        arrayOfObject[localhqr.getColumnIndexOrThrow("owner_display_name")] = localqpk.d.a[0].b;
        arrayOfObject[localhqr.getColumnIndexOrThrow("owner_gaia_id")] = localqpk.d.a[0].a;
        arrayOfObject[localhqr.getColumnIndexOrThrow("owner_photo_url")] = localqpk.d.a[0].c;
      }
      if (localqpk.f != null) {
        arrayOfObject[localhqr.getColumnIndexOrThrow("color")] = Integer.valueOf(Color.rgb(localqpk.f.a.intValue(), localqpk.f.b.intValue(), localqpk.f.c.intValue()));
      }
      if (localqpk.g != null) {
        arrayOfObject[localhqr.getColumnIndexOrThrow("visibility_type")] = Integer.valueOf(localqpk.g.a);
      }
      arrayOfObject[localhqr.getColumnIndexOrThrow("follow_state")] = Integer.valueOf(efj.g(localqpk.e));
      localhqr.a(arrayOfObject);
      i++;
    }
    return localhqr;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public void d()
  {
    if (this.b != null) {
      this.b.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hhf
 * JD-Core Version:    0.7.0.1
 */