import android.content.Context;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class gwz
  implements gwv
{
  private static List<gxu> d;
  public final int a;
  public final gxr b;
  public String c;
  
  public gwz(int paramInt, gxr paramgxr)
  {
    this.a = paramInt;
    this.b = paramgxr;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    new gwz(paramInt, new gxr().a(paramContext)).b(paramContext);
  }
  
  public static void a(View paramView, int paramInt)
  {
    Context localContext = paramView.getContext();
    new gwz(paramInt, new gxr().a(paramView)).b(localContext);
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    if (this.c != null) {
      return this.c;
    }
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext)
  {
    if (d == null) {
      d = mbb.c(paramContext, gxu.class);
    }
    for (int i = 0; i < d.size(); i++) {
      ((gxu)d.get(i));
    }
  }
  
  public final void b(Context paramContext)
  {
    ((gww)mbb.a(paramContext, gww.class)).a(paramContext, this);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof gwz)) {}
    gwz localgwz;
    do
    {
      return false;
      localgwz = (gwz)paramObject;
    } while ((localgwz.a != this.a) || (!localgwz.b.equals(this.b)) || (!efj.c(this.c, localgwz.c)));
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.b;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b.toString();
    return String.format(localLocale, "UserEvent action: %d on: %s", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwz
 * JD-Core Version:    0.7.0.1
 */