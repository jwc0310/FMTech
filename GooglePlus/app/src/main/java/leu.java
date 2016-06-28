import android.content.Context;
import android.content.res.Resources;
import android.widget.ArrayAdapter;

public final class leu
  extends ArrayAdapter<lev>
{
  private kyd a;
  private kyc b;
  
  public leu(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    setDropDownViewResource(17367049);
    this.a = ((kyd)mbb.a(paramContext, kyd.class));
    this.b = ((kyc)mbb.a(paramContext, kyc.class));
  }
  
  public final int a(int paramInt)
  {
    int i = getCount();
    for (int j = 0; j < i; j++) {
      if (((lev)getItem(j)).a == paramInt) {
        return j;
      }
    }
    return 0;
  }
  
  public final void a()
  {
    Resources localResources = getContext().getResources();
    clear();
    add(new lev(localResources.getString(eu.p), 1));
    add(new lev(localResources.getString(eu.t), 2));
    int i = this.a.O();
    if ((i == 2) || (i == 1)) {}
    for (int j = 1;; j = 0)
    {
      if (j != 0)
      {
        if (this.b.a() == 1) {
          add(new lev(localResources.getString(eu.q), 3));
        }
        add(new lev(localResources.getString(eu.r), 4));
        add(new lev(localResources.getString(eu.s), 5));
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     leu
 * JD-Core Version:    0.7.0.1
 */