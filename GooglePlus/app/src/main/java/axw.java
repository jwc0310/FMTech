import android.os.Bundle;

public class axw
  extends bbx<bdg>
{
  bdg a;
  String b;
  
  public axw()
  {
    new jeq(this.bp, new axx(this), '\000');
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (this.b == null) {
      this.b = this.m.getString("tile_id");
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((bdg)this.bo.a(bdg.class));
  }
  
  public final boolean v()
  {
    String str = this.b;
    boolean bool = false;
    if (str != null)
    {
      k().b(0, this.m, new axy(this));
      bool = true;
    }
    return bool;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axw
 * JD-Core Version:    0.7.0.1
 */