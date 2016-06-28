import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.Iterator;
import java.util.List;

final class doy
  implements DialogInterface.OnClickListener
{
  private final List<Integer> a;
  private final Context b;
  
  doy(Context paramContext, List<Integer> paramList)
  {
    this.b = paramContext;
    this.a = paramList;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      paramDialogInterface.dismiss();
      return;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        hbj.b();
        hbj.f(this.b, localInteger.intValue());
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     doy
 * JD-Core Version:    0.7.0.1
 */