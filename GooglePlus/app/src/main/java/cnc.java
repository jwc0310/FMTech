import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

final class cnc
  implements DialogInterface.OnClickListener
{
  cnc(cna paramcna, View paramView) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.as.removeView(this.b);
    if (Build.VERSION.SDK_INT < 11)
    {
      cnd localcnd = new cnd(this);
      efj.m().post(localcnd);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cnc
 * JD-Core Version:    0.7.0.1
 */