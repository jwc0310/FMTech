import android.graphics.Bitmap;
import android.widget.Toast;

final class ayn
  extends dme
{
  ayn(ayk paramayk) {}
  
  public final void a(int paramInt, dmx paramdmx, Bitmap paramBitmap)
  {
    bp localbp = this.a.f();
    if ((!a(paramInt, paramdmx)) || (localbp == null)) {}
    while (paramBitmap == null) {
      return;
    }
    new jg(localbp).a.a("ImagePrint", paramBitmap, null);
  }
  
  final boolean a(int paramInt, dmx paramdmx)
  {
    if ((this.a.b == null) || (this.a.b.intValue() != paramInt)) {
      return false;
    }
    this.a.b = null;
    efj.a(this.a.x);
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1; i != 0; i = 0)
      {
        Toast.makeText(this.a.f().getApplicationContext(), aau.mm, 0).show();
        return false;
      }
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ayn
 * JD-Core Version:    0.7.0.1
 */