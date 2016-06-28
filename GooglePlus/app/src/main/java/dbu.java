import android.content.Context;
import android.content.Intent;

public final class dbu
{
  public ipf a;
  public int b;
  public String c;
  public String d;
  public Integer e;
  public Integer f;
  private final Intent g;
  private final int h;
  
  public dbu(Context paramContext, Class<?> paramClass, int paramInt)
  {
    this.g = new Intent(paramContext, paramClass);
    this.h = paramInt;
    this.b = 0;
  }
  
  public final Intent a()
  {
    if (this.b == 0) {
      throw new IllegalArgumentException("Cannot create crop activity with no crop mode.");
    }
    if (this.d != null) {
      this.g.putExtra("tile_id", this.d);
    }
    if (this.c != null) {
      this.g.putExtra("view_id", this.c);
    }
    if (this.a != null) {
      this.g.putExtra("photo_ref", this.a);
    }
    if (this.e != null) {
      this.g.putExtra("photo_min_width", this.e);
    }
    if (this.f != null) {
      this.g.putExtra("photo_min_height", this.f);
    }
    this.g.putExtra("photo_picker_crop_mode", this.b);
    this.g.setAction("android.intent.action.VIEW");
    this.g.putExtra("account_id", this.h);
    return this.g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbu
 * JD-Core Version:    0.7.0.1
 */