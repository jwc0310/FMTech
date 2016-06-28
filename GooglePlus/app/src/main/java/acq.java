import android.content.Context;
import android.view.View;

final class acq
  extends xx
{
  public acq(acl paramacl, Context paramContext, xl paramxl, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramxl, paramView, true, aau.D);
    this.i = 8388613;
    this.g = paramacl.o;
  }
  
  public final void onDismiss()
  {
    super.onDismiss();
    this.j.c.close();
    this.j.l = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acq
 * JD-Core Version:    0.7.0.1
 */