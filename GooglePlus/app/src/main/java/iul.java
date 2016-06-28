import org.json.JSONException;
import org.json.JSONObject;

final class iul
{
  final String a;
  final String b;
  final boolean c;
  final String d;
  
  iul(String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean;
    this.d = paramString3;
  }
  
  public static String a(iur paramiur, String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("resumeUrl", paramString);
      localJSONObject.put("resumeFingerprint", paramiur.c.a());
      localJSONObject.put("resumeForceResize", paramiur.j);
      localJSONObject.put("resumeContentType", paramiur.a);
      String str = localJSONObject.toString();
      return str;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iul
 * JD-Core Version:    0.7.0.1
 */