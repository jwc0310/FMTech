import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import java.util.Map;
import org.json.JSONObject;

final class gyp
{
  float a;
  float b;
  JSONObject c;
  Map<String, Object> d;
  
  public gyp(Context paramContext, int paramInt, Map<String, Object> paramMap, float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat2;
    Object localObject;
    this.b = localObject;
    JSONObject localJSONObject = (JSONObject)paramContext.b.get(paramMap);
    if (localJSONObject == null)
    {
      localJSONObject = new JSONObject(gyo.a(paramInt, paramMap));
      paramContext.b.put(paramMap, localJSONObject);
    }
    this.c = localJSONObject;
    this.d = paramFloat1;
  }
  
  public final boolean a(Property<?, ?> paramProperty)
  {
    return ((this.a != -1.0F) || (paramProperty != gyt.a)) && ((this.b != -1.0F) || (paramProperty != gyt.b));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyp
 * JD-Core Version:    0.7.0.1
 */