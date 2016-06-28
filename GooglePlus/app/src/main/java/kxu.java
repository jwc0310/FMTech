import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.spaces.SpaceListItemView;

public final class kxu
  implements kxq
{
  private Context a;
  
  public kxu(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(aau.BZ, paramViewGroup, false);
    efj.a(localView, new gxq(pkg.d));
    return localView;
  }
  
  public final String a(boolean paramBoolean, String paramString)
  {
    Context localContext = this.a;
    if (paramBoolean) {}
    for (int i = efj.Wy;; i = efj.Wx) {
      return localContext.getString(i, new Object[] { paramString });
    }
  }
  
  public final kxi a(Context paramContext)
  {
    return new kxi(paramContext);
  }
  
  public final lvh a()
  {
    return new kxt();
  }
  
  public final SpaceListItemView b(Context paramContext, ViewGroup paramViewGroup)
  {
    return (SpaceListItemView)LayoutInflater.from(paramContext).inflate(aau.Ca, paramViewGroup, false);
  }
  
  public final lvh b()
  {
    return new kxr();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kxu
 * JD-Core Version:    0.7.0.1
 */