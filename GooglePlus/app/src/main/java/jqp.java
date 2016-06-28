import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class jqp
  implements fqj
{
  public fqo a;
  ojx b;
  public boolean c;
  int d;
  int e;
  jqr f;
  fqg g;
  
  public jqp(fqg paramfqg, fqo paramfqo)
  {
    this.g = paramfqg;
    this.a = paramfqo;
    this.a.a(new fqp(this));
    paramfqg.a("urn:x-cast:com.google.cast.plusphotos", this);
  }
  
  private static String a(ojy[] paramArrayOfojy, int paramInt)
  {
    int i = paramArrayOfojy.length;
    for (int j = 0; j < i; j++)
    {
      ojy localojy = paramArrayOfojy[j];
      if (localojy.a.intValue() == paramInt) {
        return localojy.c;
      }
    }
    return null;
  }
  
  static JSONObject a(String paramString1, String paramString2, String paramString3)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("location", paramString3);
      localJSONObject.put("type", paramString2);
      localJSONObject.put("url", paramString1);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  private static JSONObject a(List<String> paramList)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("streams", new JSONArray(paramList));
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      String str = String.valueOf(paramList);
      Log.e("RemoteMediaController", 36 + String.valueOf(str).length() + "Error encoding customData for urls: " + str, localJSONException);
    }
    return localJSONObject;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (paramString1.equals("urn:x-cast:com.google.cast.plusphotos")) {}
    String str1;
    try
    {
      JSONObject localJSONObject1 = new JSONObject(paramString2);
      if ("newSession".equals(localJSONObject1.getString("name")))
      {
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("payload");
        this.d = localJSONObject2.getInt("windowWidth");
        this.e = localJSONObject2.getInt("windowHeight");
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      str1 = String.valueOf(paramString2);
      if (str1.length() == 0) {}
    }
    for (String str2 = "Error decoding message from receiver: ".concat(str1);; str2 = new String("Error decoding message from receiver: "))
    {
      Log.e("RemoteMediaController", str2, localJSONException);
      return;
    }
  }
  
  final void a(String paramString, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("name", paramString);
      localJSONObject.put("version", 1);
      if (paramJSONObject != null) {
        localJSONObject.put("payload", paramJSONObject);
      }
      this.g.a("urn:x-cast:com.google.cast.plusphotos", localJSONObject.toString(), new jqq(this, localJSONObject));
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void a(ojx paramojx)
  {
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt = { 37, 22, 18 };
    for (int i = 0; i < 3; i++)
    {
      int j = arrayOfInt[i];
      String str = a(paramojx.c, j);
      if (str != null) {
        localArrayList.add(str);
      }
    }
    this.a.a("video/mp4", a(localArrayList));
    this.b = paramojx;
    a(true);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean != this.c) {}
    for (int i = 1;; i = 0)
    {
      this.c = paramBoolean;
      if ((i != 0) && (this.f != null)) {
        this.f.k();
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqp
 * JD-Core Version:    0.7.0.1
 */