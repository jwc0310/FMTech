import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

public final class bwm
  extends cos
{
  private final cff a;
  
  public bwm(Context paramContext, int paramInt, cow paramcow, cff paramcff)
  {
    super(paramContext, paramInt, paramcow, false);
    this.a = paramcff;
  }
  
  public final void a()
  {
    Intent localIntent = efj.b(this.g, this.f, 0);
    this.a.b(localIntent);
  }
  
  protected final void a(View paramView)
  {
    int i = bua.e(this.g, this.f);
    if (i <= 0)
    {
      if (dun.b()) {
        throw new IllegalStateException(52 + "Auto Awesome promo shown for " + i + " new movies.");
      }
    }
    else
    {
      ((ivl)mbb.a(this.g, ivl.class)).h();
      TextView localTextView = (TextView)paramView.findViewById(aaw.ic);
      Resources localResources = localTextView.getResources();
      int j = efj.xD;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      localTextView.setText(localResources.getQuantityString(j, i, arrayOfObject));
    }
  }
  
  public final boolean a(ojj paramojj)
  {
    return (super.a(paramojj)) && (bua.f(this.g, this.f));
  }
  
  public final void b()
  {
    bua.a(this.g, this.f, true, new buf(this));
  }
  
  public final int d()
  {
    return efj.sM;
  }
  
  public final coq e()
  {
    return coq.e;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwm
 * JD-Core Version:    0.7.0.1
 */