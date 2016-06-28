import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

final class aww
{
  final ArrayList<aws> a = new ArrayList();
  private final Context b;
  
  public aww(Context paramContext)
  {
    this.b = paramContext;
  }
  
  static boolean a(Object paramObject)
  {
    hye localhye;
    for (Object localObject = paramObject;; localObject = Double.valueOf(localhye.a / localhye.b))
    {
      if ((localObject instanceof String)) {
        return TextUtils.isEmpty((String)localObject);
      }
      if ((localObject instanceof Number)) {
        return ((Number)localObject).doubleValue() == 0.0D;
      }
      if ((localObject instanceof Boolean)) {
        return true;
      }
      if (!(localObject instanceof hye)) {
        break;
      }
      localhye = (hye)localObject;
    }
    if (localObject == null) {
      return true;
    }
    String str = String.valueOf(localObject);
    throw new IllegalArgumentException(20 + String.valueOf(str).length() + "Unknown object type=" + str);
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    if (!a(paramObject)) {
      this.a.add(new aws(this.b.getString(paramInt), paramObject.toString()));
    }
  }
  
  public final <T> void a(int paramInt, T paramT, awv<T> paramawv)
  {
    if (!a(paramT)) {
      a(paramInt, paramawv.a(paramT));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aww
 * JD-Core Version:    0.7.0.1
 */