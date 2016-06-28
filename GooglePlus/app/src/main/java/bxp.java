import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class bxp
  extends bxg
  implements cw<Cursor>
{
  private static String[] ae;
  private static int[] af;
  private String ag;
  private String ah;
  private boolean ai;
  private int aj;
  private boolean ak;
  private Cursor al;
  private boolean am;
  private boolean an;
  
  protected int C()
  {
    return 1;
  }
  
  protected final String D()
  {
    return this.ag;
  }
  
  protected final Bundle F()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBundle("extra_start_view_extras", gxy.a("extra_circle_id", this.ag));
    return localBundle;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    ((TextView)localView.findViewById(aaw.kF)).setText(aau.dJ);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return new jma(f(), this.a, 2);
    }
    return new jmc(f(), this.a, this.ag, C());
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (ae == null)
    {
      String[] arrayOfString = new String[4];
      int i = aau.dF;
      arrayOfString[0] = g().getString(i);
      int j = aau.dI;
      arrayOfString[1] = g().getString(j);
      int k = aau.dE;
      arrayOfString[2] = g().getString(k);
      int m = aau.dG;
      arrayOfString[3] = g().getString(m);
      ae = arrayOfString;
      af = new int[] { 3, 2, 1, 0 };
    }
    this.d = ae;
    this.Z = af;
    this.ag = this.m.getString("circle_id");
    cv localcv = k();
    localcv.a(1, null, this);
    localcv.a(2, null, this);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString1, String paramString2)
  {
    int i = 1;
    if (TextUtils.isEmpty(paramString2)) {
      return;
    }
    String str1 = paramString2.trim();
    if (this.al != null)
    {
      if (this.al.moveToFirst())
      {
        String str2 = this.al.getString(0);
        if ((!str1.equalsIgnoreCase(this.al.getString(i))) || (TextUtils.equals(paramString1, str2))) {}
      }
      for (;;)
      {
        if (i == 0) {
          break label110;
        }
        Toast.makeText(f(), aau.uP, 0).show();
        return;
        if (this.al.moveToNext()) {
          break;
        }
        i = 0;
      }
    }
    label110:
    this.c.b = str1;
    z();
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
  }
  
  public final void m()
  {
    super.m();
    cv localcv = k();
    localcv.b(1, null, this);
    localcv.b(2, null, this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxp
 * JD-Core Version:    0.7.0.1
 */