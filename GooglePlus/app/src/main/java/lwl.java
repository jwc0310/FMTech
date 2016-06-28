import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Pair;
import java.util.ArrayList;

final class lwl
  extends ContentObserver
{
  lwl(lwj paramlwj, Handler paramHandler, Resources paramResources)
  {
    super(paramHandler);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    int i = lwj.a.size();
    for (int j = 0; j < i; j++)
    {
      Pair localPair = (Pair)lwj.a.get(j);
      ((TextPaint)localPair.first).setTextSize(this.a.getDimension(((Integer)localPair.second).intValue()));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwl
 * JD-Core Version:    0.7.0.1
 */