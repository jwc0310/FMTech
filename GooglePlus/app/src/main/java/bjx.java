import android.content.Context;
import java.util.List;

public final class bjx
  extends cun<mxx, mxy>
{
  private final ivn a;
  
  public bjx(Context paramContext, int paramInt, ivn paramivn)
  {
    super(paramContext, paramInt, "photosmoviemakeredits", new mxx(), new mxy());
    this.a = paramivn;
  }
  
  private static nrb a(ivp paramivp)
  {
    int i = 1;
    if (paramivp == null) {
      return null;
    }
    nrb localnrb = new nrb();
    int j;
    switch (paramivp.a)
    {
    default: 
      j = 0;
      localnrb.a = j;
      localnrb.b = paramivp.b;
      localnrb.c = Long.valueOf(paramivp.c);
      localnrb.d = Long.valueOf(paramivp.d);
      switch (paramivp.e)
      {
      default: 
        i = 0;
      }
      break;
    }
    for (;;)
    {
      localnrb.e = i;
      return localnrb;
      j = i;
      break;
      j = 2;
      break;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 4;
      continue;
      i = 5;
    }
  }
  
  private static nrb[] a(List<ivp> paramList)
  {
    if (paramList == null) {
      return null;
    }
    int i = paramList.size();
    nrb[] arrayOfnrb = new nrb[i];
    for (int j = 0; j < i; j++) {
      arrayOfnrb[j] = a((ivp)paramList.get(j));
    }
    return arrayOfnrb;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bjx
 * JD-Core Version:    0.7.0.1
 */