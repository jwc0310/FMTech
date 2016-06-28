import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class kts
  implements ktu
{
  private static final Map<String, Integer> a;
  
  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("android.intent.action.VIEW", Integer.valueOf(1));
    localHashMap.put("android.intent.action.SEND", Integer.valueOf(2));
    localHashMap.put("android.intent.action.SEND_MULTIPLE", Integer.valueOf(3));
    localHashMap.put("android.intent.action.GET_CONTENT", Integer.valueOf(4));
    localHashMap.put("android.intent.action.PICK", Integer.valueOf(5));
    localHashMap.put("android.intent.action.EDIT", Integer.valueOf(6));
    localHashMap.put("com.android.camera.action.CROP", Integer.valueOf(7));
    localHashMap.put("com.android.camera.action.TRIM", Integer.valueOf(8));
    localHashMap.put("com.android.camera.action.REVIEW", Integer.valueOf(9));
    localHashMap.put("android.intent.action.SET_WALLPAPER", Integer.valueOf(10));
    localHashMap.put("android.intent.action.ATTACH_DATA", Integer.valueOf(11));
    a = Collections.unmodifiableMap(localHashMap);
  }
  
  public final boolean a(Intent paramIntent)
  {
    String str = paramIntent.getAction();
    return a.containsKey(str);
  }
  
  public final gxq b(Intent paramIntent)
  {
    String str = paramIntent.getAction();
    return new kup(pjp.a, ((Integer)a.get(str)).intValue());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kts
 * JD-Core Version:    0.7.0.1
 */