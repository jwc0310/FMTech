import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class guz
  implements mbo, mes, mfa, mfd
{
  private gvh a;
  private gve b;
  private gvg c;
  
  public guz(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(int paramInt)
  {
    if (TextUtils.isEmpty(this.c.a(paramInt))) {
      throw new IllegalArgumentException("You must use a resource id as the request code to guarantee overlap does not occur");
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = ((gvh)parammbb.a(gvh.class));
    this.c = ((gvg)parammbb.a(gvg.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.b = ((gve)paramBundle.getParcelable("requestcodehelper_pending_requests"));
      return;
    }
    this.b = new gve();
  }
  
  public final void a(gva paramgva)
  {
    Iterator localIterator = new ArrayList(this.b.a.keySet()).iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger1 = (Integer)localIterator.next();
      Integer localInteger2 = (Integer)this.b.a.get(localInteger1);
      paramgva.a(localInteger1.intValue(), localInteger2.intValue());
    }
  }
  
  public final boolean a(int paramInt, gvd paramgvd)
  {
    Iterator localIterator = this.b.a.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (((Integer)this.b.a.get(localInteger)).intValue() == paramInt)
      {
        paramgvd.a(localInteger.intValue());
        return true;
      }
    }
    return false;
  }
  
  public final int b(int paramInt)
  {
    gve localgve1 = this.b;
    Integer localInteger1 = Integer.valueOf(paramInt);
    Integer localInteger2 = (Integer)localgve1.a.get(localInteger1);
    if (localInteger2 == null)
    {
      gvh localgvh = this.a;
      int i = localgvh.a;
      localgvh.a = (i + 1);
      localInteger2 = Integer.valueOf(i);
      gve localgve2 = this.b;
      Integer localInteger3 = Integer.valueOf(paramInt);
      localgve2.a.put(localInteger3, localInteger2);
    }
    return localInteger2.intValue();
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelable("requestcodehelper_pending_requests", this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     guz
 * JD-Core Version:    0.7.0.1
 */