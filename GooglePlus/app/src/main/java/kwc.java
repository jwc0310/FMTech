import android.util.Log;
import com.google.android.libraries.social.socialcast.impl.CastService;
import org.json.JSONException;
import org.json.JSONObject;

public final class kwc
  implements fqj
{
  public kwc(CastService paramCastService) {}
  
  public final void a(String paramString1, String paramString2)
  {
    if (Log.isLoggable("CastService", 3))
    {
      String str9 = String.valueOf(paramString2);
      if (str9.length() == 0) {
        break label85;
      }
      "onMessageReceived: ".concat(str9);
    }
    JSONObject localJSONObject;
    String str3;
    label85:
    String str1;
    try
    {
      for (;;)
      {
        localJSONObject = new JSONObject(paramString2);
        str3 = CastService.a(localJSONObject, "msg");
        if (str3 != null) {
          break label145;
        }
        if (Log.isLoggable("CastService", 5))
        {
          String str4 = String.valueOf(paramString2);
          if (str4.length() == 0) {
            break;
          }
          "Got unknown message from Chromecast. message: ".concat(str4);
        }
        return;
        new String("onMessageReceived: ");
      }
      new String("Got unknown message from Chromecast. message: ");
      return;
    }
    catch (JSONException localJSONException)
    {
      str1 = String.valueOf(paramString2);
      if (str1.length() == 0) {
        break label464;
      }
    }
    String str2 = "Error parsing JSON from Chromecast. message: ".concat(str1);
    label134:
    Log.e("CastService", str2, localJSONException);
    return;
    label145:
    String str7;
    String str8;
    if (str3.equals("state"))
    {
      this.a.r = localJSONObject.optBoolean("slideshow_is_playing", true);
      this.a.s = localJSONObject.optBoolean("card_has_next", true);
      this.a.t = localJSONObject.optBoolean("card_has_prev", true);
      this.a.u = localJSONObject.optBoolean("card_is_expandable", true);
      this.a.v = localJSONObject.optBoolean("card_is_expanded", false);
      String str6 = CastService.a(localJSONObject, "card_image_url");
      this.a.w = CastService.a(localJSONObject, "card_activity_id");
      str7 = CastService.a(localJSONObject, "previous_card_image_url");
      str8 = CastService.a(localJSONObject, "next_card_image_url");
      this.a.z = CastService.a(localJSONObject, "author_avatar");
      this.a.A = CastService.a(localJSONObject, "author_name");
      this.a.B = CastService.a(localJSONObject, "post_text");
      if (str6 != null) {
        CastService.a(this.a, str6);
      }
      if (str7 == null) {
        break label478;
      }
    }
    label464:
    label478:
    for (ipf localipf1 = ipf.a(this.a.getApplicationContext(), str7, ipm.a);; localipf1 = null)
    {
      ipf localipf2 = null;
      if (str8 != null) {
        localipf2 = ipf.a(this.a.getApplicationContext(), str8, ipm.a);
      }
      if (localipf1 != null) {
        this.a.g.b(localipf1, 2, 0);
      }
      if (localipf2 != null) {
        this.a.g.b(localipf2, 2, 0);
      }
      CastService.b(this.a);
      this.a.q = true;
      return;
      if (!str3.equals("auth")) {
        break;
      }
      String str5 = CastService.a(localJSONObject, "id");
      if ((str5 == null) || (!str5.equals(this.a.i))) {
        break;
      }
      CastService.c(this.a);
      return;
      str2 = new String("Error parsing JSON from Chromecast. message: ");
      break label134;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwc
 * JD-Core Version:    0.7.0.1
 */