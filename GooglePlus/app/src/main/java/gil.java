import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import java.util.HashMap;

public final class gil
  implements DialogInterface.OnClickListener
{
  public HashMap<String, gim> a;
  private gim b;
  private bp c;
  
  gil(Activity paramActivity)
  {
    if (!(paramActivity instanceof bp)) {
      throw new IllegalArgumentException("Must instantiate the AccessibilityMenuHelper with a FragmentActivity.");
    }
    this.c = ((bp)paramActivity);
    this.a = new HashMap();
  }
  
  public final gim a(String paramString)
  {
    if (this.a.containsKey(paramString)) {
      return (gim)this.a.get(paramString);
    }
    return null;
  }
  
  public final void a(gim paramgim)
  {
    String str = paramgim.r();
    if (this.a.containsKey(str)) {
      this.a.remove(str);
    }
  }
  
  public final void b(gim paramgim)
  {
    efj.e(paramgim, "Handler must be non-null");
    this.b = paramgim;
    if (paramgim.g().size() == 0) {}
    bk localbk;
    do
    {
      return;
      localbk = this.c.b.a.d.a("AccessibilityMenu");
    } while ((localbk != null) && ((localbk instanceof bj)) && (((bj)localbk).d.isShowing()));
    gij.a(this.c, paramgim, paramgim.r()).a(this.c.b.a.d, "AccessibilityMenu");
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.b == null)
    {
      bk localbk = this.c.b.a.d.a("AccessibilityMenu");
      if (!(localbk instanceof gij)) {
        return;
      }
      this.b = ((gim)this.a.get(((gij)localbk).m.getString("dialogIdTag")));
    }
    la localla = this.b.g();
    int[] arrayOfInt = new int[localla.size()];
    for (int i = 0; i < localla.size(); i++) {
      arrayOfInt[i] = ((Integer)localla.b[(i << 1)]).intValue();
    }
    if (paramInt == arrayOfInt.length)
    {
      paramDialogInterface.dismiss();
      return;
    }
    this.b.a(arrayOfInt[paramInt]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gil
 * JD-Core Version:    0.7.0.1
 */