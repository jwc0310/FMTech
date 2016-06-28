import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public final class lzs
  extends mca
  implements hrn, lzp
{
  private String a;
  private boolean b;
  private hrf c;
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return null;
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    TextView localTextView = (TextView)paramView.findViewById(efj.aaK);
    Resources localResources = g();
    int i = efj.aaM;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    localTextView.setText(localResources.getString(i, arrayOfObject));
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.a = paramBundle.getString("state_query");
      this.b = paramBundle.getBoolean("state_show_empty_view");
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.c = paramhrf;
  }
  
  public final void a(String paramString)
  {
    this.a = paramString;
    if ((TextUtils.isEmpty(paramString)) && (this.b))
    {
      this.b = false;
      if (this.c != null) {
        this.c.aL_();
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b != paramBoolean)
    {
      this.b = paramBoolean;
      if (this.c != null) {
        this.c.aL_();
      }
    }
  }
  
  public final View b(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(efj.aaL, null);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    ((lzo)this.bo.a(lzo.class)).a(this);
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("state_query", this.a);
    paramBundle.putBoolean("state_show_empty_view", this.b);
  }
  
  public final boolean v()
  {
    return false;
  }
  
  public final boolean w()
  {
    return false;
  }
  
  public final int x()
  {
    if ((this.b) && (!TextUtils.isEmpty(this.a))) {
      return 1;
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzs
 * JD-Core Version:    0.7.0.1
 */